package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/myhelloworld")
    public String myhelloworld() {
    final Properties properties = new Properties();
	properties.load(this.getClass().getResourceAsStream("helloworld.properties"));
	String versionName = properties.getProperty("version");
	String artifactID = properties.getProperty("artifactId");
	return versionName+artifactID;
	}
}
