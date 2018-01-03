
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getCuzPixelVersion(){
        return SystemProperties.get("org.cuzpixel.version.display","");
    }
}
