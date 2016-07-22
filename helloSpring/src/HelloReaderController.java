import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Peng on 2016/7/8.
 * HelloReaderController
 */
@Controller
public class HelloReaderController {
    @RequestMapping(value = "/hello")
    public ModelAndView sayHello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Hello Reader!");
        modelAndView.setViewName("helloReader");
        return modelAndView;
    }
}
