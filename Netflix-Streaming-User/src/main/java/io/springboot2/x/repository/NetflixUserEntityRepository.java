package io.springboot2.x.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springboot2.x.entity.NetflixUserEntity;

public interface NetflixUserEntityRepository extends JpaRepository<NetflixUserEntity, String> {

}
