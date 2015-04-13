/*
 * Copyright �, Audatex GmbH, Switzerland. This is UNPUBLISHED
 * PROPRIETARY SOURCE CODE of Audatex GmbH; the contents of this file
 * may not be disclosed to third parties, copied or duplicated in any form, in
 * whole or in part, without the prior written permission of Audatex 
 * GmbH. ALL RIGHTS RESERVED.
 */
package com.logging.controller.jtable;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@link JsonEntityResponse} is responsible to represent response with list of records in Json format for JTable
 *
 * @author evgeniy.galinovskiy
 * @see VINNG-765
 * @since Jan 26, 2015
 */
public class JsonListResponse<T> extends JsonResponse {

  /**
   * List of entities to be returned with result
   */
  private List<T> records;

  /**
   * Total count of records (not the size of records list!)
   */
  private int totalRecordCount;

  /**
   * Constructor with a {@link ResponseCode}, list of entities to be returned and total record count as parameters
   * 
   * @param result
   *          string value of {@link ResponseCode}
   * @param records
   *          list of entities to be returned
   * @param totalRecordCount
   *          Total count of records (not the size of records list!)
   */
  public JsonListResponse(final String result, final List<T> records, final int totalRecordCount) {
    setResult(result);
    this.records = records;
    this.totalRecordCount = totalRecordCount;
  }

  /**
   * Constructor with a {@link ResponseCode} and string message to be returned as parameters
   * 
   * @param result
   *          string value of {@link ResponseCode}
   * @param message
   *          message to be returned
   */
  public JsonListResponse(final String result, final String message) {
    super(result, message);
  }

  /**
   * Returns list of entities to be returned with result
   * 
   * @return list of entities to be returned with result
   */
  @JsonProperty("Records")
  public List<T> getRecords() {
    return records;
  }

  /**
   * Sets list of entity to be returned with result
   * 
   * @param records
   *          list of entities to be returned with result
   */
  public void setRecords(final List<T> records) {
    this.records = records;
  }

  /**
   * Returns total count of records (not the size of records list!)
   * 
   * @return total count of records (not the size of records list!)
   */
  @JsonProperty("TotalRecordCount")
  public int getTotalRecordCount() {
    return totalRecordCount;
  }

  /**
   * Sets total count of records (not the size of records list!)
   * 
   * @param totalRecordCount
   *          total count of records (not the size of records list!)
   */
  public void setTotalRecordCount(final int totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }

}
