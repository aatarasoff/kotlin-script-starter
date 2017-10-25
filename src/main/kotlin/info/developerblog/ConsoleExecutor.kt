package info.developerblog

import com.google.common.io.Resources.getResource
import javax.script.ScriptEngineManager

/**
 * @author aatarasoff
 */
fun main(args : Array<String>) {
    ScriptEngineManager().getEngineByExtension("kts")!!
            .eval(getResource("${args[0]}.kts").readText())
}