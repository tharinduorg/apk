# apk-helm

![Version: 0.0.1-m8](https://img.shields.io/badge/Version-0.0.1--m8-informational?style=flat-square) ![Type: application](https://img.shields.io/badge/Type-application-informational?style=flat-square) ![AppVersion: 1.16.0](https://img.shields.io/badge/AppVersion-1.16.0-informational?style=flat-square)

A Helm chart for APK components

## Requirements

| Repository | Name | Version |
|------------|------|---------|
| https://charts.bitnami.com/bitnami | postgresql | 11.9.6 |
| https://charts.bitnami.com/bitnami | redis | 17.8.0 |
| https://charts.jetstack.io | cert-manager | v1.10.1 |

## Values

| Key | Type | Default | Description |
|-----|------|---------|-------------|
| certmanager.enableClusterIssuer | bool | `true` | Enable cluster issuer to generate certificates |
| certmanager.enableRootCa | bool | `true` | Enable root CA to generate certificates |
| certmanager.enabled | bool | `true` | Enable certificate manager to generate certificates |
| gatewaySystem.enabled | bool | `true` | Enable gateway system to install gateway system components |
| idp.database.databaseName | string | `"WSO2AM_DB"` | identity server database name |
| idp.database.driver | string | `"org.postgresql.Driver"` | identity server database driver |
| idp.database.host | string | `"wso2apk-db-service"` | identity server database host |
| idp.database.password | string | `"wso2carbon"` | identity server database password |
| idp.database.port | int | `5432` | identity server database port |
| idp.database.url | string | `"jdbc:postgresql://wso2apk-db-service:5432/WSO2AM_DB"` | identity server database url |
| idp.database.username | string | `"wso2carbon"` | identity server database username |
| idp.database.validationQuery | string | `"SELECT 1"` | identity server database validation query |
| idp.database.validationTimeout | int | `250` | identity server database validation timeout |
| idp.enabled | bool | `true` | Enable Non production identity server |
| idp.idpds.config.hostname | string | `"idp.am.wso2.com"` | identity server hostname. |
| idp.idpds.config.issuer | string | `"https://idp.am.wso2.com/token"` | identity server issuer url |
| idp.idpds.config.keyId | string | `"gateway_certificate_alias"` | identity server keyId |
| idp.idpds.config.loginCallBackURl | string | `"https://idp.am.wso2.com:9095/authenticationEndpoint/login-callback"` | identity server login callback page url |
| idp.idpds.config.loginErrorPageUrl | string | `"https://idp.am.wso2.com:9095/authenticationEndpoint/error"` | identity server login error page url |
| idp.idpds.config.loginPageURl | string | `"https://idp.am.wso2.com:9095/authenticationEndpoint/login"` | identity server login page url |
| idp.idpds.deployment.image | string | `"wso2/idp-domain-service:latest"` | Image |
| idp.idpds.deployment.imagePullPolicy | string | `"Always"` | Image pull policy |
| idp.idpds.deployment.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| idp.idpds.deployment.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| idp.idpds.deployment.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| idp.idpds.deployment.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| idp.idpds.deployment.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| idp.idpds.deployment.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| idp.idpds.deployment.replicas | int | `1` | Number of replicas |
| idp.idpds.deployment.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| idp.idpds.deployment.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| idp.idpds.deployment.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| idp.idpds.deployment.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| idp.idpds.deployment.strategy | string | `"Recreate"` | Deployment strategy |
| idp.idpui.configs.idpAuthCallBackUrl | string | `"https://idp.am.wso2.com:9095/oauth2/auth-callback"` | identity server authCallBackUrl |
| idp.idpui.configs.idpLoginUrl | string | `"https://idp.am.wso2.com:9095/commonauth/login"` | identity server Login URL |
| idp.idpui.deployment.image | string | `"wso2/idp-ui:0.0.1-m8"` | Image |
| idp.idpui.deployment.imagePullPolicy | string | `"Always"` | Image pull policy |
| idp.idpui.deployment.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| idp.idpui.deployment.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| idp.idpui.deployment.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| idp.idpui.deployment.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| idp.idpui.deployment.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| idp.idpui.deployment.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| idp.idpui.deployment.replicas | int | `1` | Number of replicas |
| idp.idpui.deployment.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| idp.idpui.deployment.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| idp.idpui.deployment.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| idp.idpui.deployment.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| idp.idpui.deployment.strategy | string | `"Recreate"` | Deployment strategy |
| idp.listener.hostname | string | `"idp.am.wso2.com"` | identity server hostname |
| idp.listener.secretName | string | `"idp-tls"` | identity server certificate |
| postgresql.auth.database | string | `"WSO2AM_DB"` | Name for a custom database to create |
| postgresql.auth.password | string | `"wso2carbon"` | Password for the custom user to create. Ignored if auth.existingSecret is provided |
| postgresql.auth.postgresPassword | string | `"wso2carbon"` | Password for the "postgres" admin user. Ignored if auth.existingSecret is provided |
| postgresql.auth.username | string | `"wso2carbon"` | Name for a custom user to create |
| postgresql.enabled | bool | `true` | Enable postgresql database |
| postgresql.fullnameOverride | string | `"wso2apk-db-service"` | String to fully override common.names.fullname template |
| postgresql.image.debug | bool | `true` | Enable debug mode |
| postgresql.primary.extendedConfiguration | string | `"max_connections = 400\n"` | Extended PostgreSQL Primary configuration (appended to main or default configuration) |
| postgresql.primary.initdb.password | string | `"wso2carbon"` | Specify the PostgreSQL password to execute the initdb scripts |
| postgresql.primary.initdb.scriptsConfigMap | string | `"postgres-initdb-scripts-configmap"` | ConfigMap with PostgreSQL initialization scripts |
| postgresql.primary.initdb.user | string | `"wso2carbon"` | Specify the PostgreSQL username to execute the initdb scripts |
| postgresql.primary.service.ports.postgresql | int | `5432` | PostgreSQL service port |
| redis.architecture | string | `"standalone"` | Redis® architecture. Allowed values: standalone or replication.  |
| redis.auth.enabled | bool | `false` | Enable password authentication	 |
| redis.enabled | bool | `true` | Enable redis |
| redis.fullnameOverride | string | `"redis"` | String to fully override common.names.fullname template |
| redis.image.debug | bool | `true` | Enable debug mode |
| redis.primary.service.ports.redis | int | `6379` | Redis service port |
| wso2.apk.auth.enableClusterRoleCreation | bool | `true` | Enable Cluster Role Creation |
| wso2.apk.auth.enableServiceAccountCreation | bool | `true` | Enable Service Account Creation |
| wso2.apk.auth.enabled | bool | `true` | Enable Service Account Creation |
| wso2.apk.auth.roleName | string | `"wso2apk-role"` | Cluster Role name |
| wso2.apk.auth.serviceAccountName | string | `"wso2apk-platform"` | Service Account name |
| wso2.apk.cp.admin.deployment.image | string | `"wso2/admin-domain-service:0.0.1-m8"` | Image |
| wso2.apk.cp.admin.deployment.imagePullPolicy | string | `"Always"` | Image pull policy |
| wso2.apk.cp.admin.deployment.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.cp.admin.deployment.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.cp.admin.deployment.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.cp.admin.deployment.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.cp.admin.deployment.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.cp.admin.deployment.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.cp.admin.deployment.replicas | int | `1` | Number of replicas |
| wso2.apk.cp.admin.deployment.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| wso2.apk.cp.admin.deployment.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| wso2.apk.cp.admin.deployment.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| wso2.apk.cp.admin.deployment.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| wso2.apk.cp.admin.deployment.strategy | string | `"Recreate"` | Deployment strategy |
| wso2.apk.cp.backoffice.deployment.image | string | `"wso2/backoffice-domain-service:0.0.1-m8"` | Image |
| wso2.apk.cp.backoffice.deployment.imagePullPolicy | string | `"Always"` | Image pull policy |
| wso2.apk.cp.backoffice.deployment.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.cp.backoffice.deployment.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.cp.backoffice.deployment.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.cp.backoffice.deployment.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.cp.backoffice.deployment.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.cp.backoffice.deployment.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.cp.backoffice.deployment.replicas | int | `1` | Number of replicas |
| wso2.apk.cp.backoffice.deployment.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| wso2.apk.cp.backoffice.deployment.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| wso2.apk.cp.backoffice.deployment.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| wso2.apk.cp.backoffice.deployment.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| wso2.apk.cp.backoffice.deployment.strategy | string | `"Recreate"` | Deployment strategy |
| wso2.apk.cp.database.databaseName | string | `"WSO2AM_DB"` | Database Name. |
| wso2.apk.cp.database.driver | string | `"org.postgresql.Driver"` | Database Driver class. |
| wso2.apk.cp.database.host | string | `"wso2apk-db-service"` | Database Host. |
| wso2.apk.cp.database.password | string | `"wso2carbon"` | Database Password. |
| wso2.apk.cp.database.port | int | `5432` | Database Port. |
| wso2.apk.cp.database.url | string | `"jdbc:postgresql://wso2apk-db-service:5432/WSO2AM_DB"` | Database URL. |
| wso2.apk.cp.database.username | string | `"wso2carbon"` | Database Username. |
| wso2.apk.cp.database.validationQuery | string | `"SELECT 1"` | Database validation query. |
| wso2.apk.cp.database.validationTimeout | int | `250` | Database validation timeout in ms. |
| wso2.apk.cp.devportal.deployment.image | string | `"wso2/devportal-domain-service:0.0.1-m8"` | Image |
| wso2.apk.cp.devportal.deployment.imagePullPolicy | string | `"Always"` | Image pull policy |
| wso2.apk.cp.devportal.deployment.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.cp.devportal.deployment.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.cp.devportal.deployment.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.cp.devportal.deployment.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.cp.devportal.deployment.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.cp.devportal.deployment.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.cp.devportal.deployment.replicas | int | `1` | Number of replicas |
| wso2.apk.cp.devportal.deployment.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| wso2.apk.cp.devportal.deployment.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| wso2.apk.cp.devportal.deployment.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| wso2.apk.cp.devportal.deployment.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| wso2.apk.cp.devportal.deployment.strategy | string | `"Recreate"` | Deployment strategy |
| wso2.apk.cp.enabled | bool | `true` | Enabled control plane. |
| wso2.apk.cp.managementServer.configs.tls.certFilename | string | `"certchain.crt"` | TLS certificate file name |
| wso2.apk.cp.managementServer.configs.tls.certKeyFilename | string | `"tls.key"` | TLS key file name |
| wso2.apk.cp.managementServer.configs.tls.secretName | string | `"management-server-cert"` | TLS secret name |
| wso2.apk.cp.managementServer.deployment.image | string | `"wso2/management-server:0.0.1-m8"` | Image |
| wso2.apk.cp.managementServer.deployment.imagePullPolicy | string | `"Always"` | Image pull policy |
| wso2.apk.cp.managementServer.deployment.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.cp.managementServer.deployment.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.cp.managementServer.deployment.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.cp.managementServer.deployment.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.cp.managementServer.deployment.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.cp.managementServer.deployment.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.cp.managementServer.deployment.replicas | int | `1` | Number of replicas |
| wso2.apk.cp.managementServer.deployment.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| wso2.apk.cp.managementServer.deployment.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| wso2.apk.cp.managementServer.deployment.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| wso2.apk.cp.managementServer.deployment.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| wso2.apk.cp.managementServer.deployment.strategy | string | `"Recreate"` | Deployment strategy |
| wso2.apk.dp.adapter.configs.apiNamespaces | string | `nil` | Optionally configure namespaces to watch for apis. |
| wso2.apk.dp.adapter.configs.tls.certFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.adapter.configs.tls.certKeyFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.adapter.configs.tls.secretName | string | `""` | TLS secret name for adapter public certificate. |
| wso2.apk.dp.adapter.deployment.image | string | `"wso2/adapter:0.0.1-m8"` | Image |
| wso2.apk.dp.adapter.deployment.imagePullPolicy | string | `"Always"` | Image pull policy |
| wso2.apk.dp.adapter.deployment.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.adapter.deployment.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.adapter.deployment.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.adapter.deployment.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.adapter.deployment.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.adapter.deployment.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.adapter.deployment.replicas | int | `1` | Number of replicas |
| wso2.apk.dp.adapter.deployment.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| wso2.apk.dp.adapter.deployment.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| wso2.apk.dp.adapter.deployment.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| wso2.apk.dp.adapter.deployment.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| wso2.apk.dp.adapter.deployment.security.sslHostname | string | `"adapter"` | Enable security for adapter. |
| wso2.apk.dp.adapter.deployment.strategy | string | `"Recreate"` | Deployment strategy |
| wso2.apk.dp.controlPlane.enableHostNameVerification | bool | `true` | Hostname verification for the control plane  |
| wso2.apk.dp.controlPlane.enabled | bool | `true` | Enable the control plane for Dataplane. |
| wso2.apk.dp.controlPlane.headers | list | `[{"name":"","value":""}]` | optional headers to be send to control plane service. |
| wso2.apk.dp.controlPlane.serviceUrl | string | `""` | Control Plane Service URL |
| wso2.apk.dp.controlPlane.tls.fileName | string | `"certificate.crt"` | TLS certificate file name. |
| wso2.apk.dp.controlPlane.tls.secretName | string | `"organization-managetment-server-cert"` | TLS secret name for control-plane public certificate. |
| wso2.apk.dp.enabled | bool | `true` | Enable the deployment of the Data Plane |
| wso2.apk.dp.gateway.listener.hostname | string | `"gw.wso2.com"` | Gateway Listener Hostname |
| wso2.apk.dp.gateway.listener.secretName | string | `""` | Gateway Listener Certificate Secret Name |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.configs.tls.certFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.configs.tls.certKeyFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.configs.tls.secretName | string | `""` | TLS secret name for enforcer public certificate. |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.image | string | `"wso2/enforcer:0.0.1-m8"` | Image |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.imagePullPolicy | string | `"Always"` | Image pull policy |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.security.sslHostname | string | `"enforcer"` | hostname for the enforcer |
| wso2.apk.dp.gatewayRuntime.deployment.enforcer.strategy | string | `"Recreate"` | Deployment strategy |
| wso2.apk.dp.gatewayRuntime.deployment.replicas | int | `1` | Number of replicas |
| wso2.apk.dp.gatewayRuntime.deployment.router.configs.tls.certFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.gatewayRuntime.deployment.router.configs.tls.certKeyFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.gatewayRuntime.deployment.router.configs.tls.secretName | string | `"router-cert"` | TLS secret name for router public certificate. |
| wso2.apk.dp.gatewayRuntime.deployment.router.image | string | `"wso2/router:0.0.1-m8"` | Image |
| wso2.apk.dp.gatewayRuntime.deployment.router.imagePullPolicy | string | `"Always"` | Image pull policy |
| wso2.apk.dp.gatewayRuntime.deployment.router.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.gatewayRuntime.deployment.router.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.gatewayRuntime.deployment.router.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.gatewayRuntime.deployment.router.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.gatewayRuntime.deployment.router.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.gatewayRuntime.deployment.router.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.gatewayRuntime.deployment.router.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| wso2.apk.dp.gatewayRuntime.deployment.router.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| wso2.apk.dp.gatewayRuntime.deployment.router.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| wso2.apk.dp.gatewayRuntime.deployment.router.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| wso2.apk.dp.gatewayRuntime.deployment.router.strategy | string | `"Recreate"` | Deployment strategy |
| wso2.apk.dp.managementServer.enabled | bool | `true` | Enable management server for Data Plane. |
| wso2.apk.dp.managementServer.serviceUrl | string | `"https://control-plane-wso2-apk-management-server.control-plane.svc.cluster.local"` | Management Server Service URL |
| wso2.apk.dp.managementServer.tls.fileName | string | `"certificate.crt"` | TLS certificate file name. |
| wso2.apk.dp.managementServer.tls.secretName | string | `"managetment-server-cert"` | TLS secret name for management server public certificate. |
| wso2.apk.dp.partitionServer.enabled | bool | `false` | Enable partition server for Data Plane. |
| wso2.apk.dp.partitionServer.host | string | `""` | Partition Server Service URL |
| wso2.apk.dp.partitionServer.partitionName | string | `"default"` | Partition Name. |
| wso2.apk.dp.partitionServer.serviceBasePath | string | `"/api/am/publisher/v1"` | Partition Server Service Base Path. |
| wso2.apk.dp.partitionServer.tls.fileName | string | `"certificate.crt"` | TLS certificate file name. |
| wso2.apk.dp.partitionServer.tls.secretName | string | `"managetment-server-cert"` | TLS secret name for Partition Server Public Certificate. |
| wso2.apk.dp.ratelimiter.deployment.configs.tls.certCAFilename | string | `""` | TLS CA certificate file name. |
| wso2.apk.dp.ratelimiter.deployment.configs.tls.certFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.ratelimiter.deployment.configs.tls.certKeyFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.ratelimiter.deployment.configs.tls.secretName | string | `"ratelimiter-cert"` | TLS secret name for rate limiter public certificate. |
| wso2.apk.dp.ratelimiter.deployment.image | string | `"wso2/ratelimiter:0.0.1-m8"` | Image |
| wso2.apk.dp.ratelimiter.deployment.imagePullPolicy | string | `"Always"` | Image pull policy |
| wso2.apk.dp.ratelimiter.deployment.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.ratelimiter.deployment.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.ratelimiter.deployment.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.ratelimiter.deployment.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.ratelimiter.deployment.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.ratelimiter.deployment.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.ratelimiter.deployment.replicas | int | `1` | Number of replicas |
| wso2.apk.dp.ratelimiter.deployment.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| wso2.apk.dp.ratelimiter.deployment.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| wso2.apk.dp.ratelimiter.deployment.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| wso2.apk.dp.ratelimiter.deployment.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| wso2.apk.dp.ratelimiter.deployment.security.sslHostname | string | `"ratelimiter"` | hostname for the rate limiter |
| wso2.apk.dp.ratelimiter.deployment.strategy | string | `"Recreate"` | Deployment strategy |
| wso2.apk.dp.ratelimiter.enabled | bool | `true` | Enable the deployment of the Rate Limiter |
| wso2.apk.dp.runtime.deployment.configs.authrorization | bool | `true` | Enable authorization for runtime api. |
| wso2.apk.dp.runtime.deployment.configs.baseUrl | string | `"https://api.am.wso2.com:9095/api/am/runtime"` | Baseurl for runtime api. |
| wso2.apk.dp.runtime.deployment.configs.tls.certFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.runtime.deployment.configs.tls.certKeyFilename | string | `""` | TLS certificate file name. |
| wso2.apk.dp.runtime.deployment.configs.tls.secretName | string | `""` | TLS secret name for runtime public certificate. |
| wso2.apk.dp.runtime.deployment.image | string | `"wso2/runtime-domain-service:0.0.1-m8"` | Image |
| wso2.apk.dp.runtime.deployment.imagePullPolicy | string | `"Always"` | Image pull policy |
| wso2.apk.dp.runtime.deployment.livenessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.runtime.deployment.livenessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.runtime.deployment.livenessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.runtime.deployment.readinessProbe.failureThreshold | int | `5` | Minimum consecutive failures for the probe to be considered failed after having succeeded. |
| wso2.apk.dp.runtime.deployment.readinessProbe.initialDelaySeconds | int | `20` | Number of seconds after the container has started before liveness probes are initiated. |
| wso2.apk.dp.runtime.deployment.readinessProbe.periodSeconds | int | `20` | How often (in seconds) to perform the probe. |
| wso2.apk.dp.runtime.deployment.replicas | int | `1` | Number of replicas |
| wso2.apk.dp.runtime.deployment.resources.limits.cpu | string | `"1000m"` | Memory limit for the container |
| wso2.apk.dp.runtime.deployment.resources.limits.memory | string | `"1028Mi"` | CPU limit for the container |
| wso2.apk.dp.runtime.deployment.resources.requests.cpu | string | `"100m"` | Memory request for the container |
| wso2.apk.dp.runtime.deployment.resources.requests.memory | string | `"128Mi"` | CPU request for the container |
| wso2.apk.dp.runtime.deployment.strategy | string | `"Recreate"` | Deployment strategy |
| wso2.apk.idp.authorizeEndpoint | string | `"https://idp.am.wso2.com:9095/oauth2/authorize"` | IDP authorization endpoint |
| wso2.apk.idp.credentials.secretName | string | `""` | IDP credentials secret name to be configured with  |
| wso2.apk.idp.groupClaim | string | `"groups"` | Optionally configure groups Claim in JWT. |
| wso2.apk.idp.issuer | string | `"https://idp.am.wso2.com/token"` | IDP issuer value |
| wso2.apk.idp.jwksEndpoint | string | `""` | IDP jwks endpoint (optional) |
| wso2.apk.idp.organizationClaim | string | `"organization"` | Optionally configure organization Claim in JWT. |
| wso2.apk.idp.organizationResolver | string | `"controlPlane"` | Optionally configure organization Resolution method for APK (controlPlane/none)). |
| wso2.apk.idp.revokeEndpoint | string | `"https://idp.am.wso2.com:9095/oauth2/revoke"` | IDP revoke endpoint |
| wso2.apk.idp.signing.fileName | string | `""` | IDP jwt signing certificate file name |
| wso2.apk.idp.signing.secretName | string | `""` | IDP jwt signing certificate secret name |
| wso2.apk.idp.tls.fileName | string | `""` | IDP public certificate file name |
| wso2.apk.idp.tls.secretName | string | `""` | IDP public certificate secret name |
| wso2.apk.idp.tokenEndpoint | string | `"https://idp.am.wso2.com:9095/oauth2/token"` | IDP token endpoint |
| wso2.apk.idp.usernameClaim | string | `"sub"` | Optionally configure username Claim in JWT. |
| wso2.apk.listener.hostname | string | `"api.am.wso2.com"` | System api listener hostname |
| wso2.apk.migration.enabled | bool | `false` | It is not recommended to run a production deployment with this flag enabled. |
| wso2.subscription.imagePullSecrets | string | `""` | Optionally specify image pull secrets. |

----------------------------------------------
Autogenerated from chart metadata using [helm-docs v1.11.0](https://github.com/norwoodj/helm-docs/releases/v1.11.0)