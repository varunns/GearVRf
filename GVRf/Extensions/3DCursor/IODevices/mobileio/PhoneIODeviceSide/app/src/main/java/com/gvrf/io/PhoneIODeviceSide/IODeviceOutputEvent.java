/*
 * Copyright 2015 Samsung Electronics Co., LTD
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.gvrf.io.PhoneIODeviceSide;

/**
 * Created by v.nidamarthy on 10/26/16.
 * Class that defines interface that is a listener(on IODevice side) to events received from VR device
 * Implement the interface on the IO device side to use it
 */
public class IODeviceOutputEvent {
    private IODeviceOutputEventListener listener;

    public IODeviceOutputEvent()
    {
        this.listener = null;
    }
    public void setIODeviceOutputEventListener(IODeviceOutputEventListener listener)
    {
        this.listener = listener;
    }
    // Define the implementation of the outpuEventCallback method
    public interface IODeviceOutputEventListener {
        // These methods are the different events and
        // need to pass relevant arguments related to the event triggered
        public void outputEventCallback(byte[] bytes);

    }
}
