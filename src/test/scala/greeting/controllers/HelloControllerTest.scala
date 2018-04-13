package greeting.controllers

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FlatSpec}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(classOf[SpringJUnit4ClassRunner])
@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
class HelloControllerTest extends FlatSpec with BeforeAndAfter {

  @Autowired
  var mockMvc: MockMvc = null

  "Hello Controller" should "give me greetings" in {
    val result = mockMvc.perform(get("/"))
      .andExpect(status().isOk())
      .andReturn()

    assert(result.getResponse.getContentAsString == "Greetings from Spring Boot!")
  }
}
