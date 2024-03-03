package dev.jav;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class QRCodeTester {
    public static void main(String[] args) throws WriterException, IOException {
        String str = "Jhon Anthony Varron";
        String path = "C:\\Users\\Jhon Anthony Varron\\Pictures\\Saved Pictures\\qrcodeinfo.png";

        Map<EncodeHintType, ErrorCorrectionLevel> map = new HashMap<EncodeHintType, ErrorCorrectionLevel>();

        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        QRCodeGenerator.generateQRCodeImage(str, 200, 200, path);

        System.out.println("QR Code created successfully.");
    }
}
