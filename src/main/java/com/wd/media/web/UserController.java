package com.wd.media.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wd.media.model.User;
import com.wd.media.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;
    
    /**
     * save use before findName
     * @return
     */
    @GetMapping("/save")
    public User save() {
        User user = new User(2, "Tseng", 21);
        mongoTemplate.save(user);
 	//也可以使用Repository插入数据，userService.save(user)
        return user;
    }

    @GetMapping("/find")
    @ResponseBody
    public List<User> find() {
        List<User> userList = mongoTemplate.findAll(User.class);
        return userList;
    }

    /**
     * input String name "Tseng"
     * @param name
     * @return
     */
    @GetMapping("/findByName")
    @ResponseBody
    public User findByName(@RequestParam("name") String name) {
        User user = userService.findByName(name);        return user;    
        }
    
    @RequestMapping("/toindex")
    public String index(){
		 return "index";
    }
    
    @GetMapping("/JsonData")
    @ResponseBody
    public String getGridData(){
    	System.out.println("controller。。。jinlaile");
		 String jsondata = "{\"page\":\"1\"," + " \"total\":2," + " \"records\":\"13\"," + " \"rows\":" + " [" + " {" + " \"id\":\"13\"," + " \"cell\":" + " [\"13\",\"2007-10-06\",\"Client 3\",\"1000.00\",\"0.00\",\"1000.00\",null]" + " }," + " {" + " \"id\":\"12\"," + " \"cell\":" + " [\"12\",\"2007-10-06\",\"Client 2\",\"700.00\",\"140.00\",\"840.00\",null]" + " }," + " {" + " \"id\":\"11\"," + " \"cell\":" + " [\"11\",\"2007-10-06\",\"Client 1\",\"600.00\",\"120.00\",\"720.00\",null]" + " }," + " {" + " \"id\":\"10\"," + " \"cell\":" + " [\"10\",\"2007-10-06\",\"Client 2\",\"100.00\",\"20.00\",\"120.00\",null]" + " }," + " {" + " \"id\":\"9\"," + " \"cell\":" + " [\"9\",\"2007-10-06\",\"Client 1\",\"200.00\",\"40.00\",\"240.00\",null]" + " }," + " {" + " \"id\":\"8\"," + " \"cell\":" + " [\"8\",\"2007-10-06\",\"Client 3\",\"200.00\",\"0.00\",\"200.00\",null]" + " }," + " {" + " \"id\":\"7\"," + " \"cell\":" + " [\"7\",\"2007-10-05\",\"Client 2\",\"120.00\",\"12.00\",\"134.00\",null]" + " }," + " {" + " \"id\":\"6\"," + " \"cell\":" + " [\"6\",\"2007-10-05\",\"Client 1\",\"50.00\",\"10.00\",\"60.00\",\"\"]" + " }," + " {" + " \"id\":\"5\"," + " \"cell\":" + " [\"5\",\"2007-10-05\",\"Client 3\",\"100.00\",\"0.00\",\"100.00\",\"no tax at all\"]" + " }," + " {" + " \"id\":\"4\"," + " \"cell\":" + " [\"4\",\"2007-10-04\",\"Client 3\",\"150.00\",\"0.00\",\"150.00\",\"no tax\"]" + " }" + " ]," + " \"userdata\":{\"amount\":3220,\"tax\":342,\"total\":3564,\"name\":\"Totals:\"}" + " }"; 
		 return jsondata;
    }
    
    
}
