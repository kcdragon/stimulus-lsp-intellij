package com.github.kcdragon.stimuluslspintellij.ide.lsp

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServer
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.lsWidget.LspServerWidgetItem

class StimulusLspServerSupportProvider : LspServerSupportProvider {
  override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter) {
    if (file.extension == "html.erb" || file.extension == "erb" || file.extension == "html") {
      serverStarter.ensureServerStarted(StimulusLspServerDescriptor(project))
    }
  }

  override fun createLspServerWidgetItem(lspServer: LspServer, currentFile: VirtualFile?) =
    LspServerWidgetItem(lspServer, currentFile)
}
