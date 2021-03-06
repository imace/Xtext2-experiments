package org.xtext.example.hellojvmtypes.tests

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.hellojvmtypes.HelloJvmTypesInjectorProvider
import org.xtext.example.hellojvmtypes.helloJvmTypes.Greeting
import org.xtext.example.hellojvmtypes.helloJvmTypes.Model
import org.junit.Assert

@InjectWith(typeof(HelloJvmTypesInjectorProvider))
@RunWith(typeof(XtextRunner))
class HelloJvmtypesParserTest {
 
    @Inject
    ParseHelper<Model> parser
    
    @Inject extension ValidationTestHelper

    @Test
    def void testParsingAndLinking() {
        parser.parse('''Hello foo from java.util.List!''').assertNoErrors
    }

    @Test
    def void testParsingAndLinkingWithImports() {
        parser.parse('''
        	import java.util.List
        	Hello foo from List!
        ''').assertNoErrors
    }
    
    @Test
    def void testParsingAndLinkingWithGreetingImports() {
        parser.parse('''
        	import org.xtext.example.hellojvmtypes.helloJvmTypes.*
        	Hello foo from Greeting!
        ''').assertNoErrors
    }
    
    @Test
    def void testJvmTypeAccess() {
        val model = parser.parse(
            "Hello foo from java.util.List!")
        val greeting = model.greetings.head as Greeting
        val jvmType = greeting.javaTypes.get(0) as JvmGenericType
        Assert::assertEquals("java.util.List", jvmType.identifier)        
    }
    
}