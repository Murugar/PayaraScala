
package com.iqmsoft.payara.scala

import javax.json.JsonObject
import javax.json.Json
import javax.ws.rs._
import javax.ws.rs.core._

@ApplicationPath("api")
class TestApp extends Application

@Path("test")
class TestResource {

  @GET
  @Produces(Array(MediaType.APPLICATION_JSON))
  def test(@QueryParam("name") name: String): JsonObject = {
    return Json.createObjectBuilder()
      .add("msg", "Test Payara Micro Scala " + name)
      .build()
  }
}
