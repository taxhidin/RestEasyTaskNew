import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;
import javax.inject.Inject;

@Path("/user")

public class UserController extends RestController {

    @Inject  SummaryService summaryService;

    @GET

    @Path("/getmethod")

    @Produces(MediaType.APPLICATION_JSON)
    public void getUsers(@Suspended AsyncResponse asyncResponse) {
        okReply(asyncResponse, summaryService.result());
    }

    @Inject User user;
    @POST
    @Path("/setmethod")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response ping() {
        user.setFirst(1);
        user.setSecond(2);
        user.setThird(3);
        user.setFourth(4);
        user.setFive(5);
        user.setSix(6);
        return okReply("Result is = "+ summaryService.result());


    }
}