# stimulus-lsp-intellij

![Build](https://github.com/kcdragon/stimulus-lsp-intellij/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/com.github.kcdragon.stimuluslspintellij.svg)](https://plugins.jetbrains.com/plugin/com.github.kcdragon.stimuluslspintellij)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/com.github.kcdragon.stimuluslspintellij.svg)](https://plugins.jetbrains.com/plugin/com.github.kcdragon.stimuluslspintellij)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [ ] Get familiar with the [template documentation][template].
- [ ] Adjust the [pluginGroup](./gradle.properties), [plugin ID](./src/main/resources/META-INF/plugin.xml) and [sources package](./src/main/kotlin).
- [ ] Adjust the plugin description in `README` (see [Tips][docs:plugin-description])
- [ ] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html?from=IJPluginTemplate).
- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [ ] Set the `PLUGIN_ID` in the above README badges.
- [ ] Set the [Plugin Signing](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html?from=IJPluginTemplate) related [secrets](https://github.com/JetBrains/intellij-platform-plugin-template#environment-variables).
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html?from=IJPluginTemplate).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->
This plugin is a simple wrapper around [Stimulus LSP](https://github.com/marcoroth/stimulus-lsp) by [Marco Roth](https://github.com/marcoroth).

Install the Stimulus Language Server
  
```shell
yarn global add stimulus-language-server
```

Ensure that `stimulus-language-server` is on your `PATH`
<!-- Plugin description end -->

## Installation

- Install the Stimulus Language Server and ensure that `stimulus-language-server` is on your PATH 
  ```shell
  yarn global add stimulus-language-server
  ```

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "stimulus-lsp-intellij"</kbd> >
  <kbd>Install</kbd>
  
- Manually:

  Download the [latest release](https://github.com/kcdragon/stimulus-lsp-intellij/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
