package edu.csu2017fa314.T30.Controller;

import com.google.gson.Gson;
import edu.csu2017fa314.T30.Model.Itinerary.Data.DataService;
import org.apache.velocity.app.VelocityEngine;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import static spark.Spark.*;

public class LayoutController {

    VelocityEngine ve;
    Properties props;
    DataService myModel;
    Gson gson;


    public LayoutController() {


        ve = new VelocityEngine();
        props = new Properties();
        props.put("file.resource.loader.path", "C:/Users/aplus/Documents/GitHub/SpringBootStrap/T30-1.0/src/main/java/edu/csu2017fa314/T30/View/");
        ve.init(props);

      //  myModel = new DataService();
        gson = new Gson();

        // Creating a Root Path
        get("/", (request, response) -> {
           return "";
        });

    }




}
