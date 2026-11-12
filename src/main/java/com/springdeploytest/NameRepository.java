package com.springdeploytest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<NameEntry, Long> {
}
