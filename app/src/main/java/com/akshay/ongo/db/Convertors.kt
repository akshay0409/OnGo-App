package com.akshay.ongo.db

import androidx.room.TypeConverter
import com.akshay.ongo.Source

class Convertors {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }


}