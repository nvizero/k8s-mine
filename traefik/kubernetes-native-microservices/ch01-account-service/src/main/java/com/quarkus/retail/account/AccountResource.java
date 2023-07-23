/**
 * @author laidingqing By CaiKong Network technology CO.,LTD
 * @create 2022-11-28 10:05
 * @desc
 **/
package com.quarkus.retail.account;

import javax.annotation.PostConstruct;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Path("/accounts")
public class AccountResource {

  Set<Account> accounts = new HashSet<>();

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Set<Account> allAccounts() {
    return accounts;
  }

  @GET
  @Path("/{accountNumber}")
  @Produces(MediaType.APPLICATION_JSON)
  public Account getAccount(@PathParam("accountNumber") Long accountNumber){
    Optional<Account> account = accounts.stream().filter(acct -> acct.getAccountNumber().equals(accountNumber)).findFirst();

    return  account.orElseThrow( () -> new WebApplicationException(String.format("Account with of %d does not exist.", accountNumber) ));
  }


  @PostConstruct
  public void setup(){
    accounts.add(new Account(1L, 1L, "Mary", BigDecimal.ZERO));
  }
}
