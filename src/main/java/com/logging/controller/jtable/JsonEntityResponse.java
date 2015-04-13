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
 * {@link JsonEntityResponse} is responsible to represent response with record in Json format for JTable
 *
 * @author evgeniy.galinovskiy
 * @see VINNG-765
 * @since Jan 26, 2015
 */
public class JsonEntityResponse<T> extends JsonResponse {

  /**
   * Entity to be returned with result
   */
  private T entity;

  /**
   * Default constructor
   */
  public JsonEntityResponse() {
    // Default constructor
  }

  /**
   * Constructor with a {@link ResponseCode} as parameter
   * 
   * @param result
   *          string value of {@link ResponseCode}
   */
  public JsonEntityResponse(final String result) {
    setResult(result);
  }

  /**
   * Constructor with a {@link ResponseCode} and entity to be returned as parameters
   * 
   * @param result
   *          string value of {@link ResponseCode}
   * @param entity
   *          entity to be returned
   */
  public JsonEntityResponse(final String result, final T entity) {
    setResult(result);
    this.entity = entity;
  }

  /**
   * Constructor with a {@link ResponseCode} and string message to be returned as parameters
   * 
   * @param result
   *          string value of {@link ResponseCode}
   * @param message
   *          message to be returned
   */
  public JsonEntityResponse(final String result, final String message) {
    super(result, message);
  }

  /**
   * Returns entity to be returned with result
   * 
   * @return entity to be returned with result
   */
  @JsonProperty("Record")
  public T getEntity() {
    return entity;
  }

  /**
   * Sets entity to be returned with result
   * 
   * @param entity
   *          entity to be returned with result
   */
  public void setRecords(final T entity) {
    this.entity = entity;
  }
}
