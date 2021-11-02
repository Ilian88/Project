package com.example.healthy_way.repository;

import com.example.healthy_way.model.entity.RoleEntity;
import com.example.healthy_way.model.enums.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Long> {

    RoleEntity findByRole (RoleEnum roleEnum);


}
