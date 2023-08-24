package com.eespinor.downloadmanager

interface Downloader {
    fun downloadFile(url:String):Long

}