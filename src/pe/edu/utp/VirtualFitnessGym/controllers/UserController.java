package pe.edu.utp.VirtualFitnessGym.controllers;


import pe.edu.utp.VirtualFitnessGym.models.User;
import pe.edu.utp.VirtualFitnessGym.service.UserService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by GUILLERMO on 04/03/2017.
 */
@WebServlet(name = "UsersController", urlPatterns = "/user")
public class UserController extends BaseController  {//

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest("Post", request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest("Get", request, response);
    }

    private void processRequest(String method, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String url = "index.jsp";
        setEntityName("User");
        if(method.equals("Get") && action == null) { action = "index"; }
        if(method.equals("Post") && action.equalsIgnoreCase("index")) return; //post no muestra indice
        if(method.equals("Get") && action.equalsIgnoreCase("create")) return; // get si
        if(method.equals("Get") && action.equalsIgnoreCase("update")) return;

        UserService service = new UserService();
        service.setConnection(getConnection());
        /*
        // action = index
        if(action.equalsIgnoreCase("index")) {
            List<Country> countries = service.findAllCountries();
            request.setAttribute("countries", countries);
        }
        // action = show
        if(action.equalsIgnoreCase("show")) {
            String id = request.getParameter("id");
            request.setAttribute("country", service.findCountryById(id));
        }
        // action = new
        if(action.equalsIgnoreCase("new")) {
            request.setAttribute("regions", service.findAllRegions());
        }*/
        // action = create
        if(action.equalsIgnoreCase("create")) {
            String name = request.getParameter("name");
            String surname  = request.getParameter("surname");
            String sex  = request.getParameter("sex");
            String phone  = request.getParameter("phone");
            String rol  = request.getParameter("rol");

            User user = new User();
            user.setName(name);
            user.setSurname(surname);
            user.setSex(sex);
            user.setPhone(phone);
            user.setRol(rol);

            int idUser = service.creatUser( user);


            request.setAttribute("idUser", idUser);
        }/*
        // action = edit
        if(action.equalsIgnoreCase("edit")) {
            String id = request.getParameter("id");
            request.setAttribute("regions", service.findAllRegions());
            request.setAttribute("country", service.findCountryById(id));
        }

        // action = delete
        if(action.equalsIgnoreCase("delete")) {
            String id = request.getParameter("id");
            boolean result = service.deleteCountry(id);
            request.setAttribute("countries", service.findAllCountries());
        }
        // action = update
        if(action.equalsIgnoreCase("update")) {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            Region region = service.findRegionById(Integer.parseInt(request.getParameter("regionId")));
            boolean result = service.updateCountry(new Country(id, name, region));
            request.setAttribute("countries", service.findAllCountries());
        }*/
        request.getRequestDispatcher(getUrl(action)).forward(request, response);
    }

}
