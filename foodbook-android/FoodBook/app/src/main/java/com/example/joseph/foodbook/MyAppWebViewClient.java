package com.example.joseph.foodbook;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;


//his method is called whenever the WebView tries to navigate to a different URL.
// If it returns false, the WebView opens the URL itself.
//The shouldOverrideUrlLoading method is called whenever the WebView is about to load a URL.
// This implementation checks for the String "html5rocks.com" at the end of the host name of the URL.
// If the string exists, the method returns false, which tells the platform not to override the URL, but to load it in the WebView.

public class MyAppWebViewClient extends WebViewClient {
    // change the endsWith
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("foodbook-6a17c.firebaseapp.com/home")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}