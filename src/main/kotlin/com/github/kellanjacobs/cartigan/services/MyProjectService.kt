package com.github.kellanjacobs.cartigan.services

import com.intellij.openapi.project.Project
import com.github.kellanjacobs.cartigan.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
