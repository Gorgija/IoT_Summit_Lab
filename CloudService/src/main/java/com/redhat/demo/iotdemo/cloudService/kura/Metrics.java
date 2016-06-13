package com.redhat.demo.iotdemo.cloudService.kura;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Metrics {

   @SerializedName("metric")
   @Expose
   private List<Metric> metric = new ArrayList<Metric>();

   /**
    * No args constructor for use in serialization
    *
    */
   public Metrics() {
   }

   /**
    *
    * @param metric
    */
   public Metrics(List<Metric> metric) {
      this.metric = metric;
   }

   /**
    *
    * @return
    * The metric
    */
   public List<Metric> getMetric() {
      return metric;
   }

   /**
    *
    * @param metric
    * The metric
    */
   public void setMetric(List<Metric> metric) {
      this.metric = metric;
   }

   public Metrics withMetric(List<Metric> metric) {
      this.metric = metric;
      return this;
   }

}
