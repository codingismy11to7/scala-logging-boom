package boom

import com.typesafe.scalalogging.slf4j.Logger
import org.slf4j.LoggerFactory

object Test extends App {
    if (args.length == 1 && args(0) == "simple") {
        val logger = Logger(LoggerFactory getLogger "Test")
        logger info "about to log with this logger cast as a com.typesafe.scalalogging.Logger"
        (logger: com.typesafe.scalalogging.Logger) info "boom"
    }

    val child = new Child

    child.child()
    child.overridden()
    child.parent()
}
