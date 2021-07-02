package com.awoyomi.FoodOrderAppSpringBoot.Repository;
import com.awoyomi.FoodOrderAppSpringBoot.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByEmail(String email);
}
