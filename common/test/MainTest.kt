import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `test if really random number`(){
        assertEquals(3, trulyRandomInt(), "The random number in our implementation should equal 3")
    }
}