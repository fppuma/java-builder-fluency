package org.example.builder.orange;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Phone {
  private String system;
  private String brandName;
  private String model;

}
