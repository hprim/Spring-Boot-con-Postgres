package org.adaschool.datapostgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.adaschool.datapostgres.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
