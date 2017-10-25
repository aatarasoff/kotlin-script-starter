package info.developerblog

import org.jetbrains.kotlin.utils.doNothing
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

/**
 * @author aatarasoff
 */
object ConsoleExecutorSpek : Spek ({
    describe("Script Execution") {

        on("execute") {
            main(arrayOf("test"))

            it ("should not throw any error") {
                doNothing<Unit>()
            }
        }
    }
})
