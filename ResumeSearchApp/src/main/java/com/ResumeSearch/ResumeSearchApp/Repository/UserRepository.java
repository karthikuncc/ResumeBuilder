package com.ResumeSearch.ResumeSearchApp.Repository;

import com.ResumeSearch.ResumeSearchApp.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
}
