package edu.csu2017fa314.T30;
import edu.csu2017fa314.T30.Controller.LayoutController;

import java.sql.SQLException;

import static spark.Spark.*;


public class TripCo
{

   private String name = "";

   public String getName()
   {
      return name;
   }

   public String getMessage()
   {
      if (name == "")
      {
         return "Hello!";
      }
      else
      {
         return "Hello " + name + "!";
      }
   }

   public void setName(String name)
   {
      this.name = name;
   }


   static int getHerokuAssignedPort() {
      ProcessBuilder processBuilder = new ProcessBuilder();
      if (processBuilder.environment().get("PORT") != null) {
         return Integer.parseInt(processBuilder.environment().get("PORT"));
      }
      return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
   }


   public static void main(String[] args) throws SQLException {
    //  we need to explicitly instruct Spark to look in the public directory to locate all static files (like our images).
      staticFileLocation("/public");
      //configure port
      port(getHerokuAssignedPort());

      new LayoutController();

   }


}
