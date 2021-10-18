package com.example.model.repository.foo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.entity.foo.Foo;

@Repository
public interface FooRepository extends JpaRepository<Foo, Long> {
	List<Foo> findByName(String name);
}
