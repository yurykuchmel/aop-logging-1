/*
 * Copyright ©, Audatex GmbH, Switzerland. This is UNPUBLISHED
 * PROPRIETARY SOURCE CODE of Audatex GmbH; the contents of this file
 * may not be disclosed to third parties, copied or duplicated in any form, in
 * whole or in part, without the prior written permission of Audatex 
 * GmbH. ALL RIGHTS RESERVED.
 */
package com.logging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.logging.controller.jtable.JsonListResponse;
import com.logging.entity.MongoDBLog;
import com.logging.service.LogViewerService;

@RestController
public class LogViewerController {
  
  @Autowired
  private LogViewerService logViewerService;

  @RequestMapping(method = RequestMethod.GET)
  public String printWelcome() {
    return "index";
  }
  
  @RequestMapping(value = "viewLog", method = RequestMethod.GET)
  public ModelAndView displayPage() {
    ModelAndView model = new ModelAndView("main");
    return model;
  }

  @RequestMapping(value = "log/getLog", method = RequestMethod.GET)
  @ResponseBody
  public JsonListResponse<MongoDBLog> getLogs() {
    return logViewerService.getLogs("");
  }

}
