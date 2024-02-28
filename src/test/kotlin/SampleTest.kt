import kotlin.test.Test
import kotlin.test.assertEquals

internal class SampleTest {

    private val testSample: Sample = Sample()

    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }

    @Test
    fun testSubtract() {
        val expected = 38
        assertEquals(expected, testSample.subtract(40, 2))
    }
}