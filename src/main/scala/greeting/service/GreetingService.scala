package greeting.service

import org.springframework.stereotype.Service

@Service
class GreetingService {
  def hello(): String = "Greetings from Spring Boot!"
}
