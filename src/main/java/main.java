import org.apache.log4j.BasicConfigurator;
import ua.lviv.lgs.domain.Product;
import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.service.ProductService;
import ua.lviv.lgs.service.UserService;
import ua.lviv.lgs.service.impl.ProductServiceImpl;
import ua.lviv.lgs.service.impl.UserServiceImpl;

public class main {
    public static void main(String[] args) {

        BasicConfigurator.configure();
         UserService userService = UserServiceImpl.getUserService();
        userService.create(new User("HP34@gmail.com","TOm", "Marvolo", "Redl", "3345" ));

        ProductService productService = ProductServiceImpl.getProductService();
        productService.create(new Product("name", "descript", 25.4));



    }
}
