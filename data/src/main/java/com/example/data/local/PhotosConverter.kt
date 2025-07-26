package com.example.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.data.utils.JsonParser
import com.example.domain.models.Src
import com.google.gson.reflect.TypeToken


@ProvidedTypeConverter
class PhotosConverter(
    private val jsonParser: JsonParser
) {
    @TypeConverter
    fun toSrc(json : String) : Src {
        return jsonParser.fromJson(json,object : TypeToken<Src>(){}.type) ?: Src()
    }

    @TypeConverter
    fun fromSrc(src : Src) : String {
        return jsonParser.toJson(src,object : TypeToken<Src>(){}.type) ?: "{}"
    }
}