package app.zpro.qr;

import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsSession;

public class MainActivity extends android.support.customtabs.trusted.LauncherActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected CustomTabsIntent getCustomTabsIntent(CustomTabsSession session) {
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(session);
        return builder.build();
    }
}
