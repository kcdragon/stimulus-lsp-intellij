package com.github.kcdragon.stimuluslspintellij.ide.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

class StimulusLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Stimulus") {
  override fun isSupportedFile(file: VirtualFile) = file.extension == "html.erb" || file.extension == "erb" || file.extension == "html"

  override fun createCommandLine() =
    GeneralCommandLine("stimulus-language-server", "--stdio")
}
