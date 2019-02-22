package app.zpro.qr;

import android.content.res.Resources;
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
        Resources res = getResources();
        int primaryDarkColor = res.getColor(R.color.colorPrimaryDark);
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(session);
        builder.setToolbarColor(primaryDarkColor);
        return builder.build();
    }
}
