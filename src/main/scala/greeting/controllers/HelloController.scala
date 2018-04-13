package greeting.controllers

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController {
  @RequestMapping(Array("/"))
  def index() = "Greetings from Spring Boot!"
}
