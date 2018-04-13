package greeting.controllers

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestContextManager
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(classOf[SpringRunner])
@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest extends FlatSpec {

  @Autowired
  val mockMvc: MockMvc = null

  new TestContextManager(this.getClass).prepareTestInstance(this)

  "Hello Controller" should "give me greetings" in {
    val result = mockMvc.perform(get("/"))
      .andExpect(status().isOk())
      .andReturn()

    assert(result.getResponse.getContentAsString == "Greetings from Spring Boot!")
  }
}
