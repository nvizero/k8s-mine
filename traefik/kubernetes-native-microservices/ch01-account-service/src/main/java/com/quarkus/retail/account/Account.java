/**
 * @author laidingqing By CaiKong Network technology CO.,LTD
 * @create 2022-11-28 10:04
 * @desc
 **/
package com.quarkus.retail.account;

import java.math.BigDecimal;

public class Account {

  public Long accountNumber;
  public Long customerNumber;
  public String customerName;
  public BigDecimal balance;

  public Account(Long accountNumber, Long customerNumber, String customerName, BigDecimal balance) {
    this.accountNumber = accountNumber;
    this.customerNumber = customerNumber;
    this.customerName = customerName;
    this.balance = balance;
  }

  public Long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Long getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(Long customerNumber) {
    this.customerNumber = customerNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
}
