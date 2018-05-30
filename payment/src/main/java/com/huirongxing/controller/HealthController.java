package com.huirongxing.controller;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:Arvin.Wang@hrx.ai">Arvin Wang</a>
 * @version  05/25/2018 09:48
 */
@RequestMapping("/")
@RestController public class HealthController {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * test.
   *
   * @return  ResponseEntity
   *
   * @throws  Exception  exception
   */
  @GetMapping public ResponseEntity<Void> test() throws Exception {
    return ResponseEntity.ok().build();
  }

}
