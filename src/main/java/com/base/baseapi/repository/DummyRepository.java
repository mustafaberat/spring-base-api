package com.base.baseapi.repository;

import com.base.baseapi.dto.DummyObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<DummyObject, Integer> {
}
