package com.redhat.demo.iotdemo.cloudService.kura;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KuraPayload {

   @SerializedName("topic")
   @Expose
   private String topic;
   @SerializedName("receivedOn")
   @Expose
   private String receivedOn;
   @SerializedName("payload")
   @Expose
   private Payload payload;
   @SerializedName("uuid")
   @Expose
   private String uuid;

   /**
    * No args constructor for use in serialization
    *
    */
   public KuraPayload() {
   }

   /**
    *
    * @param topic
    * @param receivedOn
    * @param payload
    * @param uuid
    */
   public KuraPayload(String topic, String receivedOn, Payload payload, String uuid) {
      this.topic = topic;
      this.receivedOn = receivedOn;
      this.payload = payload;
      this.uuid = uuid;
   }

   /**
    *
    * @return
    * The topic
    */
   public String getTopic() {
      return topic;
   }

   /**
    *
    * @param topic
    * The topic
    */
   public void setTopic(String topic) {
      this.topic = topic;
   }

   public KuraPayload withTopic(String topic) {
      this.topic = topic;
      return this;
   }

   /**
    *
    * @return
    * The receivedOn
    */
   public String getReceivedOn() {
      return receivedOn;
   }

   /**
    *
    * @param receivedOn
    * The receivedOn
    */
   public void setReceivedOn(String receivedOn) {
      this.receivedOn = receivedOn;
   }

   public KuraPayload withReceivedOn(String receivedOn) {
      this.receivedOn = receivedOn;
      return this;
   }

   /**
    *
    * @return
    * The payload
    */
   public Payload getPayload() {
      return payload;
   }

   /**
    *
    * @param payload
    * The payload
    */
   public void setPayload(Payload payload) {
      this.payload = payload;
   }

   public KuraPayload withPayload(Payload payload) {
      this.payload = payload;
      return this;
   }

   /**
    *
    * @return
    * The uuid
    */
   public String getUuid() {
      return uuid;
   }

   /**
    *
    * @param uuid
    * The uuid
    */
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   public KuraPayload withUuid(String uuid) {
      this.uuid = uuid;
      return this;
   }

}
