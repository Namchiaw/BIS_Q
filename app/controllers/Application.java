package controllers;

        import play.*;
        import play.mvc.*;

        import views.html.*;

public class Application extends Controller {

    public static Result index() {return ok(Home.render());}
    public static Result main() {return ok(main.render());}
    public static Result home_watch() {return ok(home_watch.render());}

}
