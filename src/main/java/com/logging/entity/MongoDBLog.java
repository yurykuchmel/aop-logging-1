/*
 * Copyright ©, Audatex GmbH, Switzerland. This is UNPUBLISHED
 * PROPRIETARY SOURCE CODE of Audatex GmbH; the contents of this file
 * may not be disclosed to third parties, copied or duplicated in any form, in
 * whole or in part, without the prior written permission of Audatex 
 * GmbH. ALL RIGHTS RESERVED.
 */
package com.logging.entity;

import java.text.SimpleDateFormat;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Describe the type here.
 *
 * @author evgeny.meleshko
 * @see VINNG-
 * @since 9 Apr 2015
 */
@Document(collection = "aoplog")
public class MongoDBLog {

  @Field(value = "id")
  private String id;
  
  @Field(value = "time")
  private long time;
  
  @Field(value = "exec")
  private String exec;
  
  @Field(value = "action")
  private String action;
  
  @Field(value = "param")
  private String param;
  
  /**
   * @return the id
   */
  public String getId() {
    return id;
  }


  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * @return the time
   */
  public long getTime() {
    return time;
  }


  /**
   * @param time the time to set
   */
  public void setTime(long time) {
    this.time = time;
  }


  /**
   * @return the exec
   */
  public String getExec() {
    return exec;
  }


  /**
   * @param exec the exec to set
   */
  public void setExec(String exec) {
    this.exec = exec;
  }


  /**
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * @param action the action to set
   */
  public void setAction(String action) {
    this.action = action;
  }
  
  /**
   * @return the param
   */
  public String getParam() {
    return param;
  }


  /**
   * @param param the param to set
   */
  public void setParam(String param) {
    this.param = param;
  }
  
  @Override
  public String toString() {
    SimpleDateFormat df2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
    String time = df2.format(getTime());
    return "[id: '" + id + "', start_time: '" + time + "', param: '" + param + "', exec: '" + exec + "', action: '" + action + "']";
  }
}
