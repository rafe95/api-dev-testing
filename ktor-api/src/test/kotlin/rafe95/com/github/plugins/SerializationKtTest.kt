package rafe95.com.github.plugins;

import io.ktor.client.request.*
import io.ktor.server.testing.*
import kotlin.test.Test

class SerializationKtTest {

    @Test
    fun testGetJsonKotlinxserialization() = testApplication {
        application {
            configureSerialization()
        }
        client.get("/json/kotlinx-serialization").apply {

        }
    }
}