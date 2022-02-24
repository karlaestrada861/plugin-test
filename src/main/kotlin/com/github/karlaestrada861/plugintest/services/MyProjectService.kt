package com.github.karlaestrada861.plugintest.services

import com.intellij.openapi.project.Project
import com.github.karlaestrada861.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
