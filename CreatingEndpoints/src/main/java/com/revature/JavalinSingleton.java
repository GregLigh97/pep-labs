package com.revature;

import io.javalin.Javalin;

public class JavalinSingleton {

    
    /**
     * Lab: Create an HTTP GET endpoint at the url: http://localhost:9000/hello that will return the string "Hello
     * World" in the response.
     * 
     * Note: Please refer to the "CreatingEndpoints.MD" file for more assistance if needed.
     */
    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        app.start(9000);
        app.get("/get-request", ctx -> 
        app.post("/post-request", ctx -> 
        ctx.result("get request endpoint hit!");
        return "Hello World";
      };
    }
       }
