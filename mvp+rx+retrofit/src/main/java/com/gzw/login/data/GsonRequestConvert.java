package com.gzw.login.data;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.gzw.login.entry.request.BaseRequest;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/**
 * Created by gzw on 2016/12/28.
 */

public class GsonRequestConvert<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Gson gson;
    private final TypeAdapter<T> adapter;
    GsonRequestConvert(Gson gson,TypeAdapter<T> adapter){
        this.gson = gson;
        this.adapter = adapter;
    }
    @Override
    public RequestBody convert(T value) throws IOException {
        if(value instanceof BaseRequest){
            //设置session
        }
        Buffer buffer = new Buffer();
        Writer writer = new OutputStreamWriter(buffer.outputStream(),UTF_8);
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter,value);
        return RequestBody.create(MEDIA_TYPE,buffer.readByteArray());
    }
}
