package com.cognizant.truyum.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@Column(name = "ct_id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "ct_us_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "ct_pr_id")
	private MenuItem menuItem;

	//@OneToMany(mappedBy = "cart")
	//private Set<MenuItem> menuItemList;
	
	
	//private BigDecimal total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	

	@Override
	public String toString() {
		return "Cart [id=" + id + ", user=" + user + ", menuItem=" + menuItem + "]";
	}

	
}
