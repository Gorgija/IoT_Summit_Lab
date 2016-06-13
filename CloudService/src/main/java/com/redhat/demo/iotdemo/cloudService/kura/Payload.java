package com.redhat.demo.iotdemo.cloudService.kura;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload {

   @SerializedName("sentOn")
   @Expose
   private String sentOn;
   @SerializedName("position")
   @Expose
   private Position position;
   @SerializedName("metrics")
   @Expose
   private Metrics metrics;
   @SerializedName("body")
   @Expose
   private String body;

   /**
    * No args constructor for use in serialization
    *
    */
   public Payload() {
   }

   /**
    *
    * @param position
    * @param body
    * @param metrics
    * @param sentOn
    */
   public Payload(String sentOn, Position position, Metrics metrics, String body) {
      this.sentOn = sentOn;
      this.position = position;
      this.metrics = metrics;
      this.body = body;
   }

   /**
    *
    * @return
    * The sentOn
    */
   public String getSentOn() {
      return sentOn;
   }

   /**
    *
    * @param sentOn
    * The sentOn
    */
   public void setSentOn(String sentOn) {
      this.sentOn = sentOn;
   }

   public Payload withSentOn(String sentOn) {
      this.sentOn = sentOn;
      return this;
   }

   /**
    *
    * @return
    * The position
    */
   public Position getPosition() {
      return position;
   }

   /**
    *
    * @param position
    * The position
    */
   public void setPosition(Position position) {
      this.position = position;
   }

   public Payload withPosition(Position position) {
      this.position = position;
      return this;
   }

   /**
    *
    * @return
    * The metrics
    */
   public Metrics getMetrics() {
      return metrics;
   }

   /**
    *
    * @param metrics
    * The metrics
    */
   public void setMetrics(Metrics metrics) {
      this.metrics = metrics;
   }

   public Payload withMetrics(Metrics metrics) {
      this.metrics = metrics;
      return this;
   }

   /**
    *
    * @return
    * The body
    */
   public String getBody() {
      return body;
   }

   /**
    *
    * @param body
    * The body
    */
   public void setBody(String body) {
      this.body = body;
   }

   public Payload withBody(String body) {
      this.body = body;
      return this;
   }

}
