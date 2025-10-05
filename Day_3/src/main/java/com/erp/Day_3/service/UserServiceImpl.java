package com.erp.Day_3.service;

import com.erp.Day_3.entity.User;
import com.erp.Day_3.exception.ResourceNotFoundException;
import com.erp.Day_3.repository.UserRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    @Cacheable(value = "users")
    public List<User> findAll() {
        return repo.findAll();
    }

    @Override
   @Cacheable(value = "user", key = "#id")
    public User findById(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
    }

    @Override
     @CacheEvict(value = {"users", "user"}, allEntries = true)
    public User save(User user) {
        return repo.save(user);
    }

    @Override
    @CacheEvict(value = {"users", "user"}, allEntries = true)
    public User update(Long id, User user) {
        User existing = findById(id);
        existing.setUsername(user.getUsername());
        existing.setEmail(user.getEmail());
        existing.setPassword(user.getPassword());
        existing.setRole(user.getRole());
        return repo.save(existing);
    }

    @Override
    @CacheEvict(value = {"users", "user"}, allEntries = true)
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
