package com.huirongxing.controller;

/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:Arvin.Wang@hrx.ai">Arvin Wang</a>
 * @version  05/25/2018 09:48
 */
public class UserResponse {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String message;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new PaymentResponse object.
   */
  public UserResponse() { }

  /**
   * Creates a new PaymentResponse object.
   *
   * @param  message  String
   */
  public UserResponse(String message) {
    this.message = message;
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for message.
   *
   * @return  String
   */
  public String getMessage() {
    return message;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for message.
   *
   * @param  message  String
   */
  public void setMessage(String message) {
    this.message = message;
  }
} // end class PaymentResponse
