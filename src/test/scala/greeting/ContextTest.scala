package greeting

import greeting.controllers.HelloController
import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestContextManager
import org.springframework.test.context.junit4.SpringRunner

@RunWith(classOf[SpringRunner])
@SpringBootTest
class ContextTest extends FlatSpec {

  @Autowired
  val helloController: HelloController = null

  new TestContextManager(this.getClass).prepareTestInstance(this)

  "Context" should "auto wire dependencies" in {
    assert(helloController != null)
  }
}
