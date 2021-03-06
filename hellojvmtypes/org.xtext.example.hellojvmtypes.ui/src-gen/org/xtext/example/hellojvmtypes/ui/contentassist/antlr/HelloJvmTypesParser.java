/*
* generated by Xtext
*/
package org.xtext.example.hellojvmtypes.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.hellojvmtypes.services.HelloJvmTypesGrammarAccess;

public class HelloJvmTypesParser extends AbstractContentAssistParser {
	
	@Inject
	private HelloJvmTypesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.hellojvmtypes.ui.contentassist.antlr.internal.InternalHelloJvmTypesParser createParser() {
		org.xtext.example.hellojvmtypes.ui.contentassist.antlr.internal.InternalHelloJvmTypesParser result = new org.xtext.example.hellojvmtypes.ui.contentassist.antlr.internal.InternalHelloJvmTypesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
					put(grammarAccess.getGreetingAccess().getGroup_4(), "rule__Greeting__Group_4__0");
					put(grammarAccess.getModelAccess().getImportsAssignment_0(), "rule__Model__ImportsAssignment_0");
					put(grammarAccess.getModelAccess().getGreetingsAssignment_1(), "rule__Model__GreetingsAssignment_1");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getGreetingAccess().getNameAssignment_1(), "rule__Greeting__NameAssignment_1");
					put(grammarAccess.getGreetingAccess().getJavaTypesAssignment_3(), "rule__Greeting__JavaTypesAssignment_3");
					put(grammarAccess.getGreetingAccess().getJavaTypesAssignment_4_1(), "rule__Greeting__JavaTypesAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.hellojvmtypes.ui.contentassist.antlr.internal.InternalHelloJvmTypesParser typedParser = (org.xtext.example.hellojvmtypes.ui.contentassist.antlr.internal.InternalHelloJvmTypesParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public HelloJvmTypesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HelloJvmTypesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
