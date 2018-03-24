package eva;

import static spark.Spark.*;

import java.util.Date;

import spark.Request;
import spark.Response;
import spark.Route;

public class WebsiteMain {

  public static void main(String[] args) {
    staticFileLocation("/web");
    get("/date", new Route() {
      @Override
      public Object handle(Request request, Response response) throws Exception {
        return "Hello people! "+new Date();
      }
    });
  }
}
