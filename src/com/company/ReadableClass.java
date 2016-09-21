package com.company;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * Created by azolotukhin on 19.09.2016.
 */
public class ReadableClass implements Readable{
    @Override
    public int read(CharBuffer cb) throws IOException {
        cb.append(readthis);
        return -1;
    }
    public String readthis = "front-left front-right hind-right hind-left";
    CharBuffer cb = CharBuffer.allocate(20);
}
