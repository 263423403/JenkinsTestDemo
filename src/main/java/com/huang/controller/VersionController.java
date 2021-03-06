package com.huang.controller;

import com.huang.pojo.SoftwareVersion;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class VersionController {

  @GetMapping("/version")
  public SoftwareVersion getVersion() {
    SoftwareVersion softwareVersion = new SoftwareVersion();
    softwareVersion.setVersion("1.1");
    return softwareVersion;
  }
}
