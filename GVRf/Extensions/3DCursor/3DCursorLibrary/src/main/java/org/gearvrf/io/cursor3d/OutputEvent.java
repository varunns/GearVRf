package org.gearvrf.io.cursor3d;

/**
 * An output event that is created in the Android application and sent to an {@link IoDevice}.
 * (e.g. ACTION_VIBRATE)
 */
public class OutputEvent{

    int m_action;
    Object m_value;

    /**
     * @param action   The action which we want the {@link IoDevice} to do
     * @param value   A parameter for this action (i.e. the length of the action)
     */
    public OutputEvent(int action, Object value) {
        m_action = action;
        m_value = value;
    }

}

// implement it like the code of android.os.bundle so the action and the type of value can be
// different (int, float, etc) with putInt putBoolean etc
// Look at http://grepcode.com/file/repository.grepcode.com/java/ext/com.google.android/android/4.4.2_r1/android/os/Bundle.java#Bundle.0mMap if needed

=========

// In IoDevice.java implement
// handleEvent(outputEvent) (interface function that has to be inplemented in the iodevice)
// See how it's done for the input devices


========
// In the code of the io device (like the phone, in the code that Varun develops) implement:

// Have a list of actions (e.g. ACTION_VIBRATE and ACTION_LOCK in phone, or ACTION_TRIGER in when the gun is trigerred in Phasespace)
// OutputEvent doesn't need to know anything about the type of the events

// handleEvent(outputEvent oe) {
// switch (oe.action) {
//     case ACTION_VIBRATE:
//         api.vibrate(oe.value);
//        }
//
//  The event comes is in the main thread, but the action may have to be implemented in the thread of the io device
//

==============

// In the application:
// OutputEvent outputEvent = new OutputEvent(ACTION_VIBRATE, 10);
// ioDevice.handleEvent(outputEvent);