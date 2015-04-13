/*
 * Copyright �, Audatex GmbH, Switzerland. This is UNPUBLISHED
 * PROPRIETARY SOURCE CODE of Audatex GmbH; the contents of this file
 * may not be disclosed to third parties, copied or duplicated in any form, in
 * whole or in part, without the prior written permission of Audatex 
 * GmbH. ALL RIGHTS RESERVED.
 */
package com.logging.controller.jtable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@link JsonResponse} is responsible to represent response with result and message in Json format for JTable
 *
 * @author evgeniy.galinovskiy
 * @see VINNG-765
 * @since Jan 26, 2015
 */
public class JsonResponse {

  /**
   * Message to be returned
   */
  private String message;

  /**
   * Result of request. String value of {@link ResponseCode}
   */
  private String result;

  /**
   * Default constructor
   */
  public JsonResponse() {
    // Default constructor
  }

  /**
   * Constructor with a {@link ResponseCode} and string message to be returned as parameters
   * 
   * @param result
   *          string value of {@link ResponseCode}
   * @param message
   *          message to be returned
   */
  public JsonResponse(final String result, final String message) {
    this.result = result;
    this.message = message;
  }

  /**
   * Returns message to be returned on UI
   * 
   * @return the message to be returned on UI
   */
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  /**
   * Sets message to be returned on UI
   * 
   * @param message
   *          the message to be returned on UI
   */
  public void setMessage(final String message) {
    this.message = message;
  }

  /**
   * Returns request result value
   * 
   * @return the result request result value
   */
  @JsonProperty("Result")
  public String getResult() {
    return result;
  }

  /**
   * Sets request result value
   * 
   * @param result
   *          request result value
   */
  public void setResult(final String result) {
    this.result = result;
  }
}
