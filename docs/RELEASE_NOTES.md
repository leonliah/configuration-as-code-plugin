# Configuration as Code Plugin Releases

## Alpha Version

0.1-alpha version of Configuration as Code plugin has a number of issues that may break your Jenkins instance - details below. DO NOT USE in production environment, only for test.

### Features available:

- Configure (some) plugins via YAML file
- Reload configuration from YAML file - manual step, available under `Manage Jenkins`:arrow_right: `Configuration as Code`
- Vault support - details in [README](../README.md)
- seed job creation - details in [README](../README.md)
- build agents configuration
- GitHub OAuth support
- Matrix (and Matrix Project) Authorization Strategy support

### Limitations:

- Location of YAML file with configuration MUST be provided via environment variable CASC_JENKINS_CONFIG - can be location on disk readable from Jenkins perspective
- plugins has to be installed manually (and it must happen before you try to configure them)

### How to use it

1. Add the experimental plugins repository ([link](http://updates.jenkins.io/experimental/update-center.json))
2. Prepare jenkins.yaml and store the location in CASC_JENKINS_CONFIG environment variable
3. Install *Configuration as Code* plugin (& all the others plugins you want to use)
4. When installed plugin will look for configuration file and configure Jenkins accordingly
5. To change the configuration go to `Manage Jenkins`:arrow_right: `Configuration as Code` and hit "Reload" button
