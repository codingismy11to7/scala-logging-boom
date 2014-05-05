package boom

import com.typesafe.scalalogging.slf4j.StrictLogging

/**
 * @author steven
 *
 */
class Child extends Parent with StrictLogging {
    override def overridden(): Unit = {
        logger info "this will work too"
    }

    def child() = {
        logger info "this will work"
    }
}
