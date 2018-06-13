package example

import scala.concurrent.duration._
import scala.concurrent.{Future, Await}
import slick.driver.MySQLDriver.api._

object App {

  val db = Database.forConfig("db")

  def main(args: Array[String]): Unit = {
    val action = sql"select Time_zone_id from time_zone limit 1;".as[Int]
    val result = db.run(action)
    val r = Await.result(result, 1000 seconds)
    println(r)
  }
}
