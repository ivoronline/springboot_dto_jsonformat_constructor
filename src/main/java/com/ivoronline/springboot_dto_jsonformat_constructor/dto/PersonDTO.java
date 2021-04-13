package com.ivoronline.springboot_dto_jsonformat_constructor.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class PersonDTO {

  //PROPERTIES
  public LocalDate birthday;
  public String    name;

  //CONSTRUCTOR
  @JsonCreator
  public PersonDTO(@JsonFormat(pattern="dd.MM.yyyy") LocalDate birthday, String name) {
    this.birthday = birthday;
    this.name     = name;
  }

}
