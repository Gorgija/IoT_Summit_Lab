
package com.redhat.demo.iotdemo.cloudService;

import com.redhat.demo.iotdemo.cloudService.kura.KuraPayload;
import com.redhat.demo.iotdemo.cloudService.kura.Metric;
import com.redhat.demo.iotdemo.cloudService.kura.Metrics;
import com.redhat.demo.iotdemo.cloudService.kura.Payload;
import org.apache.camel.Exchange;
import org.apache.camel.Handler;

import java.util.ArrayList;
import java.util.List;

public class EurotechTransformer {
	
	@Handler
    public void transform(String body,  Exchange exchange) throws Exception {
       List<Metric> metricList = new ArrayList<>();
       metricList.add(new Metric("Ambient", "double", "25.12345")); // type is one of string, double, int, float, long, boolean
       metricList.add(new Metric("Humidity", "float", "32.287501"));
       metricList.add(new Metric("Light", "double", "87.23"));

       KuraPayload payload = new KuraPayload()
             .withTopic("Red-Hat/ccustine-rhel72vm/summit-lab/test/sensor1")
             .withPayload(new Payload()
                   .withMetrics(new Metrics(metricList))
             );
       exchange.getIn().setBody(payload);
    }
}

