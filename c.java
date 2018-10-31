package com.danny.zxing.decoding;

/**
 * @description
 * @author danny
 * @date 2018/10/24.
 */

public final class Intents {
    private Intents() {}

    /**
     * Constants related to the {@link Scan#ACTION} Intent.
     */
    public static final class Scan {
        /**
         * Send this intent to open the Barcodes app in scanning mode, find a barcode, and return
         * the results.
         */
        public static final String ACTION = "com.google.zxing.client.android.SCAN";

        /**
         * By default, sending this will decode all barcodes that we understand. However it
         * may be useful to limit scanning to certain formats. Use
         * {@link android.content.Intent#putExtra(String, String)} with one of the values below.
         *
         * Setting this is effectively shorthand for setting explicit formats with {@link #SCAN_FORMATS}.
         * It is overridden by that setting.
         */
        public static final String MODE = "SCAN_MODE";

        /**
         * Decode only UPC and EAN barcodes. This is the right choice for shopping apps which get
         * prices, reviews, etc. for products.
         */
        public static final String PRODUCT_MODE = "PRODUCT_MODE";

        /**
         * Decode only 1D barcodes.
         */
        public static final String ONE_D_MODE = "ONE_D_MODE";

        /**
         * Decode only QR codes.
         */
        public static final String QR_CODE_MODE = "QR_CODE_MODE";

        /**
         * Decode only Data Matrix codes.
         */
        public static final String DATA_MATRIX_MODE = "DATA_MATRIX_MODE";

        /**
         * Comma-separated list of formats to scan for. The values must match the names of
         * {@link com.google.zxing.BarcodeFormat}s, e.g. {@link com.google.zxing.BarcodeFormat#EAN_13}.
         * Example: "EAN_13,EAN_8,QR_CODE". This overrides {@link #MODE}.
         */
        public static final String SCAN_FORMATS = "SCAN_FORMATS";

        /**
         * @see com.google.zxing.DecodeHintType#CHARACTER_SET
         */
        public static final String CHARACTER_SET = "CHARACTER_SET";

        /**
         * If a barcode is found, Barcodes returns {@link android.app.Activity#RESULT_OK} to
         * {@link android.app.Activity#onActivityResult(int, int, android.content.Intent)}
         * of the app which requested the scan via
         * {@link android.app.Activity#startActivityForResult(android.content.Intent, int)}
         * The barcodes contents can be retrieved with
         * {@link android.content.Intent#getStringExtra(String)}.
         * If the user presses Back, the result code will be {@link android.app.Activity#RESULT_CANCELED}.
         */
        public static final String RESULT = "SCAN_RESULT";

        /**
         * Call {@link android.content.Intent#getStringExtra(String)} with {@link #RESULT_FORMAT}
         * to determine which barcode format was found.
         * See {@link com.google.zxing.BarcodeFormat} for possible values.
         */
        public static final String RESULT_FORMAT = "SCAN_RESULT_FORMAT";

        /**
         * Setting this to false will not save scanned codes in the history. Specified as a {@code boolean}.
         */
        public static final String SAVE_HISTORY = "SAVE_HISTORY";

        private Scan() {}
    }

    /**
     * Constants related to the {@link Encode#ACTION} Intent.
     */
    public static final class Encode {
        /**
         * Send this intent to encode a piece of data as a QR code and display it full screen, so
         * that another person can scan the barcode from your screen.
         */
        public static final String ACTION = "com.google.zxing.client.android.ENCODE";

        /**
         * The data to encode. Use {@link android.content.Intent#putExtra(String, String)} or
         * {@link android.content.Intent#putExtra(String, android.os.Bundle)},
         * depending on the type and format specified. Non-QR Code formats should
         * just use a String here. For QR Code, see Contents for details.
         */
        public static final String DATA = "ENCODE_DATA";

        /**
         * The type of data being supplied if the format is QR Code. Use
         * {@link android.content.Intent#putExtra(String, String)} with one of {@link Contents.Type}.
         */
        public static final String TYPE = "ENCODE_TYPE";

        /**
         * The barcode format to be displayed. If this isn't specified or is blank,
         * it defaults to QR Code. Use {@link android.content.Intent#putExtra(String, String)}, where
         * format is one of {@link com.google.zxing.BarcodeFormat}.
         */
        public static final String FORMAT = "ENCODE_FORMAT";

        private Encode() {}
    }

    /**
     * Constants related to the {@link SearchBookContents#ACTION} Intent.
     */
    public static final class SearchBookContents {
        /**
         * Use Google Book Search to search the contents of the book provided.
         */
        public static final String ACTION = "com.google.zxing.client.android.SEARCH_BOOK_CONTENTS";

        /**
         * The book to search, identified by ISBN number.
         */
        public static final String ISBN = "ISBN";

        /**
         * An optional field which is the text to search for.
         */
        public static final String QUERY = "QUERY";

        private SearchBookContents() {}
    }

    /**
     * Constants related to the {@link WifiConnect#ACTION} Intent.
     */
    public static final class WifiConnect {
        /**
         * Internal intent used to trigger connection to a wi-fi network.
         */
        public static final String ACTION = "com.google.zxing.client.android.WIFI_CONNECT";

        /**
         * The network to connect to, all the configuration provided here.
         */
        public static final String SSID = "SSID";

        /**
         * The network to connect to, all the configuration provided here.
         */
        public static final String TYPE = "TYPE";

        /**
         * The network to connect to, all the configuration provided here.
         */
        public static final String PASSWORD = "PASSWORD";

        private WifiConnect() {}
    }

    /**
     * Constants related to the {@link Share#ACTION} Intent.
     */
    public static final class Share {
        /**
         * Give the user a choice of items to encode as a barcode, then render it as a QR Code and
         * display onscreen for a friend to scan with their phone.
         */
        public static final String ACTION = "com.google.zxing.client.android.SHARE";

        private Share() {}
    }

}
