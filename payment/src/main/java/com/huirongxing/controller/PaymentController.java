package com.huirongxing.controller;

import java.net.InetAddress;

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
@RestController
@RequestMapping("/payment")
public class PaymentController {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * test.
   *
   * @return  ResponseEntity
   *
   * @throws  Exception  exception
   */
  @GetMapping("/test")
  public ResponseEntity<PaymentResponse> test() throws Exception {
    InetAddress addr     = InetAddress.getLocalHost();
    String      ip       = addr.getHostAddress().toString(); // 获取本机ip
    String      hostName = addr.getHostName().toString();    // 获取本机计算机名称

    return ResponseEntity.ok(new PaymentResponse("call payment test on ip:" + ip + "...host:" + hostName));
  }

}
