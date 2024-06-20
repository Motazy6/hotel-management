package com.example.test1.repository;


import com.example.test1.Model.Entity.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FloorRepository extends JpaRepository<Floor, Integer> {
}