# istio-debug

Steps to recreate the issue

Environment 

Azure AKS, you can use any kubernetes environment
Install Istio following this guide with default setup process. https://istio.io/latest/docs/setup/install/
```
istioctl install --set profile=default
```

Create namespace test
enable istio in namespace test by adding label 
```
kubectl label namespace test istio-injection=enabled
```


And use helm to install the app using following command 
```
helm install test -n test ./helm/istio-test
```
Please update image as need when you rebuild the project

Assumption you have service registry available at http://service-registry:8761
or you can disable discovery client and use ip address to test actuator endpoint as http://{{ip}}:8081/actuator
