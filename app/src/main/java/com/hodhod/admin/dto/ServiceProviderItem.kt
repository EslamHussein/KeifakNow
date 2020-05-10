package com.hodhod.admin.dto


data class ServiceProviderItem(val type: Problems, val number: Int) {

    fun getProviderType(): String {
        return type.value
    }


    fun getProviderNumber(): String {
        return "$number Volunteer"
    }
}