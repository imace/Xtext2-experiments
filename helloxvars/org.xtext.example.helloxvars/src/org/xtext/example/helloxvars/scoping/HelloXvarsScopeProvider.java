/*
 * generated by Xtext
 */
package org.xtext.example.helloxvars.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.xtext.example.helloxvars.helloXvars.Model;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
public class HelloXvarsScopeProvider extends XbaseScopeProvider {

	@Override
	protected IScope createLocalVarScope(IScope parentScope,
			LocalVariableScopeContext scopeContext) {
		if (scopeContext != null && scopeContext.getContext() != null) {
			EObject context = scopeContext.getContext();
			if (context instanceof Model) {
				Model model = (Model) context;
				return Scopes.scopeFor(model.getVarDeclarations());
			}	
		}
		
		return super.createLocalVarScope(parentScope, scopeContext);
	}

	
}
