package org.as.awesome.external.tile;

import android.os.Build;
import androidx.annotation.RequiresApi;

import com.stardust.view.accessibility.NodeInfo;

import org.as.awesome.ui.floating.FullScreenFloatyWindow;
import org.as.awesome.ui.floating.layoutinspector.LayoutBoundsFloatyWindow;

@RequiresApi(api = Build.VERSION_CODES.N)
public class LayoutBoundsTile extends LayoutInspectTileService {
    @Override
    protected FullScreenFloatyWindow onCreateWindow(NodeInfo capture) {
        return new LayoutBoundsFloatyWindow(capture) {
            @Override
            public void close() {
                super.close();
                inactive();
            }
        };
    }
}
