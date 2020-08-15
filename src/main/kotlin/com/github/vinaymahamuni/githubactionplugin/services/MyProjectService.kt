package com.github.vinaymahamuni.githubactionplugin.services

import com.intellij.openapi.project.Project
import com.github.vinaymahamuni.githubactionplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
