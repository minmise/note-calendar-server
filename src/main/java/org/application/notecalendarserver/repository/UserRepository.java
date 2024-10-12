package org.application.notecalendarserver.repository;

import org.application.notecalendarserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
