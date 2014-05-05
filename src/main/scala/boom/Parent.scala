package boom

import com.typesafe.scalalogging.Logging

/**
 * @author steven
 *
 */
trait Parent extends Logging {
    def parent() = {
        logger info "boom"
    }

    def overridden() = {
        logger info "parent"
    }
}
