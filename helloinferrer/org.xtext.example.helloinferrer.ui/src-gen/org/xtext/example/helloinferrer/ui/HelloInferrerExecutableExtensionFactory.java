/*
 * generated by Xtext
 */
package org.xtext.example.helloinferrer.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.helloinferrer.ui.internal.HelloInferrerActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HelloInferrerExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return HelloInferrerActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return HelloInferrerActivator.getInstance().getInjector(HelloInferrerActivator.ORG_XTEXT_EXAMPLE_HELLOINFERRER_HELLOINFERRER);
	}
	
}
