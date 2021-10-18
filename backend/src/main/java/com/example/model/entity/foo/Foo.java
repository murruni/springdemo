package com.example.model.entity.foo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.model.entity.bar.Bar;

import lombok.Data;

@Entity
@Table(name = "FOO")
@Data
public class Foo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToMany
	@JoinColumn(name = "foo_id")
	private Set<Bar> bars;

//	@ManyToMany
//	Set<Bar> bars;
}
