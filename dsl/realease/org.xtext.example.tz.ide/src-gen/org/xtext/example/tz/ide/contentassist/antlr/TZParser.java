/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.tz.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.tz.ide.contentassist.antlr.internal.InternalTZParser;
import org.xtext.example.tz.services.TZGrammarAccess;

public class TZParser extends AbstractContentAssistParser {

	@Inject
	private TZGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTZParser createParser() {
		InternalTZParser result = new InternalTZParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives_0(), "rule__Model__Alternatives_0");
					put(grammarAccess.getTZVISORAccess().getAlternatives_3(), "rule__TZVISOR__Alternatives_3");
					put(grammarAccess.getMODULEAccess().getAlternatives_0(), "rule__MODULE__Alternatives_0");
					put(grammarAccess.getMODULEAccess().getAlternatives_3(), "rule__MODULE__Alternatives_3");
					put(grammarAccess.getLABELAccess().getAlternatives_2(), "rule__LABEL__Alternatives_2");
					put(grammarAccess.getVARIABLESAccess().getAlternatives(), "rule__VARIABLES__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getTZVISORAccess().getGroup(), "rule__TZVISOR__Group__0");
					put(grammarAccess.getMODULEAccess().getGroup(), "rule__MODULE__Group__0");
					put(grammarAccess.getLABELAccess().getGroup(), "rule__LABEL__Group__0");
					put(grammarAccess.getCONSTANTAccess().getGroup(), "rule__CONSTANT__Group__0");
					put(grammarAccess.getVARIABLESAccess().getGroup_1(), "rule__VARIABLES__Group_1__0");
					put(grammarAccess.getModelAccess().getModuleAssignment_0_0(), "rule__Model__ModuleAssignment_0_0");
					put(grammarAccess.getModelAccess().getConstantAssignment_0_1(), "rule__Model__ConstantAssignment_0_1");
					put(grammarAccess.getModelAccess().getTzvisorAssignment_1(), "rule__Model__TzvisorAssignment_1");
					put(grammarAccess.getTZVISORAccess().getNameAssignment_1(), "rule__TZVISOR__NameAssignment_1");
					put(grammarAccess.getTZVISORAccess().getVariablesAssignment_3_0(), "rule__TZVISOR__VariablesAssignment_3_0");
					put(grammarAccess.getTZVISORAccess().getConstantAssignment_3_1(), "rule__TZVISOR__ConstantAssignment_3_1");
					put(grammarAccess.getTZVISORAccess().getModuleAssignment_3_2(), "rule__TZVISOR__ModuleAssignment_3_2");
					put(grammarAccess.getMODULEAccess().getNameAssignment_1(), "rule__MODULE__NameAssignment_1");
					put(grammarAccess.getMODULEAccess().getLabelAssignment_3_0(), "rule__MODULE__LabelAssignment_3_0");
					put(grammarAccess.getMODULEAccess().getSuperTypeAssignment_3_1(), "rule__MODULE__SuperTypeAssignment_3_1");
					put(grammarAccess.getLABELAccess().getNameAssignment_0(), "rule__LABEL__NameAssignment_0");
					put(grammarAccess.getLABELAccess().getSuperTypeAssignment_2_1(), "rule__LABEL__SuperTypeAssignment_2_1");
					put(grammarAccess.getCONSTANTAccess().getNameAssignment_1(), "rule__CONSTANT__NameAssignment_1");
					put(grammarAccess.getVARIABLESAccess().getSuperTypeAssignment_0(), "rule__VARIABLES__SuperTypeAssignment_0");
					put(grammarAccess.getVARIABLESAccess().getSuperTypeAssignment_1_0(), "rule__VARIABLES__SuperTypeAssignment_1_0");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTZParser typedParser = (InternalTZParser) parser;
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

	public TZGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TZGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
