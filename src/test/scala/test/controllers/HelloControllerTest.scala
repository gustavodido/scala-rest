package test.controllers

import org.junit.Test
import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FlatSpec}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@RunWith(classOf[SpringJUnit4ClassRunner])
@WebAppConfiguration
@Test
class HelloControllerTest extends FlatSpec with BeforeAndAfter {

  @Autowired
  val webApplicationContext: WebApplicationContext = null
  var mockMvc: MockMvc = _

  before {
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build()
  }

  "Hello Controller" should "give me greetings" in {
    val result = mockMvc.perform(get("/test.html"))
      .andExpect(status().isOk())
      .andReturn()

    assert(result.getResponse.getContentAsString == "Greetings from Spring Boot!")
  }
}
