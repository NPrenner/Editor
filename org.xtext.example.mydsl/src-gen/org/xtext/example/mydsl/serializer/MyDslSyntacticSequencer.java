package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Alternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a;
	protected AbstractElementAlias match_Alternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a;
	protected AbstractElementAlias match_BooleanQuery_ExclamationMarkKeyword_0_q;
	protected AbstractElementAlias match_BraceQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0;
	protected AbstractElementAlias match_BraceQuery_ExclamationMarkKeyword_0_q;
	protected AbstractElementAlias match_IFQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0;
	protected AbstractElementAlias match_IFQuery___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;
	protected AbstractElementAlias match_PlayerQuery_ExclamationMarkKeyword_0_q;
	protected AbstractElementAlias match_StartAlternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a;
	protected AbstractElementAlias match_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a;
	protected AbstractElementAlias match_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__p;
	protected AbstractElementAlias match_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a;
	protected AbstractElementAlias match_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__p;
	protected AbstractElementAlias match_StartTimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a;
	protected AbstractElementAlias match_TimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a;
	protected AbstractElementAlias match_TimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_Alternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAlternativeAccess().getOrKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_9_3()));
		match_Alternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_9_3()), new TokenAlias(false, false, grammarAccess.getAlternativeAccess().getOrKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_9_1()));
		match_BooleanQuery_ExclamationMarkKeyword_0_q = new TokenAlias(false, true, grammarAccess.getBooleanQueryAccess().getExclamationMarkKeyword_0());
		match_BraceQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBraceQueryAccess().getAmpersandAmpersandKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getBraceQueryAccess().getVerticalLineVerticalLineKeyword_3_0_0()));
		match_BraceQuery_ExclamationMarkKeyword_0_q = new TokenAlias(false, true, grammarAccess.getBraceQueryAccess().getExclamationMarkKeyword_0());
		match_IFQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIFQueryAccess().getAmpersandAmpersandKeyword_3_0_1()), new TokenAlias(false, false, grammarAccess.getIFQueryAccess().getVerticalLineVerticalLineKeyword_3_0_0()));
		match_IFQuery___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIFQueryAccess().getElseKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getIFQueryAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getIFQueryAccess().getRightCurlyBracketKeyword_8_3()));
		match_PlayerQuery_ExclamationMarkKeyword_0_q = new TokenAlias(false, true, grammarAccess.getPlayerQueryAccess().getExclamationMarkKeyword_0());
		match_StartAlternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStartAlternativeAccess().getOrKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getStartAlternativeAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getStartAlternativeAccess().getRightCurlyBracketKeyword_9_3()));
		match_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStartAlternativeAccess().getRightCurlyBracketKeyword_9_3()), new TokenAlias(false, false, grammarAccess.getStartAlternativeAccess().getOrKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getStartAlternativeAccess().getLeftCurlyBracketKeyword_9_1()));
		match_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getStartAlternativeAccess().getRightCurlyBracketKeyword_9_3()), new TokenAlias(false, false, grammarAccess.getStartAlternativeAccess().getOrKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getStartAlternativeAccess().getLeftCurlyBracketKeyword_9_1()));
		match_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStartTimeAlternativeAccess().getRightCurlyBracketKeyword_9_3()), new TokenAlias(false, false, grammarAccess.getStartTimeAlternativeAccess().getSometimesKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getStartTimeAlternativeAccess().getLeftCurlyBracketKeyword_9_1()));
		match_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getStartTimeAlternativeAccess().getRightCurlyBracketKeyword_9_3()), new TokenAlias(false, false, grammarAccess.getStartTimeAlternativeAccess().getSometimesKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getStartTimeAlternativeAccess().getLeftCurlyBracketKeyword_9_1()));
		match_StartTimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStartTimeAlternativeAccess().getSometimesKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getStartTimeAlternativeAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getStartTimeAlternativeAccess().getRightCurlyBracketKeyword_9_3()));
		match_TimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTimeAlternativeAccess().getRightCurlyBracketKeyword_9_3()), new TokenAlias(false, false, grammarAccess.getTimeAlternativeAccess().getSometimesKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getTimeAlternativeAccess().getLeftCurlyBracketKeyword_9_1()));
		match_TimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTimeAlternativeAccess().getSometimesKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getTimeAlternativeAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getTimeAlternativeAccess().getRightCurlyBracketKeyword_9_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Alternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a.equals(syntax))
				emit_Alternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Alternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a.equals(syntax))
				emit_Alternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BooleanQuery_ExclamationMarkKeyword_0_q.equals(syntax))
				emit_BooleanQuery_ExclamationMarkKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BraceQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0.equals(syntax))
				emit_BraceQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BraceQuery_ExclamationMarkKeyword_0_q.equals(syntax))
				emit_BraceQuery_ExclamationMarkKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IFQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0.equals(syntax))
				emit_IFQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IFQuery___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q.equals(syntax))
				emit_IFQuery___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PlayerQuery_ExclamationMarkKeyword_0_q.equals(syntax))
				emit_PlayerQuery_ExclamationMarkKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StartAlternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a.equals(syntax))
				emit_StartAlternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a.equals(syntax))
				emit_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__p.equals(syntax))
				emit_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a.equals(syntax))
				emit_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__p.equals(syntax))
				emit_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StartTimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a.equals(syntax))
				emit_StartTimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a.equals(syntax))
				emit_TimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a.equals(syntax))
				emit_TimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('or' '{' '}')*
	 */
	protected void emit_Alternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'or' '{')*
	 */
	protected void emit_Alternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!'?
	 */
	protected void emit_BooleanQuery_ExclamationMarkKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '||' | '&&'
	 */
	protected void emit_BraceQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!'?
	 */
	protected void emit_BraceQuery_ExclamationMarkKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '||' | '&&'
	 */
	protected void emit_IFQuery_AmpersandAmpersandKeyword_3_0_1_or_VerticalLineVerticalLineKeyword_3_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('else' '{' '}')?
	 */
	protected void emit_IFQuery___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!'?
	 */
	protected void emit_PlayerQuery_ExclamationMarkKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('or' '{' '}')*
	 */
	protected void emit_StartAlternative___OrKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'or' '{')*
	 */
	protected void emit_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'or' '{')+
	 */
	protected void emit_StartAlternative___RightCurlyBracketKeyword_9_3_OrKeyword_9_0_LeftCurlyBracketKeyword_9_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'sometimes' '{')*
	 */
	protected void emit_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'sometimes' '{')+
	 */
	protected void emit_StartTimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('sometimes' '{' '}')*
	 */
	protected void emit_StartTimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'sometimes' '{')*
	 */
	protected void emit_TimeAlternative___RightCurlyBracketKeyword_9_3_SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('sometimes' '{' '}')*
	 */
	protected void emit_TimeAlternative___SometimesKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
