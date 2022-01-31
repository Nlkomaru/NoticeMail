package com.noticemc.noticemail

import org.bukkit.plugin.java.JavaPlugin

class NoticeMail : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        plugin = this
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    lateinit var plugin :NoticeMail
}