package com.github.amura

import org.slf4j.LoggerFactory

/**
  * Created by amura on 3/24/17.
  */
object Main extends App{
  val log = LoggerFactory.getLogger(Main.getClass)

  val possibleResponse = Array(200, 400, 500)

  while(true){
    val idx = (Math.random() * 3).toInt
    val msg = possibleResponse(idx)
    log.info(s"$msg")

    Thread.sleep((Math.random * 3000).toInt)
  }
}
