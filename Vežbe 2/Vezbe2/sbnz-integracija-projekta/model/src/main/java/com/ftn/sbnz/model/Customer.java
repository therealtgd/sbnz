package com.ftn.sbnz.model;

import java.io.Serializable;

public class Customer implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private Long id;
  private Double balance;

  public Customer() {}

  public Customer(Double balance) {
    this(null, balance)
  }

  public Customer(Long id, Double balance) {
    this.id = id;
    this.balance = balance;
  }
}
