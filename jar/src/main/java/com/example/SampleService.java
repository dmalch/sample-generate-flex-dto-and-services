package com.example;

import org.granite.messaging.service.annotations.IgnoredMethod;
import org.granite.messaging.service.annotations.Param;
import org.granite.messaging.service.annotations.RemoteDestination;

@RemoteDestination(id = "sampleService", channel = "amf")
public class SampleService {
    public final SampleDto sampleMethod1() {
        return new SampleDto();
    }

    public final String getSampleField1(@Param("sampleDto") final SampleDto sampleDto) {
        return sampleDto.getField1();
    }

    public final String getSampleField2(@Param("sampleDto") final SampleDto sampleDto) {
        return sampleDto.getField2();
    }

    @IgnoredMethod
    public final void ignoredMethod() {
    }
}
