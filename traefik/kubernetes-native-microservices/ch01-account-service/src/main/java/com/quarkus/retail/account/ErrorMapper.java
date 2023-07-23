/**
 * @author laidingqing By CaiKong Network technology CO.,LTD
 * @create 2022-11-28 10:22
 * @desc
 **/
package com.quarkus.retail.account;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ErrorMapper implements ExceptionMapper<Exception> {

  @Override
  public Response toResponse(Exception exception) {

    int code = 500;
    if (exception instanceof WebApplicationException) {
      code = ((WebApplicationException) exception).getResponse().getStatus();
    }

    JsonObjectBuilder entityBuilder = Json.createObjectBuilder()
      .add("exceptionType", exception.getClass().getName())
      .add("code", code);

    if (exception.getMessage() != null) {
      entityBuilder.add("error", exception.getMessage());
    }

    return Response.status(code)
      .entity(entityBuilder.build())
      .build();
  }
}
