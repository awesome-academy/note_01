package com.sun.note_01.data.source.remote

interface OnFetchDataJsonListener<T> {
    fun onSuccess(data: T)
    fun onError(exception: Exception?)
}
