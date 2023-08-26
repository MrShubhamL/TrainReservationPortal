package com.reservation.repository;

import com.reservation.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    @Query("select a from Admin a where a.emailID = :emailID")
    public Admin getAdminByUsername(@Param("emailID") String emailID);

    public boolean existsByEmailID(String email);

}
