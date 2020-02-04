/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.nodes;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KubernetesNodesEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "apiVersion": ((KubernetesNodesEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsDomain": ((KubernetesNodesEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesClient": ((KubernetesNodesEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "portName": ((KubernetesNodesEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portProtocol": ((KubernetesNodesEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((KubernetesNodesEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "labelKey": ((KubernetesNodesEndpoint) target).getConfiguration().setLabelKey(property(camelContext, java.lang.String.class, value)); return true;
        case "labelValue": ((KubernetesNodesEndpoint) target).getConfiguration().setLabelValue(property(camelContext, java.lang.String.class, value)); return true;
        case "namespace": ((KubernetesNodesEndpoint) target).getConfiguration().setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "poolSize": ((KubernetesNodesEndpoint) target).getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "resourceName": ((KubernetesNodesEndpoint) target).getConfiguration().setResourceName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((KubernetesNodesEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((KubernetesNodesEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((KubernetesNodesEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesNodesEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((KubernetesNodesEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectionTimeout": ((KubernetesNodesEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesNodesEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "caCertData": ((KubernetesNodesEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "caCertFile": ((KubernetesNodesEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertData": ((KubernetesNodesEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertFile": ((KubernetesNodesEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyAlgo": ((KubernetesNodesEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyData": ((KubernetesNodesEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyFile": ((KubernetesNodesEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyPassphrase": ((KubernetesNodesEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthToken": ((KubernetesNodesEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesNodesEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustCerts": ((KubernetesNodesEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesNodesEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "apiversion": ((KubernetesNodesEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsdomain": ((KubernetesNodesEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesclient": ((KubernetesNodesEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "portname": ((KubernetesNodesEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portprotocol": ((KubernetesNodesEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((KubernetesNodesEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "labelkey": ((KubernetesNodesEndpoint) target).getConfiguration().setLabelKey(property(camelContext, java.lang.String.class, value)); return true;
        case "labelvalue": ((KubernetesNodesEndpoint) target).getConfiguration().setLabelValue(property(camelContext, java.lang.String.class, value)); return true;
        case "namespace": ((KubernetesNodesEndpoint) target).getConfiguration().setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "poolsize": ((KubernetesNodesEndpoint) target).getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "resourcename": ((KubernetesNodesEndpoint) target).getConfiguration().setResourceName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((KubernetesNodesEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((KubernetesNodesEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((KubernetesNodesEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesNodesEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((KubernetesNodesEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout": ((KubernetesNodesEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesNodesEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "cacertdata": ((KubernetesNodesEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertfile": ((KubernetesNodesEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertdata": ((KubernetesNodesEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertfile": ((KubernetesNodesEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyalgo": ((KubernetesNodesEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeydata": ((KubernetesNodesEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyfile": ((KubernetesNodesEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeypassphrase": ((KubernetesNodesEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtoken": ((KubernetesNodesEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesNodesEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustcerts": ((KubernetesNodesEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesNodesEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}
