package test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootScalaApplication {
}

object SpringBootScalaApplication extends App {
  SpringApplication.run(classOf[SpringBootScalaApplication], args: _*)
}
