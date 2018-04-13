package greeting.controllers

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FlatSpec}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(classOf[SpringRunner])
@SpringBootTest
class HelloControllerTest extends FlatSpec with BeforeAndAfter {

  @Autowired
  var mockMvc: MockMvc = null

  "Hello Controller" should "give me greetings" in {
    assert(mockMvc != null)

    val result = mockMvc.perform(get("/"))
      .andExpect(status().isOk())
      .andReturn()

    assert(result.getResponse.getContentAsString == "Greetings from Spring Boot!")
  }
}
