package com.redhat.demo.iotdemo.cloudService.kura;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metric {

   @SerializedName("name")
   @Expose
   private String name;
   @SerializedName("type")
   @Expose
   private String type;
   @SerializedName("value")
   @Expose
   private String value;

   /**
    * No args constructor for use in serialization
    *
    */
   public Metric() {
   }

   /**
    *
    * @param name
    * @param value
    * @param type
    */
   public Metric(String name, String type, String value) {
      this.name = name;
      this.type = type;
      this.value = value;
   }

   /**
    *
    * @return
    * The name
    */
   public String getName() {
      return name;
   }

   /**
    *
    * @param name
    * The name
    */
   public void setName(String name) {
      this.name = name;
   }

   public Metric withName(String name) {
      this.name = name;
      return this;
   }

   /**
    *
    * @return
    * The type
    */
   public String getType() {
      return type;
   }

   /**
    *
    * @param type
    * The type
    */
   public void setType(String type) {
      this.type = type;
   }

   public Metric withType(String type) {
      this.type = type;
      return this;
   }

   /**
    *
    * @return
    * The value
    */
   public String getValue() {
      return value;
   }

   /**
    *
    * @param value
    * The value
    */
   public void setValue(String value) {
      this.value = value;
   }

   public Metric withValue(String value) {
      this.value = value;
      return this;
   }

}
