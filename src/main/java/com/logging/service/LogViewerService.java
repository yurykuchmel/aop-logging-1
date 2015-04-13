/*
 * Copyright ©, Audatex GmbH, Switzerland. This is UNPUBLISHED
 * PROPRIETARY SOURCE CODE of Audatex GmbH; the contents of this file
 * may not be disclosed to third parties, copied or duplicated in any form, in
 * whole or in part, without the prior written permission of Audatex 
 * GmbH. ALL RIGHTS RESERVED.
 */
package com.logging.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.logging.config.SpringMongoConfig;
import com.logging.controller.jtable.JsonListResponse;
import com.logging.entity.MongoDBLog;

/**
 * Describe the type here.
 *
 * @author evgeny.meleshko
 * @see VINNG-
 * @since 9 Apr 2015
 */
@Service
public class LogViewerService {

  public JsonListResponse<MongoDBLog> getLogs(String strQuery) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

    if (StringUtils.isEmpty(strQuery)) {
      strQuery = "{}";
    }
    BasicQuery query = new BasicQuery(strQuery);
    List<MongoDBLog> mongoDBLogList = mongoOperation.find(query, MongoDBLog.class);
    return new JsonListResponse<MongoDBLog>("OK", mongoDBLogList, mongoDBLogList.size());
  }
}
