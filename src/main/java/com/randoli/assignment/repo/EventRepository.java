package com.randoli.assignment.repo;

import com.randoli.assignment.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EventRepository extends JpaRepository <Event, UUID> {
}
