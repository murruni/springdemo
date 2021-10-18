package com.example.model.entity.bar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.model.entity.foo.Foo;

import lombok.Data;

@Entity
@Table(name = "BAR")
@Data
public class Bar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "foo_id", insertable = false, updatable = false)
	private Foo foo;

	@ManyToOne
	@JoinColumn(name = "parent_bar_id")
	private Bar parentBar;

}
