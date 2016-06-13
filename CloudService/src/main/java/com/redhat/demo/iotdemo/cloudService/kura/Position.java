package com.redhat.demo.iotdemo.cloudService.kura;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Position {

   @SerializedName("longitude")
   @Expose
   private int longitude;
   @SerializedName("latitude")
   @Expose
   private int latitude;
   @SerializedName("altitude")
   @Expose
   private int altitude;
   @SerializedName("precision")
   @Expose
   private int precision;
   @SerializedName("heading")
   @Expose
   private int heading;
   @SerializedName("speed")
   @Expose
   private int speed;
   @SerializedName("timestamp")
   @Expose
   private String timestamp;
   @SerializedName("satellites")
   @Expose
   private int satellites;
   @SerializedName("status")
   @Expose
   private int status;

   /**
    * No args constructor for use in serialization
    *
    */
   public Position() {
   }

   /**
    *
    * @param timestamp
    * @param precision
    * @param status
    * @param speed
    * @param altitude
    * @param longitude
    * @param latitude
    * @param satellites
    * @param heading
    */
   public Position(int longitude, int latitude, int altitude, int precision, int heading, int speed, String timestamp, int satellites, int status) {
      this.longitude = longitude;
      this.latitude = latitude;
      this.altitude = altitude;
      this.precision = precision;
      this.heading = heading;
      this.speed = speed;
      this.timestamp = timestamp;
      this.satellites = satellites;
      this.status = status;
   }

   /**
    *
    * @return
    * The longitude
    */
   public int getLongitude() {
      return longitude;
   }

   /**
    *
    * @param longitude
    * The longitude
    */
   public void setLongitude(int longitude) {
      this.longitude = longitude;
   }

   public Position withLongitude(int longitude) {
      this.longitude = longitude;
      return this;
   }

   /**
    *
    * @return
    * The latitude
    */
   public int getLatitude() {
      return latitude;
   }

   /**
    *
    * @param latitude
    * The latitude
    */
   public void setLatitude(int latitude) {
      this.latitude = latitude;
   }

   public Position withLatitude(int latitude) {
      this.latitude = latitude;
      return this;
   }

   /**
    *
    * @return
    * The altitude
    */
   public int getAltitude() {
      return altitude;
   }

   /**
    *
    * @param altitude
    * The altitude
    */
   public void setAltitude(int altitude) {
      this.altitude = altitude;
   }

   public Position withAltitude(int altitude) {
      this.altitude = altitude;
      return this;
   }

   /**
    *
    * @return
    * The precision
    */
   public int getPrecision() {
      return precision;
   }

   /**
    *
    * @param precision
    * The precision
    */
   public void setPrecision(int precision) {
      this.precision = precision;
   }

   public Position withPrecision(int precision) {
      this.precision = precision;
      return this;
   }

   /**
    *
    * @return
    * The heading
    */
   public int getHeading() {
      return heading;
   }

   /**
    *
    * @param heading
    * The heading
    */
   public void setHeading(int heading) {
      this.heading = heading;
   }

   public Position withHeading(int heading) {
      this.heading = heading;
      return this;
   }

   /**
    *
    * @return
    * The speed
    */
   public int getSpeed() {
      return speed;
   }

   /**
    *
    * @param speed
    * The speed
    */
   public void setSpeed(int speed) {
      this.speed = speed;
   }

   public Position withSpeed(int speed) {
      this.speed = speed;
      return this;
   }

   /**
    *
    * @return
    * The timestamp
    */
   public String getTimestamp() {
      return timestamp;
   }

   /**
    *
    * @param timestamp
    * The timestamp
    */
   public void setTimestamp(String timestamp) {
      this.timestamp = timestamp;
   }

   public Position withTimestamp(String timestamp) {
      this.timestamp = timestamp;
      return this;
   }

   /**
    *
    * @return
    * The satellites
    */
   public int getSatellites() {
      return satellites;
   }

   /**
    *
    * @param satellites
    * The satellites
    */
   public void setSatellites(int satellites) {
      this.satellites = satellites;
   }

   public Position withSatellites(int satellites) {
      this.satellites = satellites;
      return this;
   }

   /**
    *
    * @return
    * The status
    */
   public int getStatus() {
      return status;
   }

   /**
    *
    * @param status
    * The status
    */
   public void setStatus(int status) {
      this.status = status;
   }

   public Position withStatus(int status) {
      this.status = status;
      return this;
   }

}
