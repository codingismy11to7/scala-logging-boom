scala-logging-boom
==================
    steven@lappy386:/t/scala-logging-boom (master)                                                                                                          
    ↪ sbt
    [info] Set current project to scala-logging-boom (in build file:/private/tmp/scala-logging-boom/)
    > run simple
    [info] Running boom.Test simple
    12:07:31.918 [run-main-0] INFO  Test - about to log with this logger cast as a com.typesafe.scalalogging.Logger
    [error] (run-main-0) scala.NotImplementedError: an implementation is missing
    scala.NotImplementedError: an implementation is missing
	    at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
	    at com.typesafe.scalalogging.BaseLogger.info(Logger.scala:95)
    
    
    > run
    [info] Running boom.Test 
    12:09:23.433 [run-main-2] INFO  boom.Child - this will work
    12:09:23.435 [run-main-2] INFO  boom.Child - this will work too
    [error] (run-main-2) scala.NotImplementedError: an implementation is missing
    scala.NotImplementedError: an implementation is missing
	    at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
	    at com.typesafe.scalalogging.BaseLogger.info(Logger.scala:95)
