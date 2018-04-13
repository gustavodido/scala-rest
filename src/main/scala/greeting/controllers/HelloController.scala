package greeting.controllers

import greeting.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController {
  @Autowired
  val service: GreetingService = null

  @RequestMapping(Array("/"))
  def index() = service.hello()
}
