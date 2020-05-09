package org.as.awesome.external.fileprovider;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;

import java.io.File;

public class AppFileProvider extends FileProvider {

    public static final String AUTHORITY = "org.as.awesome.fileprovider";

    public static Uri getUriForFile(Context context, File file){
        return FileProvider.getUriForFile(context, AUTHORITY, file);
    }
}
