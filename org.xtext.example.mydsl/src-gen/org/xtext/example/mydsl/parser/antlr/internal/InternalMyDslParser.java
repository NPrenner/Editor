package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'DataPackage'", "';'", "'Datatype'", "'{'", "'}'", "'SystemPackage'", "'Systemtype'", "'ChannelPackage'", "'asynchronous'", "'synchronous'", "'Channel'", "'RolePackage'", "'Roletype'", "'state'", "'task'", "'('", "','", "')'", "'message'", "'function'", "'returns'", "'boolean'", "'InterviewPackage'", "'Interview'", "'main'", "'system'", "'data'", "'insideRole'", "'outsideRole'", "'process'", "'start'", "'followed'", "'mostly'", "'sometimes'", "'alt'", "'or'", "'loop'", "'['", "'*'", "']'", "'if'", "'||'", "'&&'", "'else'", "'!'", "'is'", "'true'", "'false'", "'!='", "'=='", "'.'", "'im'", "'unim'", "'can'", "'must'", "'send'", "'to'", "'via'", "'do'", "'='", "'systemwork'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleDomainmodel returns [EObject current=null] : ( ( (lv_element_0_1= ruleInterview | lv_element_0_2= ruleTypeDefinition ) ) )? ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_1 = null;

        EObject lv_element_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( ( (lv_element_0_1= ruleInterview | lv_element_0_2= ruleTypeDefinition ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_element_0_1= ruleInterview | lv_element_0_2= ruleTypeDefinition ) ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_element_0_1= ruleInterview | lv_element_0_2= ruleTypeDefinition ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( (lv_element_0_1= ruleInterview | lv_element_0_2= ruleTypeDefinition ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( (lv_element_0_1= ruleInterview | lv_element_0_2= ruleTypeDefinition ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_element_0_1= ruleInterview | lv_element_0_2= ruleTypeDefinition )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_element_0_1= ruleInterview | lv_element_0_2= ruleTypeDefinition )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==11) ) {
                        int LA1_1 = input.LA(2);

                        if ( (LA1_1==34) ) {
                            alt1=1;
                        }
                        else if ( (LA1_1==12||LA1_1==17||LA1_1==19||LA1_1==23) ) {
                            alt1=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:83:3: lv_element_0_1= ruleInterview
                            {
                             
                            	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementInterviewParserRuleCall_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleInterview_in_ruleDomainmodel132);
                            lv_element_0_1=ruleInterview();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"element",
                                    		lv_element_0_1, 
                                    		"Interview");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:98:8: lv_element_0_2= ruleTypeDefinition
                            {
                             
                            	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementTypeDefinitionParserRuleCall_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeDefinition_in_ruleDomainmodel151);
                            lv_element_0_2=ruleTypeDefinition();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"element",
                                    		lv_element_0_2, 
                                    		"TypeDefinition");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition190);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:1: ruleTypeDefinition returns [EObject current=null] : (this_Systemtype_0= ruleSystemtype | this_ChannelDefintion_1= ruleChannelDefintion | this_Datatype_2= ruleDatatype | this_Roletype_3= ruleRoletype ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Systemtype_0 = null;

        EObject this_ChannelDefintion_1 = null;

        EObject this_Datatype_2 = null;

        EObject this_Roletype_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:28: ( (this_Systemtype_0= ruleSystemtype | this_ChannelDefintion_1= ruleChannelDefintion | this_Datatype_2= ruleDatatype | this_Roletype_3= ruleRoletype ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:1: (this_Systemtype_0= ruleSystemtype | this_ChannelDefintion_1= ruleChannelDefintion | this_Datatype_2= ruleDatatype | this_Roletype_3= ruleRoletype )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:1: (this_Systemtype_0= ruleSystemtype | this_ChannelDefintion_1= ruleChannelDefintion | this_Datatype_2= ruleDatatype | this_Roletype_3= ruleRoletype )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    alt3=3;
                    }
                    break;
                case 17:
                    {
                    alt3=1;
                    }
                    break;
                case 19:
                    {
                    alt3=2;
                    }
                    break;
                case 23:
                    {
                    alt3=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:5: this_Systemtype_0= ruleSystemtype
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSystemtypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSystemtype_in_ruleTypeDefinition247);
                    this_Systemtype_0=ruleSystemtype();

                    state._fsp--;

                     
                            current = this_Systemtype_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:5: this_ChannelDefintion_1= ruleChannelDefintion
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDefinitionAccess().getChannelDefintionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChannelDefintion_in_ruleTypeDefinition274);
                    this_ChannelDefintion_1=ruleChannelDefintion();

                    state._fsp--;

                     
                            current = this_ChannelDefintion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:5: this_Datatype_2= ruleDatatype
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDefinitionAccess().getDatatypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDatatype_in_ruleTypeDefinition301);
                    this_Datatype_2=ruleDatatype();

                    state._fsp--;

                     
                            current = this_Datatype_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:168:5: this_Roletype_3= ruleRoletype
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDefinitionAccess().getRoletypeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRoletype_in_ruleTypeDefinition328);
                    this_Roletype_3=ruleRoletype();

                    state._fsp--;

                     
                            current = this_Roletype_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleDatatype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:184:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:185:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:186:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype363);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:193:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'package' ( (lv_package_1_0= 'DataPackage' ) ) otherlv_2= ';' otherlv_3= 'Datatype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}' ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_package_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:196:28: ( (otherlv_0= 'package' ( (lv_package_1_0= 'DataPackage' ) ) otherlv_2= ';' otherlv_3= 'Datatype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:1: (otherlv_0= 'package' ( (lv_package_1_0= 'DataPackage' ) ) otherlv_2= ';' otherlv_3= 'Datatype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:1: (otherlv_0= 'package' ( (lv_package_1_0= 'DataPackage' ) ) otherlv_2= ';' otherlv_3= 'Datatype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:3: otherlv_0= 'package' ( (lv_package_1_0= 'DataPackage' ) ) otherlv_2= ';' otherlv_3= 'Datatype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDatatype410); 

                	newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getPackageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:201:1: ( (lv_package_1_0= 'DataPackage' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:202:1: (lv_package_1_0= 'DataPackage' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:202:1: (lv_package_1_0= 'DataPackage' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:3: lv_package_1_0= 'DataPackage'
            {
            lv_package_1_0=(Token)match(input,12,FOLLOW_12_in_ruleDatatype428); 

                    newLeafNode(lv_package_1_0, grammarAccess.getDatatypeAccess().getPackageDataPackageKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatatypeRule());
            	        }
                   		setWithLastConsumed(current, "package", lv_package_1_0, "DataPackage");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDatatype453); 

                	newLeafNode(otherlv_2, grammarAccess.getDatatypeAccess().getSemicolonKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDatatype465); 

                	newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getDatatypeKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:224:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:225:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:225:1: (lv_name_4_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:226:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatatype482); 

            			newLeafNode(lv_name_4_0, grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatatypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDatatype499); 

                	newLeafNode(otherlv_5, grammarAccess.getDatatypeAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleDatatype511); 

                	newLeafNode(otherlv_6, grammarAccess.getDatatypeAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleSystemtype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:258:1: entryRuleSystemtype returns [EObject current=null] : iv_ruleSystemtype= ruleSystemtype EOF ;
    public final EObject entryRuleSystemtype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemtype = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:259:2: (iv_ruleSystemtype= ruleSystemtype EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:260:2: iv_ruleSystemtype= ruleSystemtype EOF
            {
             newCompositeNode(grammarAccess.getSystemtypeRule()); 
            pushFollow(FOLLOW_ruleSystemtype_in_entryRuleSystemtype547);
            iv_ruleSystemtype=ruleSystemtype();

            state._fsp--;

             current =iv_ruleSystemtype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemtype557); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemtype"


    // $ANTLR start "ruleSystemtype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:1: ruleSystemtype returns [EObject current=null] : (otherlv_0= 'package' ( (lv_package_1_0= 'SystemPackage' ) ) otherlv_2= ';' otherlv_3= 'Systemtype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_functions_6_0= ruleFunction ) )* otherlv_7= '}' ) ;
    public final EObject ruleSystemtype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_package_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_functions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:270:28: ( (otherlv_0= 'package' ( (lv_package_1_0= 'SystemPackage' ) ) otherlv_2= ';' otherlv_3= 'Systemtype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_functions_6_0= ruleFunction ) )* otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:1: (otherlv_0= 'package' ( (lv_package_1_0= 'SystemPackage' ) ) otherlv_2= ';' otherlv_3= 'Systemtype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_functions_6_0= ruleFunction ) )* otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:1: (otherlv_0= 'package' ( (lv_package_1_0= 'SystemPackage' ) ) otherlv_2= ';' otherlv_3= 'Systemtype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_functions_6_0= ruleFunction ) )* otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:271:3: otherlv_0= 'package' ( (lv_package_1_0= 'SystemPackage' ) ) otherlv_2= ';' otherlv_3= 'Systemtype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_functions_6_0= ruleFunction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSystemtype594); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemtypeAccess().getPackageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: ( (lv_package_1_0= 'SystemPackage' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_package_1_0= 'SystemPackage' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_package_1_0= 'SystemPackage' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:277:3: lv_package_1_0= 'SystemPackage'
            {
            lv_package_1_0=(Token)match(input,17,FOLLOW_17_in_ruleSystemtype612); 

                    newLeafNode(lv_package_1_0, grammarAccess.getSystemtypeAccess().getPackageSystemPackageKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemtypeRule());
            	        }
                   		setWithLastConsumed(current, "package", lv_package_1_0, "SystemPackage");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSystemtype637); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemtypeAccess().getSemicolonKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleSystemtype649); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemtypeAccess().getSystemtypeKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:298:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: (lv_name_4_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemtype666); 

            			newLeafNode(lv_name_4_0, grammarAccess.getSystemtypeAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemtypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSystemtype683); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemtypeAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:320:1: ( (lv_functions_6_0= ruleFunction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:321:1: (lv_functions_6_0= ruleFunction )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:321:1: (lv_functions_6_0= ruleFunction )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:322:3: lv_functions_6_0= ruleFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemtypeAccess().getFunctionsFunctionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleSystemtype704);
            	    lv_functions_6_0=ruleFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemtypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functions",
            	            		lv_functions_6_0, 
            	            		"Function");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleSystemtype717); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemtypeAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemtype"


    // $ANTLR start "entryRuleChannelDefintion"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: entryRuleChannelDefintion returns [EObject current=null] : iv_ruleChannelDefintion= ruleChannelDefintion EOF ;
    public final EObject entryRuleChannelDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDefintion = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:2: (iv_ruleChannelDefintion= ruleChannelDefintion EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:2: iv_ruleChannelDefintion= ruleChannelDefintion EOF
            {
             newCompositeNode(grammarAccess.getChannelDefintionRule()); 
            pushFollow(FOLLOW_ruleChannelDefintion_in_entryRuleChannelDefintion753);
            iv_ruleChannelDefintion=ruleChannelDefintion();

            state._fsp--;

             current =iv_ruleChannelDefintion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChannelDefintion763); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannelDefintion"


    // $ANTLR start "ruleChannelDefintion"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:359:1: ruleChannelDefintion returns [EObject current=null] : (otherlv_0= 'package' ( (lv_package_1_0= 'ChannelPackage' ) ) otherlv_2= ';' ( ( (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' ) ) )? otherlv_4= 'Channel' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= '}' ) ;
    public final EObject ruleChannelDefintion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_package_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:28: ( (otherlv_0= 'package' ( (lv_package_1_0= 'ChannelPackage' ) ) otherlv_2= ';' ( ( (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' ) ) )? otherlv_4= 'Channel' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: (otherlv_0= 'package' ( (lv_package_1_0= 'ChannelPackage' ) ) otherlv_2= ';' ( ( (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' ) ) )? otherlv_4= 'Channel' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: (otherlv_0= 'package' ( (lv_package_1_0= 'ChannelPackage' ) ) otherlv_2= ';' ( ( (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' ) ) )? otherlv_4= 'Channel' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:3: otherlv_0= 'package' ( (lv_package_1_0= 'ChannelPackage' ) ) otherlv_2= ';' ( ( (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' ) ) )? otherlv_4= 'Channel' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleChannelDefintion800); 

                	newLeafNode(otherlv_0, grammarAccess.getChannelDefintionAccess().getPackageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:367:1: ( (lv_package_1_0= 'ChannelPackage' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:1: (lv_package_1_0= 'ChannelPackage' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:1: (lv_package_1_0= 'ChannelPackage' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:3: lv_package_1_0= 'ChannelPackage'
            {
            lv_package_1_0=(Token)match(input,19,FOLLOW_19_in_ruleChannelDefintion818); 

                    newLeafNode(lv_package_1_0, grammarAccess.getChannelDefintionAccess().getPackageChannelPackageKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChannelDefintionRule());
            	        }
                   		setWithLastConsumed(current, "package", lv_package_1_0, "ChannelPackage");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleChannelDefintion843); 

                	newLeafNode(otherlv_2, grammarAccess.getChannelDefintionAccess().getSemicolonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:1: ( ( (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:1: ( (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:1: ( (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:1: (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:1: (lv_type_3_1= 'asynchronous' | lv_type_3_2= 'synchronous' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==20) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==21) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:389:3: lv_type_3_1= 'asynchronous'
                            {
                            lv_type_3_1=(Token)match(input,20,FOLLOW_20_in_ruleChannelDefintion863); 

                                    newLeafNode(lv_type_3_1, grammarAccess.getChannelDefintionAccess().getTypeAsynchronousKeyword_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getChannelDefintionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:401:8: lv_type_3_2= 'synchronous'
                            {
                            lv_type_3_2=(Token)match(input,21,FOLLOW_21_in_ruleChannelDefintion892); 

                                    newLeafNode(lv_type_3_2, grammarAccess.getChannelDefintionAccess().getTypeSynchronousKeyword_3_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getChannelDefintionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_3_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleChannelDefintion921); 

                	newLeafNode(otherlv_4, grammarAccess.getChannelDefintionAccess().getChannelKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:1: (lv_name_5_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChannelDefintion938); 

            			newLeafNode(lv_name_5_0, grammarAccess.getChannelDefintionAccess().getNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChannelDefintionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleChannelDefintion955); 

                	newLeafNode(otherlv_6, grammarAccess.getChannelDefintionAccess().getLeftCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleChannelDefintion967); 

                	newLeafNode(otherlv_7, grammarAccess.getChannelDefintionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannelDefintion"


    // $ANTLR start "entryRuleRoletype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:1: entryRuleRoletype returns [EObject current=null] : iv_ruleRoletype= ruleRoletype EOF ;
    public final EObject entryRuleRoletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoletype = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:455:2: (iv_ruleRoletype= ruleRoletype EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:456:2: iv_ruleRoletype= ruleRoletype EOF
            {
             newCompositeNode(grammarAccess.getRoletypeRule()); 
            pushFollow(FOLLOW_ruleRoletype_in_entryRuleRoletype1003);
            iv_ruleRoletype=ruleRoletype();

            state._fsp--;

             current =iv_ruleRoletype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoletype1013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoletype"


    // $ANTLR start "ruleRoletype"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:1: ruleRoletype returns [EObject current=null] : (otherlv_0= 'package' ( (lv_package_1_0= 'RolePackage' ) ) otherlv_2= ';' otherlv_3= 'Roletype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_state_6_0= ruleState ) )* ( (lv_tasks_7_0= ruleTask ) )* ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}' ) ;
    public final EObject ruleRoletype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_package_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_state_6_0 = null;

        EObject lv_tasks_7_0 = null;

        EObject lv_messages_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:28: ( (otherlv_0= 'package' ( (lv_package_1_0= 'RolePackage' ) ) otherlv_2= ';' otherlv_3= 'Roletype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_state_6_0= ruleState ) )* ( (lv_tasks_7_0= ruleTask ) )* ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:467:1: (otherlv_0= 'package' ( (lv_package_1_0= 'RolePackage' ) ) otherlv_2= ';' otherlv_3= 'Roletype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_state_6_0= ruleState ) )* ( (lv_tasks_7_0= ruleTask ) )* ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:467:1: (otherlv_0= 'package' ( (lv_package_1_0= 'RolePackage' ) ) otherlv_2= ';' otherlv_3= 'Roletype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_state_6_0= ruleState ) )* ( (lv_tasks_7_0= ruleTask ) )* ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:467:3: otherlv_0= 'package' ( (lv_package_1_0= 'RolePackage' ) ) otherlv_2= ';' otherlv_3= 'Roletype' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_state_6_0= ruleState ) )* ( (lv_tasks_7_0= ruleTask ) )* ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRoletype1050); 

                	newLeafNode(otherlv_0, grammarAccess.getRoletypeAccess().getPackageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:471:1: ( (lv_package_1_0= 'RolePackage' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:1: (lv_package_1_0= 'RolePackage' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:1: (lv_package_1_0= 'RolePackage' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:473:3: lv_package_1_0= 'RolePackage'
            {
            lv_package_1_0=(Token)match(input,23,FOLLOW_23_in_ruleRoletype1068); 

                    newLeafNode(lv_package_1_0, grammarAccess.getRoletypeAccess().getPackageRolePackageKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoletypeRule());
            	        }
                   		setWithLastConsumed(current, "package", lv_package_1_0, "RolePackage");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleRoletype1093); 

                	newLeafNode(otherlv_2, grammarAccess.getRoletypeAccess().getSemicolonKeyword_2());
                
            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleRoletype1105); 

                	newLeafNode(otherlv_3, grammarAccess.getRoletypeAccess().getRoletypeKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:494:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:495:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:495:1: (lv_name_4_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRoletype1122); 

            			newLeafNode(lv_name_4_0, grammarAccess.getRoletypeAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoletypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleRoletype1139); 

                	newLeafNode(otherlv_5, grammarAccess.getRoletypeAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:1: ( (lv_state_6_0= ruleState ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:517:1: (lv_state_6_0= ruleState )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:517:1: (lv_state_6_0= ruleState )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:518:3: lv_state_6_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoletypeAccess().getStateStateParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleRoletype1160);
            	    lv_state_6_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoletypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"state",
            	            		lv_state_6_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:534:3: ( (lv_tasks_7_0= ruleTask ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:535:1: (lv_tasks_7_0= ruleTask )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:535:1: (lv_tasks_7_0= ruleTask )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:3: lv_tasks_7_0= ruleTask
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoletypeAccess().getTasksTaskParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTask_in_ruleRoletype1182);
            	    lv_tasks_7_0=ruleTask();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoletypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tasks",
            	            		lv_tasks_7_0, 
            	            		"Task");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:552:3: ( (lv_messages_8_0= ruleMessage ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:553:1: (lv_messages_8_0= ruleMessage )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:553:1: (lv_messages_8_0= ruleMessage )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:554:3: lv_messages_8_0= ruleMessage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoletypeAccess().getMessagesMessageParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessage_in_ruleRoletype1204);
            	    lv_messages_8_0=ruleMessage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoletypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"messages",
            	            		lv_messages_8_0, 
            	            		"Message");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleRoletype1217); 

                	newLeafNode(otherlv_9, grammarAccess.getRoletypeAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoletype"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:582:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:583:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:584:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1253);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1263); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleState1300); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:600:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:600:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:601:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState1317); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleState1334); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTask"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:629:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:630:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:631:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask1370);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask1380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:28: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:1: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:1: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTask1417); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1434); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleTask1451); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:1: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:2: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:669:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:669:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTaskRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1472); 

                    		newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getParameterParameterCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:681:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==28) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:681:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleTask1485); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:686:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:686:1: (otherlv_5= RULE_ID )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1505); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getParameterParameterCrossReference_3_1_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleTask1521); 

                	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleTask1533); 

                	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleMessage"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:2: (iv_ruleMessage= ruleMessage EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:716:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1569);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1579); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:723:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:726:28: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:1: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:727:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleMessage1616); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1633); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleMessage1650); 

                	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:1: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:2: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1671); 

                    		newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getParameterParameterCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==28) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMessage1684); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:771:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:771:1: (otherlv_5= RULE_ID )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMessageRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1704); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getParameterParameterCrossReference_3_1_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleMessage1720); 

                	newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleMessage1732); 

                	newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:800:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:801:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1768);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1778); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ( ( (lv_returnValue_7_0= 'returns' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_returnBool_9_0= 'boolean' ) )? )? otherlv_10= ';' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_returnValue_7_0=null;
        Token otherlv_8=null;
        Token lv_returnBool_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ( ( (lv_returnValue_7_0= 'returns' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_returnBool_9_0= 'boolean' ) )? )? otherlv_10= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ( ( (lv_returnValue_7_0= 'returns' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_returnBool_9_0= 'boolean' ) )? )? otherlv_10= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ( ( (lv_returnValue_7_0= 'returns' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_returnBool_9_0= 'boolean' ) )? )? otherlv_10= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ( ( (lv_returnValue_7_0= 'returns' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_returnBool_9_0= 'boolean' ) )? )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleFunction1815); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:816:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:817:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:817:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:818:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1832); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleFunction1849); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:1: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:2: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:840:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1870); 

                    		newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getParameterParameterCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==28) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleFunction1883); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:1: (otherlv_5= RULE_ID )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:857:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1903); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getParameterParameterCrossReference_3_1_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleFunction1919); 

                	newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:1: ( ( (lv_returnValue_7_0= 'returns' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_returnBool_9_0= 'boolean' ) )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:2: ( (lv_returnValue_7_0= 'returns' ) ) ( (otherlv_8= RULE_ID ) )? ( (lv_returnBool_9_0= 'boolean' ) )?
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:2: ( (lv_returnValue_7_0= 'returns' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (lv_returnValue_7_0= 'returns' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (lv_returnValue_7_0= 'returns' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:3: lv_returnValue_7_0= 'returns'
                    {
                    lv_returnValue_7_0=(Token)match(input,32,FOLLOW_32_in_ruleFunction1938); 

                            newLeafNode(lv_returnValue_7_0, grammarAccess.getFunctionAccess().getReturnValueReturnsKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionRule());
                    	        }
                           		setWithLastConsumed(current, "returnValue", true, "returns");
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:887:2: ( (otherlv_8= RULE_ID ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:1: (otherlv_8= RULE_ID )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:1: (otherlv_8= RULE_ID )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:3: otherlv_8= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionRule());
                            	        }
                                    
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1971); 

                            		newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getReturnArgumentTypeDefinitionCrossReference_5_1_0()); 
                            	

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:900:3: ( (lv_returnBool_9_0= 'boolean' ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==33) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:901:1: (lv_returnBool_9_0= 'boolean' )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:901:1: (lv_returnBool_9_0= 'boolean' )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:902:3: lv_returnBool_9_0= 'boolean'
                            {
                            lv_returnBool_9_0=(Token)match(input,33,FOLLOW_33_in_ruleFunction1990); 

                                    newLeafNode(lv_returnBool_9_0, grammarAccess.getFunctionAccess().getReturnBoolBooleanKeyword_5_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionRule());
                            	        }
                                   		setWithLastConsumed(current, "returnBool", lv_returnBool_9_0, "boolean");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleFunction2018); 

                	newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleInterview"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:927:1: entryRuleInterview returns [EObject current=null] : iv_ruleInterview= ruleInterview EOF ;
    public final EObject entryRuleInterview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterview = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:928:2: (iv_ruleInterview= ruleInterview EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:2: iv_ruleInterview= ruleInterview EOF
            {
             newCompositeNode(grammarAccess.getInterviewRule()); 
            pushFollow(FOLLOW_ruleInterview_in_entryRuleInterview2054);
            iv_ruleInterview=ruleInterview();

            state._fsp--;

             current =iv_ruleInterview; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterview2064); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterview"


    // $ANTLR start "ruleInterview"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:1: ruleInterview returns [EObject current=null] : (otherlv_0= 'package' ( (lv_package_1_0= 'InterviewPackage' ) ) otherlv_2= ';' otherlv_3= 'Interview' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '{' otherlv_6= 'main' ( (lv_mainrole_7_0= ruleRole ) ) ( (lv_objects_8_0= ruleObject ) )* ( (lv_process_9_0= ruleBusinessProcess ) )* otherlv_10= '}' ) ;
    public final EObject ruleInterview() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_package_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_mainrole_7_0 = null;

        EObject lv_objects_8_0 = null;

        EObject lv_process_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:939:28: ( (otherlv_0= 'package' ( (lv_package_1_0= 'InterviewPackage' ) ) otherlv_2= ';' otherlv_3= 'Interview' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '{' otherlv_6= 'main' ( (lv_mainrole_7_0= ruleRole ) ) ( (lv_objects_8_0= ruleObject ) )* ( (lv_process_9_0= ruleBusinessProcess ) )* otherlv_10= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:940:1: (otherlv_0= 'package' ( (lv_package_1_0= 'InterviewPackage' ) ) otherlv_2= ';' otherlv_3= 'Interview' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '{' otherlv_6= 'main' ( (lv_mainrole_7_0= ruleRole ) ) ( (lv_objects_8_0= ruleObject ) )* ( (lv_process_9_0= ruleBusinessProcess ) )* otherlv_10= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:940:1: (otherlv_0= 'package' ( (lv_package_1_0= 'InterviewPackage' ) ) otherlv_2= ';' otherlv_3= 'Interview' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '{' otherlv_6= 'main' ( (lv_mainrole_7_0= ruleRole ) ) ( (lv_objects_8_0= ruleObject ) )* ( (lv_process_9_0= ruleBusinessProcess ) )* otherlv_10= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:940:3: otherlv_0= 'package' ( (lv_package_1_0= 'InterviewPackage' ) ) otherlv_2= ';' otherlv_3= 'Interview' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '{' otherlv_6= 'main' ( (lv_mainrole_7_0= ruleRole ) ) ( (lv_objects_8_0= ruleObject ) )* ( (lv_process_9_0= ruleBusinessProcess ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInterview2101); 

                	newLeafNode(otherlv_0, grammarAccess.getInterviewAccess().getPackageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:1: ( (lv_package_1_0= 'InterviewPackage' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:945:1: (lv_package_1_0= 'InterviewPackage' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:945:1: (lv_package_1_0= 'InterviewPackage' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:3: lv_package_1_0= 'InterviewPackage'
            {
            lv_package_1_0=(Token)match(input,34,FOLLOW_34_in_ruleInterview2119); 

                    newLeafNode(lv_package_1_0, grammarAccess.getInterviewAccess().getPackageInterviewPackageKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterviewRule());
            	        }
                   		setWithLastConsumed(current, "package", lv_package_1_0, "InterviewPackage");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleInterview2144); 

                	newLeafNode(otherlv_2, grammarAccess.getInterviewAccess().getSemicolonKeyword_2());
                
            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleInterview2156); 

                	newLeafNode(otherlv_3, grammarAccess.getInterviewAccess().getInterviewKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:1: ( (lv_name_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:1: (lv_name_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:1: (lv_name_4_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:969:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterview2173); 

            			newLeafNode(lv_name_4_0, grammarAccess.getInterviewAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterviewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleInterview2190); 

                	newLeafNode(otherlv_5, grammarAccess.getInterviewAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleInterview2202); 

                	newLeafNode(otherlv_6, grammarAccess.getInterviewAccess().getMainKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:993:1: ( (lv_mainrole_7_0= ruleRole ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:1: (lv_mainrole_7_0= ruleRole )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:1: (lv_mainrole_7_0= ruleRole )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:995:3: lv_mainrole_7_0= ruleRole
            {
             
            	        newCompositeNode(grammarAccess.getInterviewAccess().getMainroleRoleParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRole_in_ruleInterview2223);
            lv_mainrole_7_0=ruleRole();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterviewRule());
            	        }
                   		set(
                   			current, 
                   			"mainrole",
                    		lv_mainrole_7_0, 
                    		"Role");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1011:2: ( (lv_objects_8_0= ruleObject ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33||(LA19_0>=37 && LA19_0<=40)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: (lv_objects_8_0= ruleObject )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: (lv_objects_8_0= ruleObject )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1013:3: lv_objects_8_0= ruleObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterviewAccess().getObjectsObjectParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObject_in_ruleInterview2244);
            	    lv_objects_8_0=ruleObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterviewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objects",
            	            		lv_objects_8_0, 
            	            		"Object");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1029:3: ( (lv_process_9_0= ruleBusinessProcess ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:1: (lv_process_9_0= ruleBusinessProcess )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:1: (lv_process_9_0= ruleBusinessProcess )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1031:3: lv_process_9_0= ruleBusinessProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterviewAccess().getProcessBusinessProcessParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBusinessProcess_in_ruleInterview2266);
            	    lv_process_9_0=ruleBusinessProcess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterviewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"process",
            	            		lv_process_9_0, 
            	            		"BusinessProcess");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleInterview2279); 

                	newLeafNode(otherlv_10, grammarAccess.getInterviewAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterview"


    // $ANTLR start "entryRuleObject"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1059:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1060:2: (iv_ruleObject= ruleObject EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject2315);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject2325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1068:1: ruleObject returns [EObject current=null] : (this_Data_0= ruleData | this_Role_1= ruleRole | this_System_2= ruleSystem | this_Boolean_3= ruleBoolean ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject this_Data_0 = null;

        EObject this_Role_1 = null;

        EObject this_System_2 = null;

        EObject this_Boolean_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:28: ( (this_Data_0= ruleData | this_Role_1= ruleRole | this_System_2= ruleSystem | this_Boolean_3= ruleBoolean ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:1: (this_Data_0= ruleData | this_Role_1= ruleRole | this_System_2= ruleSystem | this_Boolean_3= ruleBoolean )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:1: (this_Data_0= ruleData | this_Role_1= ruleRole | this_System_2= ruleSystem | this_Boolean_3= ruleBoolean )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt21=1;
                }
                break;
            case 39:
            case 40:
                {
                alt21=2;
                }
                break;
            case 37:
                {
                alt21=3;
                }
                break;
            case 33:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:5: this_Data_0= ruleData
                    {
                     
                            newCompositeNode(grammarAccess.getObjectAccess().getDataParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleData_in_ruleObject2372);
                    this_Data_0=ruleData();

                    state._fsp--;

                     
                            current = this_Data_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:5: this_Role_1= ruleRole
                    {
                     
                            newCompositeNode(grammarAccess.getObjectAccess().getRoleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRole_in_ruleObject2399);
                    this_Role_1=ruleRole();

                    state._fsp--;

                     
                            current = this_Role_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:5: this_System_2= ruleSystem
                    {
                     
                            newCompositeNode(grammarAccess.getObjectAccess().getSystemParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSystem_in_ruleObject2426);
                    this_System_2=ruleSystem();

                    state._fsp--;

                     
                            current = this_System_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:5: this_Boolean_3= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getObjectAccess().getBooleanParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBoolean_in_ruleObject2453);
                    this_Boolean_3=ruleBoolean();

                    state._fsp--;

                     
                            current = this_Boolean_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1119:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2488);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:1: ruleBoolean returns [EObject current=null] : (otherlv_0= 'boolean' ( (otherlv_1= RULE_ID ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:28: ( (otherlv_0= 'boolean' ( (otherlv_1= RULE_ID ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:1: (otherlv_0= 'boolean' ( (otherlv_1= RULE_ID ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:1: (otherlv_0= 'boolean' ( (otherlv_1= RULE_ID ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:3: otherlv_0= 'boolean' ( (otherlv_1= RULE_ID ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleBoolean2535); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanAccess().getBooleanKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: ( (otherlv_1= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ID) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:1: (otherlv_1= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1138:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolean2555); 

                    		newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getTypeTypeDefinitionCrossReference_1_0()); 
                    	

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1150:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1150:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolean2573); 

            			newLeafNode(lv_name_2_0, grammarAccess.getBooleanAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBoolean2590); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleSystem"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1180:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1181:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem2626);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem2636); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:28: ( (otherlv_0= 'system' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:1: (otherlv_0= 'system' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:1: (otherlv_0= 'system' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:3: otherlv_0= 'system' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleSystem2673); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1197:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1197:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1198:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem2693); 

            		newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getTypeTypeDefinitionCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1210:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1210:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1211:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem2710); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSystem2727); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleData"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:2: (iv_ruleData= ruleData EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData2763);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData2773); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1248:1: ruleData returns [EObject current=null] : (otherlv_0= 'data' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1251:28: ( (otherlv_0= 'data' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1252:1: (otherlv_0= 'data' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1252:1: (otherlv_0= 'data' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1252:3: otherlv_0= 'data' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleData2810); 

                	newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDataKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1256:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1257:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1257:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleData2830); 

            		newLeafNode(otherlv_1, grammarAccess.getDataAccess().getTypeTypeDefinitionCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1269:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1270:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1270:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1271:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleData2847); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDataAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleData2864); 

                	newLeafNode(otherlv_3, grammarAccess.getDataAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleRole"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1299:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1300:2: (iv_ruleRole= ruleRole EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1301:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole2900);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole2910); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1308:1: ruleRole returns [EObject current=null] : ( ( ( (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_rolekind_0_1=null;
        Token lv_rolekind_0_2=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1311:28: ( ( ( ( (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:1: ( ( ( (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:1: ( ( ( (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:2: ( ( (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' ) ) ) ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:2: ( ( (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:1: ( (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:1: ( (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:1: (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:1: (lv_rolekind_0_1= 'insideRole' | lv_rolekind_0_2= 'outsideRole' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            else if ( (LA23_0==40) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1315:3: lv_rolekind_0_1= 'insideRole'
                    {
                    lv_rolekind_0_1=(Token)match(input,39,FOLLOW_39_in_ruleRole2955); 

                            newLeafNode(lv_rolekind_0_1, grammarAccess.getRoleAccess().getRolekindInsideRoleKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(current, "rolekind", lv_rolekind_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:8: lv_rolekind_0_2= 'outsideRole'
                    {
                    lv_rolekind_0_2=(Token)match(input,40,FOLLOW_40_in_ruleRole2984); 

                            newLeafNode(lv_rolekind_0_2, grammarAccess.getRoleAccess().getRolekindOutsideRoleKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(current, "rolekind", lv_rolekind_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1342:2: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1344:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole3020); 

            		newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getTypeTypeDefinitionCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1355:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1357:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole3037); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRole3054); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleBusinessProcess"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1387:1: entryRuleBusinessProcess returns [EObject current=null] : iv_ruleBusinessProcess= ruleBusinessProcess EOF ;
    public final EObject entryRuleBusinessProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessProcess = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1388:2: (iv_ruleBusinessProcess= ruleBusinessProcess EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1389:2: iv_ruleBusinessProcess= ruleBusinessProcess EOF
            {
             newCompositeNode(grammarAccess.getBusinessProcessRule()); 
            pushFollow(FOLLOW_ruleBusinessProcess_in_entryRuleBusinessProcess3092);
            iv_ruleBusinessProcess=ruleBusinessProcess();

            state._fsp--;

             current =iv_ruleBusinessProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessProcess3102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessProcess"


    // $ANTLR start "ruleBusinessProcess"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:1: ruleBusinessProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_element_3_0= ruleProcessStartElements ) )? otherlv_4= '}' ) ;
    public final EObject ruleBusinessProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1399:28: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_element_3_0= ruleProcessStartElements ) )? otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_element_3_0= ruleProcessStartElements ) )? otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_element_3_0= ruleProcessStartElements ) )? otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_element_3_0= ruleProcessStartElements ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleBusinessProcess3139); 

                	newLeafNode(otherlv_0, grammarAccess.getBusinessProcessAccess().getProcessKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1404:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessProcess3156); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBusinessProcessAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBusinessProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBusinessProcess3173); 

                	newLeafNode(otherlv_2, grammarAccess.getBusinessProcessAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1426:1: ( (lv_element_3_0= ruleProcessStartElements ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42||LA24_0==44||LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:1: (lv_element_3_0= ruleProcessStartElements )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:1: (lv_element_3_0= ruleProcessStartElements )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1428:3: lv_element_3_0= ruleProcessStartElements
                    {
                     
                    	        newCompositeNode(grammarAccess.getBusinessProcessAccess().getElementProcessStartElementsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProcessStartElements_in_ruleBusinessProcess3194);
                    lv_element_3_0=ruleProcessStartElements();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBusinessProcessRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_3_0, 
                            		"ProcessStartElements");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleBusinessProcess3207); 

                	newLeafNode(otherlv_4, grammarAccess.getBusinessProcessAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessProcess"


    // $ANTLR start "entryRuleProcessStartElements"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1456:1: entryRuleProcessStartElements returns [EObject current=null] : iv_ruleProcessStartElements= ruleProcessStartElements EOF ;
    public final EObject entryRuleProcessStartElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessStartElements = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1457:2: (iv_ruleProcessStartElements= ruleProcessStartElements EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1458:2: iv_ruleProcessStartElements= ruleProcessStartElements EOF
            {
             newCompositeNode(grammarAccess.getProcessStartElementsRule()); 
            pushFollow(FOLLOW_ruleProcessStartElements_in_entryRuleProcessStartElements3243);
            iv_ruleProcessStartElements=ruleProcessStartElements();

            state._fsp--;

             current =iv_ruleProcessStartElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessStartElements3253); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessStartElements"


    // $ANTLR start "ruleProcessStartElements"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1465:1: ruleProcessStartElements returns [EObject current=null] : (this_StartTimeAlternative_0= ruleStartTimeAlternative | this_Chart_1= ruleChart | this_StartAlternative_2= ruleStartAlternative ) ;
    public final EObject ruleProcessStartElements() throws RecognitionException {
        EObject current = null;

        EObject this_StartTimeAlternative_0 = null;

        EObject this_Chart_1 = null;

        EObject this_StartAlternative_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1468:28: ( (this_StartTimeAlternative_0= ruleStartTimeAlternative | this_Chart_1= ruleChart | this_StartAlternative_2= ruleStartAlternative ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1469:1: (this_StartTimeAlternative_0= ruleStartTimeAlternative | this_Chart_1= ruleChart | this_StartAlternative_2= ruleStartAlternative )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1469:1: (this_StartTimeAlternative_0= ruleStartTimeAlternative | this_Chart_1= ruleChart | this_StartAlternative_2= ruleStartAlternative )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt25=1;
                }
                break;
            case 42:
                {
                alt25=2;
                }
                break;
            case 46:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1470:5: this_StartTimeAlternative_0= ruleStartTimeAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getProcessStartElementsAccess().getStartTimeAlternativeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStartTimeAlternative_in_ruleProcessStartElements3300);
                    this_StartTimeAlternative_0=ruleStartTimeAlternative();

                    state._fsp--;

                     
                            current = this_StartTimeAlternative_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1480:5: this_Chart_1= ruleChart
                    {
                     
                            newCompositeNode(grammarAccess.getProcessStartElementsAccess().getChartParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChart_in_ruleProcessStartElements3327);
                    this_Chart_1=ruleChart();

                    state._fsp--;

                     
                            current = this_Chart_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1490:5: this_StartAlternative_2= ruleStartAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getProcessStartElementsAccess().getStartAlternativeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStartAlternative_in_ruleProcessStartElements3354);
                    this_StartAlternative_2=ruleStartAlternative();

                    state._fsp--;

                     
                            current = this_StartAlternative_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessStartElements"


    // $ANTLR start "entryRuleChart"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:1: entryRuleChart returns [EObject current=null] : iv_ruleChart= ruleChart EOF ;
    public final EObject entryRuleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChart = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1507:2: (iv_ruleChart= ruleChart EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1508:2: iv_ruleChart= ruleChart EOF
            {
             newCompositeNode(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_ruleChart_in_entryRuleChart3389);
            iv_ruleChart=ruleChart();

            state._fsp--;

             current =iv_ruleChart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChart3399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1515:1: ruleChart returns [EObject current=null] : ( () otherlv_1= 'start' otherlv_2= '{' ( (lv_startElements_3_0= ruleProcessChartElements ) )* otherlv_4= '}' otherlv_5= 'followed' otherlv_6= '{' ( (lv_followedElements_7_0= ruleProcessElements ) )* otherlv_8= '}' ) ;
    public final EObject ruleChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_startElements_3_0 = null;

        EObject lv_followedElements_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:28: ( ( () otherlv_1= 'start' otherlv_2= '{' ( (lv_startElements_3_0= ruleProcessChartElements ) )* otherlv_4= '}' otherlv_5= 'followed' otherlv_6= '{' ( (lv_followedElements_7_0= ruleProcessElements ) )* otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:1: ( () otherlv_1= 'start' otherlv_2= '{' ( (lv_startElements_3_0= ruleProcessChartElements ) )* otherlv_4= '}' otherlv_5= 'followed' otherlv_6= '{' ( (lv_followedElements_7_0= ruleProcessElements ) )* otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:1: ( () otherlv_1= 'start' otherlv_2= '{' ( (lv_startElements_3_0= ruleProcessChartElements ) )* otherlv_4= '}' otherlv_5= 'followed' otherlv_6= '{' ( (lv_followedElements_7_0= ruleProcessElements ) )* otherlv_8= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:2: () otherlv_1= 'start' otherlv_2= '{' ( (lv_startElements_3_0= ruleProcessChartElements ) )* otherlv_4= '}' otherlv_5= 'followed' otherlv_6= '{' ( (lv_followedElements_7_0= ruleProcessElements ) )* otherlv_8= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getChartAccess().getChartAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleChart3445); 

                	newLeafNode(otherlv_1, grammarAccess.getChartAccess().getStartKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleChart3457); 

                	newLeafNode(otherlv_2, grammarAccess.getChartAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1533:1: ( (lv_startElements_3_0= ruleProcessChartElements ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==44||LA26_0==46||(LA26_0>=63 && LA26_0<=64)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:1: (lv_startElements_3_0= ruleProcessChartElements )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:1: (lv_startElements_3_0= ruleProcessChartElements )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1535:3: lv_startElements_3_0= ruleProcessChartElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChartAccess().getStartElementsProcessChartElementsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessChartElements_in_ruleChart3478);
            	    lv_startElements_3_0=ruleProcessChartElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"startElements",
            	            		lv_startElements_3_0, 
            	            		"ProcessChartElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleChart3491); 

                	newLeafNode(otherlv_4, grammarAccess.getChartAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleChart3503); 

                	newLeafNode(otherlv_5, grammarAccess.getChartAccess().getFollowedKeyword_5());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleChart3515); 

                	newLeafNode(otherlv_6, grammarAccess.getChartAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1563:1: ( (lv_followedElements_7_0= ruleProcessElements ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==44||LA27_0==46||LA27_0==48||LA27_0==52||(LA27_0>=63 && LA27_0<=64)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1564:1: (lv_followedElements_7_0= ruleProcessElements )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1564:1: (lv_followedElements_7_0= ruleProcessElements )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:3: lv_followedElements_7_0= ruleProcessElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChartAccess().getFollowedElementsProcessElementsParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessElements_in_ruleChart3536);
            	    lv_followedElements_7_0=ruleProcessElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"followedElements",
            	            		lv_followedElements_7_0, 
            	            		"ProcessElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleChart3549); 

                	newLeafNode(otherlv_8, grammarAccess.getChartAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleStartTimeAlternative"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1593:1: entryRuleStartTimeAlternative returns [EObject current=null] : iv_ruleStartTimeAlternative= ruleStartTimeAlternative EOF ;
    public final EObject entryRuleStartTimeAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartTimeAlternative = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1594:2: (iv_ruleStartTimeAlternative= ruleStartTimeAlternative EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1595:2: iv_ruleStartTimeAlternative= ruleStartTimeAlternative EOF
            {
             newCompositeNode(grammarAccess.getStartTimeAlternativeRule()); 
            pushFollow(FOLLOW_ruleStartTimeAlternative_in_entryRuleStartTimeAlternative3585);
            iv_ruleStartTimeAlternative=ruleStartTimeAlternative();

            state._fsp--;

             current =iv_ruleStartTimeAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartTimeAlternative3595); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartTimeAlternative"


    // $ANTLR start "ruleStartTimeAlternative"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:1: ruleStartTimeAlternative returns [EObject current=null] : ( () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimesAlternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimesAlternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )* ) ;
    public final EObject ruleStartTimeAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_mostlyAlternative_3_0 = null;

        EObject lv_sometimesAlternative_7_0 = null;

        EObject lv_sometimesAlternative_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:28: ( ( () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimesAlternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimesAlternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1606:1: ( () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimesAlternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimesAlternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1606:1: ( () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimesAlternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimesAlternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1606:2: () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimesAlternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimesAlternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1606:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1607:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStartTimeAlternativeAccess().getStarTimeAlternativeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleStartTimeAlternative3641); 

                	newLeafNode(otherlv_1, grammarAccess.getStartTimeAlternativeAccess().getMostlyKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleStartTimeAlternative3653); 

                	newLeafNode(otherlv_2, grammarAccess.getStartTimeAlternativeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1620:1: ( (lv_mostlyAlternative_3_0= ruleProcessStartElements ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42||LA28_0==44||LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:1: (lv_mostlyAlternative_3_0= ruleProcessStartElements )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:1: (lv_mostlyAlternative_3_0= ruleProcessStartElements )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:3: lv_mostlyAlternative_3_0= ruleProcessStartElements
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartTimeAlternativeAccess().getMostlyAlternativeProcessStartElementsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProcessStartElements_in_ruleStartTimeAlternative3674);
                    lv_mostlyAlternative_3_0=ruleProcessStartElements();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStartTimeAlternativeRule());
                    	        }
                           		add(
                           			current, 
                           			"mostlyAlternative",
                            		lv_mostlyAlternative_3_0, 
                            		"ProcessStartElements");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleStartTimeAlternative3687); 

                	newLeafNode(otherlv_4, grammarAccess.getStartTimeAlternativeAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleStartTimeAlternative3699); 

                	newLeafNode(otherlv_5, grammarAccess.getStartTimeAlternativeAccess().getSometimesKeyword_5());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleStartTimeAlternative3711); 

                	newLeafNode(otherlv_6, grammarAccess.getStartTimeAlternativeAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1650:1: ( (lv_sometimesAlternative_7_0= ruleProcessStartElements ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42||LA29_0==44||LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (lv_sometimesAlternative_7_0= ruleProcessStartElements )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (lv_sometimesAlternative_7_0= ruleProcessStartElements )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:3: lv_sometimesAlternative_7_0= ruleProcessStartElements
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartTimeAlternativeAccess().getSometimesAlternativeProcessStartElementsParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProcessStartElements_in_ruleStartTimeAlternative3732);
                    lv_sometimesAlternative_7_0=ruleProcessStartElements();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStartTimeAlternativeRule());
                    	        }
                           		add(
                           			current, 
                           			"sometimesAlternative",
                            		lv_sometimesAlternative_7_0, 
                            		"ProcessStartElements");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleStartTimeAlternative3745); 

                	newLeafNode(otherlv_8, grammarAccess.getStartTimeAlternativeAccess().getRightCurlyBracketKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1672:1: (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimesAlternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1672:3: otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimesAlternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}'
            	    {
            	    otherlv_9=(Token)match(input,45,FOLLOW_45_in_ruleStartTimeAlternative3758); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStartTimeAlternativeAccess().getSometimesKeyword_9_0());
            	        
            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleStartTimeAlternative3770); 

            	        	newLeafNode(otherlv_10, grammarAccess.getStartTimeAlternativeAccess().getLeftCurlyBracketKeyword_9_1());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1680:1: ( (lv_sometimesAlternative_11_0= ruleProcessStartElements ) )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==42||LA30_0==44||LA30_0==46) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1681:1: (lv_sometimesAlternative_11_0= ruleProcessStartElements )
            	            {
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1681:1: (lv_sometimesAlternative_11_0= ruleProcessStartElements )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1682:3: lv_sometimesAlternative_11_0= ruleProcessStartElements
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStartTimeAlternativeAccess().getSometimesAlternativeProcessStartElementsParserRuleCall_9_2_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleProcessStartElements_in_ruleStartTimeAlternative3791);
            	            lv_sometimesAlternative_11_0=ruleProcessStartElements();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getStartTimeAlternativeRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"sometimesAlternative",
            	                    		lv_sometimesAlternative_11_0, 
            	                    		"ProcessStartElements");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleStartTimeAlternative3804); 

            	        	newLeafNode(otherlv_12, grammarAccess.getStartTimeAlternativeAccess().getRightCurlyBracketKeyword_9_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartTimeAlternative"


    // $ANTLR start "entryRuleTimeAlternative"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:1: entryRuleTimeAlternative returns [EObject current=null] : iv_ruleTimeAlternative= ruleTimeAlternative EOF ;
    public final EObject entryRuleTimeAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeAlternative = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1711:2: (iv_ruleTimeAlternative= ruleTimeAlternative EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1712:2: iv_ruleTimeAlternative= ruleTimeAlternative EOF
            {
             newCompositeNode(grammarAccess.getTimeAlternativeRule()); 
            pushFollow(FOLLOW_ruleTimeAlternative_in_entryRuleTimeAlternative3842);
            iv_ruleTimeAlternative=ruleTimeAlternative();

            state._fsp--;

             current =iv_ruleTimeAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeAlternative3852); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeAlternative"


    // $ANTLR start "ruleTimeAlternative"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1719:1: ruleTimeAlternative returns [EObject current=null] : ( () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimeAlternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimeAlternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )* ) ;
    public final EObject ruleTimeAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_mostlyAlternative_3_0 = null;

        EObject lv_sometimeAlternative_7_0 = null;

        EObject lv_sometimeAlternative_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1722:28: ( ( () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimeAlternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimeAlternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1723:1: ( () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimeAlternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimeAlternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1723:1: ( () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimeAlternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimeAlternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1723:2: () otherlv_1= 'mostly' otherlv_2= '{' ( (lv_mostlyAlternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'sometimes' otherlv_6= '{' ( (lv_sometimeAlternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimeAlternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1723:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1724:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimeAlternativeAccess().getTimeAlternativeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleTimeAlternative3898); 

                	newLeafNode(otherlv_1, grammarAccess.getTimeAlternativeAccess().getMostlyKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTimeAlternative3910); 

                	newLeafNode(otherlv_2, grammarAccess.getTimeAlternativeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:1: ( (lv_mostlyAlternative_3_0= ruleProcessElements ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==44||LA32_0==46||LA32_0==48||LA32_0==52||(LA32_0>=63 && LA32_0<=64)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1738:1: (lv_mostlyAlternative_3_0= ruleProcessElements )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1738:1: (lv_mostlyAlternative_3_0= ruleProcessElements )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1739:3: lv_mostlyAlternative_3_0= ruleProcessElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTimeAlternativeAccess().getMostlyAlternativeProcessElementsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessElements_in_ruleTimeAlternative3931);
            	    lv_mostlyAlternative_3_0=ruleProcessElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTimeAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mostlyAlternative",
            	            		lv_mostlyAlternative_3_0, 
            	            		"ProcessElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleTimeAlternative3944); 

                	newLeafNode(otherlv_4, grammarAccess.getTimeAlternativeAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleTimeAlternative3956); 

                	newLeafNode(otherlv_5, grammarAccess.getTimeAlternativeAccess().getSometimesKeyword_5());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleTimeAlternative3968); 

                	newLeafNode(otherlv_6, grammarAccess.getTimeAlternativeAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1767:1: ( (lv_sometimeAlternative_7_0= ruleProcessElements ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==44||LA33_0==46||LA33_0==48||LA33_0==52||(LA33_0>=63 && LA33_0<=64)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:1: (lv_sometimeAlternative_7_0= ruleProcessElements )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:1: (lv_sometimeAlternative_7_0= ruleProcessElements )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1769:3: lv_sometimeAlternative_7_0= ruleProcessElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTimeAlternativeAccess().getSometimeAlternativeProcessElementsParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessElements_in_ruleTimeAlternative3989);
            	    lv_sometimeAlternative_7_0=ruleProcessElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTimeAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sometimeAlternative",
            	            		lv_sometimeAlternative_7_0, 
            	            		"ProcessElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTimeAlternative4002); 

                	newLeafNode(otherlv_8, grammarAccess.getTimeAlternativeAccess().getRightCurlyBracketKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:1: (otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimeAlternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1789:3: otherlv_9= 'sometimes' otherlv_10= '{' ( (lv_sometimeAlternative_11_0= ruleProcessElements ) )* otherlv_12= '}'
            	    {
            	    otherlv_9=(Token)match(input,45,FOLLOW_45_in_ruleTimeAlternative4015); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTimeAlternativeAccess().getSometimesKeyword_9_0());
            	        
            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleTimeAlternative4027); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTimeAlternativeAccess().getLeftCurlyBracketKeyword_9_1());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1797:1: ( (lv_sometimeAlternative_11_0= ruleProcessElements ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==RULE_ID||LA34_0==44||LA34_0==46||LA34_0==48||LA34_0==52||(LA34_0>=63 && LA34_0<=64)) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:1: (lv_sometimeAlternative_11_0= ruleProcessElements )
            	    	    {
            	    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:1: (lv_sometimeAlternative_11_0= ruleProcessElements )
            	    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:3: lv_sometimeAlternative_11_0= ruleProcessElements
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTimeAlternativeAccess().getSometimeAlternativeProcessElementsParserRuleCall_9_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleProcessElements_in_ruleTimeAlternative4048);
            	    	    lv_sometimeAlternative_11_0=ruleProcessElements();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTimeAlternativeRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"sometimeAlternative",
            	    	            		lv_sometimeAlternative_11_0, 
            	    	            		"ProcessElements");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleTimeAlternative4061); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTimeAlternativeAccess().getRightCurlyBracketKeyword_9_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeAlternative"


    // $ANTLR start "entryRuleStartAlternative"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1827:1: entryRuleStartAlternative returns [EObject current=null] : iv_ruleStartAlternative= ruleStartAlternative EOF ;
    public final EObject entryRuleStartAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartAlternative = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1828:2: (iv_ruleStartAlternative= ruleStartAlternative EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1829:2: iv_ruleStartAlternative= ruleStartAlternative EOF
            {
             newCompositeNode(grammarAccess.getStartAlternativeRule()); 
            pushFollow(FOLLOW_ruleStartAlternative_in_entryRuleStartAlternative4099);
            iv_ruleStartAlternative=ruleStartAlternative();

            state._fsp--;

             current =iv_ruleStartAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartAlternative4109); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartAlternative"


    // $ANTLR start "ruleStartAlternative"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1836:1: ruleStartAlternative returns [EObject current=null] : ( () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )* ) ;
    public final EObject ruleStartAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_alternative_3_0 = null;

        EObject lv_alternative_7_0 = null;

        EObject lv_alternative_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1839:28: ( ( () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:1: ( () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:1: ( () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:2: () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessStartElements ) )? otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessStartElements ) )? otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1841:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStartAlternativeAccess().getStartAlternativeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleStartAlternative4155); 

                	newLeafNode(otherlv_1, grammarAccess.getStartAlternativeAccess().getAltKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleStartAlternative4167); 

                	newLeafNode(otherlv_2, grammarAccess.getStartAlternativeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1854:1: ( (lv_alternative_3_0= ruleProcessStartElements ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42||LA36_0==44||LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:1: (lv_alternative_3_0= ruleProcessStartElements )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:1: (lv_alternative_3_0= ruleProcessStartElements )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1856:3: lv_alternative_3_0= ruleProcessStartElements
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartAlternativeAccess().getAlternativeProcessStartElementsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProcessStartElements_in_ruleStartAlternative4188);
                    lv_alternative_3_0=ruleProcessStartElements();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStartAlternativeRule());
                    	        }
                           		add(
                           			current, 
                           			"alternative",
                            		lv_alternative_3_0, 
                            		"ProcessStartElements");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleStartAlternative4201); 

                	newLeafNode(otherlv_4, grammarAccess.getStartAlternativeAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleStartAlternative4213); 

                	newLeafNode(otherlv_5, grammarAccess.getStartAlternativeAccess().getOrKeyword_5());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleStartAlternative4225); 

                	newLeafNode(otherlv_6, grammarAccess.getStartAlternativeAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:1: ( (lv_alternative_7_0= ruleProcessStartElements ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42||LA37_0==44||LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1885:1: (lv_alternative_7_0= ruleProcessStartElements )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1885:1: (lv_alternative_7_0= ruleProcessStartElements )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1886:3: lv_alternative_7_0= ruleProcessStartElements
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartAlternativeAccess().getAlternativeProcessStartElementsParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProcessStartElements_in_ruleStartAlternative4246);
                    lv_alternative_7_0=ruleProcessStartElements();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStartAlternativeRule());
                    	        }
                           		add(
                           			current, 
                           			"alternative",
                            		lv_alternative_7_0, 
                            		"ProcessStartElements");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleStartAlternative4259); 

                	newLeafNode(otherlv_8, grammarAccess.getStartAlternativeAccess().getRightCurlyBracketKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1906:1: (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}' )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==47) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1906:3: otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessStartElements ) )? otherlv_12= '}'
            	    {
            	    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleStartAlternative4272); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStartAlternativeAccess().getOrKeyword_9_0());
            	        
            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleStartAlternative4284); 

            	        	newLeafNode(otherlv_10, grammarAccess.getStartAlternativeAccess().getLeftCurlyBracketKeyword_9_1());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1914:1: ( (lv_alternative_11_0= ruleProcessStartElements ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==42||LA38_0==44||LA38_0==46) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1915:1: (lv_alternative_11_0= ruleProcessStartElements )
            	            {
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1915:1: (lv_alternative_11_0= ruleProcessStartElements )
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1916:3: lv_alternative_11_0= ruleProcessStartElements
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getStartAlternativeAccess().getAlternativeProcessStartElementsParserRuleCall_9_2_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleProcessStartElements_in_ruleStartAlternative4305);
            	            lv_alternative_11_0=ruleProcessStartElements();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getStartAlternativeRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"alternative",
            	                    		lv_alternative_11_0, 
            	                    		"ProcessStartElements");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleStartAlternative4318); 

            	        	newLeafNode(otherlv_12, grammarAccess.getStartAlternativeAccess().getRightCurlyBracketKeyword_9_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartAlternative"


    // $ANTLR start "entryRuleAlternative"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1944:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1945:2: (iv_ruleAlternative= ruleAlternative EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1946:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative4356);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative4366); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1953:1: ruleAlternative returns [EObject current=null] : ( () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )* ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_alternative_3_0 = null;

        EObject lv_alternative_7_0 = null;

        EObject lv_alternative_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1956:28: ( ( () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1957:1: ( () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1957:1: ( () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1957:2: () otherlv_1= 'alt' otherlv_2= '{' ( (lv_alternative_3_0= ruleProcessElements ) )* otherlv_4= '}' otherlv_5= 'or' otherlv_6= '{' ( (lv_alternative_7_0= ruleProcessElements ) )* otherlv_8= '}' (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1957:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1958:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAlternativeAccess().getAlternativeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleAlternative4412); 

                	newLeafNode(otherlv_1, grammarAccess.getAlternativeAccess().getAltKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAlternative4424); 

                	newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1971:1: ( (lv_alternative_3_0= ruleProcessElements ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==44||LA40_0==46||LA40_0==48||LA40_0==52||(LA40_0>=63 && LA40_0<=64)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1972:1: (lv_alternative_3_0= ruleProcessElements )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1972:1: (lv_alternative_3_0= ruleProcessElements )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1973:3: lv_alternative_3_0= ruleProcessElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeAccess().getAlternativeProcessElementsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessElements_in_ruleAlternative4445);
            	    lv_alternative_3_0=ruleProcessElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alternative",
            	            		lv_alternative_3_0, 
            	            		"ProcessElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAlternative4458); 

                	newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleAlternative4470); 

                	newLeafNode(otherlv_5, grammarAccess.getAlternativeAccess().getOrKeyword_5());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleAlternative4482); 

                	newLeafNode(otherlv_6, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2001:1: ( (lv_alternative_7_0= ruleProcessElements ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==44||LA41_0==46||LA41_0==48||LA41_0==52||(LA41_0>=63 && LA41_0<=64)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:1: (lv_alternative_7_0= ruleProcessElements )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:1: (lv_alternative_7_0= ruleProcessElements )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2003:3: lv_alternative_7_0= ruleProcessElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeAccess().getAlternativeProcessElementsParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessElements_in_ruleAlternative4503);
            	    lv_alternative_7_0=ruleProcessElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alternative",
            	            		lv_alternative_7_0, 
            	            		"ProcessElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleAlternative4516); 

                	newLeafNode(otherlv_8, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2023:1: (otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessElements ) )* otherlv_12= '}' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==47) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2023:3: otherlv_9= 'or' otherlv_10= '{' ( (lv_alternative_11_0= ruleProcessElements ) )* otherlv_12= '}'
            	    {
            	    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleAlternative4529); 

            	        	newLeafNode(otherlv_9, grammarAccess.getAlternativeAccess().getOrKeyword_9_0());
            	        
            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleAlternative4541); 

            	        	newLeafNode(otherlv_10, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_9_1());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2031:1: ( (lv_alternative_11_0= ruleProcessElements ) )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==RULE_ID||LA42_0==44||LA42_0==46||LA42_0==48||LA42_0==52||(LA42_0>=63 && LA42_0<=64)) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:1: (lv_alternative_11_0= ruleProcessElements )
            	    	    {
            	    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:1: (lv_alternative_11_0= ruleProcessElements )
            	    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2033:3: lv_alternative_11_0= ruleProcessElements
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getAlternativeAccess().getAlternativeProcessElementsParserRuleCall_9_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleProcessElements_in_ruleAlternative4562);
            	    	    lv_alternative_11_0=ruleProcessElements();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"alternative",
            	    	            		lv_alternative_11_0, 
            	    	            		"ProcessElements");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleAlternative4575); 

            	        	newLeafNode(otherlv_12, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_9_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleProcessElements"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2061:1: entryRuleProcessElements returns [EObject current=null] : iv_ruleProcessElements= ruleProcessElements EOF ;
    public final EObject entryRuleProcessElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElements = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2062:2: (iv_ruleProcessElements= ruleProcessElements EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:2: iv_ruleProcessElements= ruleProcessElements EOF
            {
             newCompositeNode(grammarAccess.getProcessElementsRule()); 
            pushFollow(FOLLOW_ruleProcessElements_in_entryRuleProcessElements4613);
            iv_ruleProcessElements=ruleProcessElements();

            state._fsp--;

             current =iv_ruleProcessElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessElements4623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessElements"


    // $ANTLR start "ruleProcessElements"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2070:1: ruleProcessElements returns [EObject current=null] : (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_IFQuery_4= ruleIFQuery | this_Systemwork_5= ruleSystemwork | this_Loop_6= ruleLoop ) ;
    public final EObject ruleProcessElements() throws RecognitionException {
        EObject current = null;

        EObject this_Communication_0 = null;

        EObject this_Activity_1 = null;

        EObject this_Alternative_2 = null;

        EObject this_TimeAlternative_3 = null;

        EObject this_IFQuery_4 = null;

        EObject this_Systemwork_5 = null;

        EObject this_Loop_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2073:28: ( (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_IFQuery_4= ruleIFQuery | this_Systemwork_5= ruleSystemwork | this_Loop_6= ruleLoop ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2074:1: (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_IFQuery_4= ruleIFQuery | this_Systemwork_5= ruleSystemwork | this_Loop_6= ruleLoop )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2074:1: (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_IFQuery_4= ruleIFQuery | this_Systemwork_5= ruleSystemwork | this_Loop_6= ruleLoop )
            int alt44=7;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2075:5: this_Communication_0= ruleCommunication
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementsAccess().getCommunicationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCommunication_in_ruleProcessElements4670);
                    this_Communication_0=ruleCommunication();

                    state._fsp--;

                     
                            current = this_Communication_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2085:5: this_Activity_1= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementsAccess().getActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleProcessElements4697);
                    this_Activity_1=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2095:5: this_Alternative_2= ruleAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementsAccess().getAlternativeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternative_in_ruleProcessElements4724);
                    this_Alternative_2=ruleAlternative();

                    state._fsp--;

                     
                            current = this_Alternative_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2105:5: this_TimeAlternative_3= ruleTimeAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementsAccess().getTimeAlternativeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTimeAlternative_in_ruleProcessElements4751);
                    this_TimeAlternative_3=ruleTimeAlternative();

                    state._fsp--;

                     
                            current = this_TimeAlternative_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2115:5: this_IFQuery_4= ruleIFQuery
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementsAccess().getIFQueryParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIFQuery_in_ruleProcessElements4778);
                    this_IFQuery_4=ruleIFQuery();

                    state._fsp--;

                     
                            current = this_IFQuery_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2125:5: this_Systemwork_5= ruleSystemwork
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementsAccess().getSystemworkParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSystemwork_in_ruleProcessElements4805);
                    this_Systemwork_5=ruleSystemwork();

                    state._fsp--;

                     
                            current = this_Systemwork_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2135:5: this_Loop_6= ruleLoop
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementsAccess().getLoopParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleLoop_in_ruleProcessElements4832);
                    this_Loop_6=ruleLoop();

                    state._fsp--;

                     
                            current = this_Loop_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessElements"


    // $ANTLR start "entryRuleProcessChartElements"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2151:1: entryRuleProcessChartElements returns [EObject current=null] : iv_ruleProcessChartElements= ruleProcessChartElements EOF ;
    public final EObject entryRuleProcessChartElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessChartElements = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2152:2: (iv_ruleProcessChartElements= ruleProcessChartElements EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2153:2: iv_ruleProcessChartElements= ruleProcessChartElements EOF
            {
             newCompositeNode(grammarAccess.getProcessChartElementsRule()); 
            pushFollow(FOLLOW_ruleProcessChartElements_in_entryRuleProcessChartElements4867);
            iv_ruleProcessChartElements=ruleProcessChartElements();

            state._fsp--;

             current =iv_ruleProcessChartElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessChartElements4877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessChartElements"


    // $ANTLR start "ruleProcessChartElements"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2160:1: ruleProcessChartElements returns [EObject current=null] : (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_Systemwork_4= ruleSystemwork ) ;
    public final EObject ruleProcessChartElements() throws RecognitionException {
        EObject current = null;

        EObject this_Communication_0 = null;

        EObject this_Activity_1 = null;

        EObject this_Alternative_2 = null;

        EObject this_TimeAlternative_3 = null;

        EObject this_Systemwork_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2163:28: ( (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_Systemwork_4= ruleSystemwork ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2164:1: (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_Systemwork_4= ruleSystemwork )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2164:1: (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_Systemwork_4= ruleSystemwork )
            int alt45=5;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2165:5: this_Communication_0= ruleCommunication
                    {
                     
                            newCompositeNode(grammarAccess.getProcessChartElementsAccess().getCommunicationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCommunication_in_ruleProcessChartElements4924);
                    this_Communication_0=ruleCommunication();

                    state._fsp--;

                     
                            current = this_Communication_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2175:5: this_Activity_1= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getProcessChartElementsAccess().getActivityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleProcessChartElements4951);
                    this_Activity_1=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2185:5: this_Alternative_2= ruleAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getProcessChartElementsAccess().getAlternativeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternative_in_ruleProcessChartElements4978);
                    this_Alternative_2=ruleAlternative();

                    state._fsp--;

                     
                            current = this_Alternative_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2195:5: this_TimeAlternative_3= ruleTimeAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getProcessChartElementsAccess().getTimeAlternativeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTimeAlternative_in_ruleProcessChartElements5005);
                    this_TimeAlternative_3=ruleTimeAlternative();

                    state._fsp--;

                     
                            current = this_TimeAlternative_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2205:5: this_Systemwork_4= ruleSystemwork
                    {
                     
                            newCompositeNode(grammarAccess.getProcessChartElementsAccess().getSystemworkParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSystemwork_in_ruleProcessChartElements5032);
                    this_Systemwork_4=ruleSystemwork();

                    state._fsp--;

                     
                            current = this_Systemwork_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessChartElements"


    // $ANTLR start "entryRuleLoop"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2221:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2222:2: (iv_ruleLoop= ruleLoop EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2223:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_ruleLoop_in_entryRuleLoop5067);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoop5077); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2230:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '[' ( ( (lv_uncounter_2_0= '*' ) ) | ( (lv_counter_3_0= RULE_INT ) ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_elements_6_0= ruleProcessElements ) )* otherlv_7= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_uncounter_2_0=null;
        Token lv_counter_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2233:28: ( (otherlv_0= 'loop' otherlv_1= '[' ( ( (lv_uncounter_2_0= '*' ) ) | ( (lv_counter_3_0= RULE_INT ) ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_elements_6_0= ruleProcessElements ) )* otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2234:1: (otherlv_0= 'loop' otherlv_1= '[' ( ( (lv_uncounter_2_0= '*' ) ) | ( (lv_counter_3_0= RULE_INT ) ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_elements_6_0= ruleProcessElements ) )* otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2234:1: (otherlv_0= 'loop' otherlv_1= '[' ( ( (lv_uncounter_2_0= '*' ) ) | ( (lv_counter_3_0= RULE_INT ) ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_elements_6_0= ruleProcessElements ) )* otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2234:3: otherlv_0= 'loop' otherlv_1= '[' ( ( (lv_uncounter_2_0= '*' ) ) | ( (lv_counter_3_0= RULE_INT ) ) ) otherlv_4= ']' otherlv_5= '{' ( (lv_elements_6_0= ruleProcessElements ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleLoop5114); 

                	newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
                
            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleLoop5126); 

                	newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2242:1: ( ( (lv_uncounter_2_0= '*' ) ) | ( (lv_counter_3_0= RULE_INT ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_INT) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2242:2: ( (lv_uncounter_2_0= '*' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2242:2: ( (lv_uncounter_2_0= '*' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2243:1: (lv_uncounter_2_0= '*' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2243:1: (lv_uncounter_2_0= '*' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2244:3: lv_uncounter_2_0= '*'
                    {
                    lv_uncounter_2_0=(Token)match(input,50,FOLLOW_50_in_ruleLoop5145); 

                            newLeafNode(lv_uncounter_2_0, grammarAccess.getLoopAccess().getUncounterAsteriskKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoopRule());
                    	        }
                           		setWithLastConsumed(current, "uncounter", lv_uncounter_2_0, "*");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2258:6: ( (lv_counter_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2258:6: ( (lv_counter_3_0= RULE_INT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2259:1: (lv_counter_3_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2259:1: (lv_counter_3_0= RULE_INT )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2260:3: lv_counter_3_0= RULE_INT
                    {
                    lv_counter_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoop5181); 

                    			newLeafNode(lv_counter_3_0, grammarAccess.getLoopAccess().getCounterINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoopRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"counter",
                            		lv_counter_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleLoop5199); 

                	newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_3());
                
            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleLoop5211); 

                	newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2284:1: ( (lv_elements_6_0= ruleProcessElements ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==44||LA47_0==46||LA47_0==48||LA47_0==52||(LA47_0>=63 && LA47_0<=64)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2285:1: (lv_elements_6_0= ruleProcessElements )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2285:1: (lv_elements_6_0= ruleProcessElements )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2286:3: lv_elements_6_0= ruleProcessElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLoopAccess().getElementsProcessElementsParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessElements_in_ruleLoop5232);
            	    lv_elements_6_0=ruleProcessElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLoopRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_6_0, 
            	            		"ProcessElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleLoop5245); 

                	newLeafNode(otherlv_7, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleIFQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2314:1: entryRuleIFQuery returns [EObject current=null] : iv_ruleIFQuery= ruleIFQuery EOF ;
    public final EObject entryRuleIFQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIFQuery = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2315:2: (iv_ruleIFQuery= ruleIFQuery EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2316:2: iv_ruleIFQuery= ruleIFQuery EOF
            {
             newCompositeNode(grammarAccess.getIFQueryRule()); 
            pushFollow(FOLLOW_ruleIFQuery_in_entryRuleIFQuery5281);
            iv_ruleIFQuery=ruleIFQuery();

            state._fsp--;

             current =iv_ruleIFQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIFQuery5291); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIFQuery"


    // $ANTLR start "ruleIFQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2323:1: ruleIFQuery returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_elements_8_0= ruleProcessElements ) )* otherlv_9= '}' (otherlv_10= 'else' otherlv_11= '{' ( (lv_elements_12_0= ruleProcessElements ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleIFQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_queries_2_0 = null;

        EObject lv_queries_5_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2326:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_elements_8_0= ruleProcessElements ) )* otherlv_9= '}' (otherlv_10= 'else' otherlv_11= '{' ( (lv_elements_12_0= ruleProcessElements ) )* otherlv_13= '}' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2327:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_elements_8_0= ruleProcessElements ) )* otherlv_9= '}' (otherlv_10= 'else' otherlv_11= '{' ( (lv_elements_12_0= ruleProcessElements ) )* otherlv_13= '}' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2327:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_elements_8_0= ruleProcessElements ) )* otherlv_9= '}' (otherlv_10= 'else' otherlv_11= '{' ( (lv_elements_12_0= ruleProcessElements ) )* otherlv_13= '}' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2327:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_elements_8_0= ruleProcessElements ) )* otherlv_9= '}' (otherlv_10= 'else' otherlv_11= '{' ( (lv_elements_12_0= ruleProcessElements ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleIFQuery5328); 

                	newLeafNode(otherlv_0, grammarAccess.getIFQueryAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIFQuery5340); 

                	newLeafNode(otherlv_1, grammarAccess.getIFQueryAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2335:1: ( (lv_queries_2_0= ruleQueryTypes ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:1: (lv_queries_2_0= ruleQueryTypes )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:1: (lv_queries_2_0= ruleQueryTypes )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:3: lv_queries_2_0= ruleQueryTypes
            {
             
            	        newCompositeNode(grammarAccess.getIFQueryAccess().getQueriesQueryTypesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryTypes_in_ruleIFQuery5361);
            lv_queries_2_0=ruleQueryTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIFQueryRule());
            	        }
                   		add(
                   			current, 
                   			"queries",
                    		lv_queries_2_0, 
                    		"QueryTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2353:2: ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=53 && LA49_0<=54)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2353:3: (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2353:3: (otherlv_3= '||' | otherlv_4= '&&' )
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==53) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==54) ) {
            	        alt48=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2353:5: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleIFQuery5375); 

            	                	newLeafNode(otherlv_3, grammarAccess.getIFQueryAccess().getVerticalLineVerticalLineKeyword_3_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2358:7: otherlv_4= '&&'
            	            {
            	            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleIFQuery5393); 

            	                	newLeafNode(otherlv_4, grammarAccess.getIFQueryAccess().getAmpersandAmpersandKeyword_3_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2362:2: ( (lv_queries_5_0= ruleQueryTypes ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2363:1: (lv_queries_5_0= ruleQueryTypes )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2363:1: (lv_queries_5_0= ruleQueryTypes )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2364:3: lv_queries_5_0= ruleQueryTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIFQueryAccess().getQueriesQueryTypesParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQueryTypes_in_ruleIFQuery5415);
            	    lv_queries_5_0=ruleQueryTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIFQueryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"queries",
            	            		lv_queries_5_0, 
            	            		"QueryTypes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleIFQuery5429); 

                	newLeafNode(otherlv_6, grammarAccess.getIFQueryAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleIFQuery5441); 

                	newLeafNode(otherlv_7, grammarAccess.getIFQueryAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2388:1: ( (lv_elements_8_0= ruleProcessElements ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID||LA50_0==44||LA50_0==46||LA50_0==48||LA50_0==52||(LA50_0>=63 && LA50_0<=64)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2389:1: (lv_elements_8_0= ruleProcessElements )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2389:1: (lv_elements_8_0= ruleProcessElements )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2390:3: lv_elements_8_0= ruleProcessElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIFQueryAccess().getElementsProcessElementsParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessElements_in_ruleIFQuery5462);
            	    lv_elements_8_0=ruleProcessElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIFQueryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_8_0, 
            	            		"ProcessElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleIFQuery5475); 

                	newLeafNode(otherlv_9, grammarAccess.getIFQueryAccess().getRightCurlyBracketKeyword_7());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2410:1: (otherlv_10= 'else' otherlv_11= '{' ( (lv_elements_12_0= ruleProcessElements ) )* otherlv_13= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2410:3: otherlv_10= 'else' otherlv_11= '{' ( (lv_elements_12_0= ruleProcessElements ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleIFQuery5488); 

                        	newLeafNode(otherlv_10, grammarAccess.getIFQueryAccess().getElseKeyword_8_0());
                        
                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleIFQuery5500); 

                        	newLeafNode(otherlv_11, grammarAccess.getIFQueryAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2418:1: ( (lv_elements_12_0= ruleProcessElements ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_ID||LA51_0==44||LA51_0==46||LA51_0==48||LA51_0==52||(LA51_0>=63 && LA51_0<=64)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2419:1: (lv_elements_12_0= ruleProcessElements )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2419:1: (lv_elements_12_0= ruleProcessElements )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2420:3: lv_elements_12_0= ruleProcessElements
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIFQueryAccess().getElementsProcessElementsParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessElements_in_ruleIFQuery5521);
                    	    lv_elements_12_0=ruleProcessElements();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIFQueryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_12_0, 
                    	            		"ProcessElements");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleIFQuery5534); 

                        	newLeafNode(otherlv_13, grammarAccess.getIFQueryAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIFQuery"


    // $ANTLR start "entryRuleQueryTypes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2448:1: entryRuleQueryTypes returns [EObject current=null] : iv_ruleQueryTypes= ruleQueryTypes EOF ;
    public final EObject entryRuleQueryTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryTypes = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2449:2: (iv_ruleQueryTypes= ruleQueryTypes EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2450:2: iv_ruleQueryTypes= ruleQueryTypes EOF
            {
             newCompositeNode(grammarAccess.getQueryTypesRule()); 
            pushFollow(FOLLOW_ruleQueryTypes_in_entryRuleQueryTypes5572);
            iv_ruleQueryTypes=ruleQueryTypes();

            state._fsp--;

             current =iv_ruleQueryTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryTypes5582); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryTypes"


    // $ANTLR start "ruleQueryTypes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2457:1: ruleQueryTypes returns [EObject current=null] : (this_Query_0= ruleQuery | this_BraceQuery_1= ruleBraceQuery ) ;
    public final EObject ruleQueryTypes() throws RecognitionException {
        EObject current = null;

        EObject this_Query_0 = null;

        EObject this_BraceQuery_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2460:28: ( (this_Query_0= ruleQuery | this_BraceQuery_1= ruleBraceQuery ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2461:1: (this_Query_0= ruleQuery | this_BraceQuery_1= ruleBraceQuery )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2461:1: (this_Query_0= ruleQuery | this_BraceQuery_1= ruleBraceQuery )
            int alt53=2;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_ID) ) {
                    alt53=1;
                }
                else if ( (LA53_1==27) ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt53=1;
                }
                break;
            case 27:
                {
                alt53=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2462:5: this_Query_0= ruleQuery
                    {
                     
                            newCompositeNode(grammarAccess.getQueryTypesAccess().getQueryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleQuery_in_ruleQueryTypes5629);
                    this_Query_0=ruleQuery();

                    state._fsp--;

                     
                            current = this_Query_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2472:5: this_BraceQuery_1= ruleBraceQuery
                    {
                     
                            newCompositeNode(grammarAccess.getQueryTypesAccess().getBraceQueryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBraceQuery_in_ruleQueryTypes5656);
                    this_BraceQuery_1=ruleBraceQuery();

                    state._fsp--;

                     
                            current = this_BraceQuery_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryTypes"


    // $ANTLR start "entryRuleQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2488:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2489:2: (iv_ruleQuery= ruleQuery EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2490:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery5691);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery5701); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2497:1: ruleQuery returns [EObject current=null] : (this_DataQuery_0= ruleDataQuery | this_PlayerQuery_1= rulePlayerQuery | this_BooleanQuery_2= ruleBooleanQuery ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject this_DataQuery_0 = null;

        EObject this_PlayerQuery_1 = null;

        EObject this_BooleanQuery_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2500:28: ( (this_DataQuery_0= ruleDataQuery | this_PlayerQuery_1= rulePlayerQuery | this_BooleanQuery_2= ruleBooleanQuery ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2501:1: (this_DataQuery_0= ruleDataQuery | this_PlayerQuery_1= rulePlayerQuery | this_BooleanQuery_2= ruleBooleanQuery )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2501:1: (this_DataQuery_0= ruleDataQuery | this_PlayerQuery_1= rulePlayerQuery | this_BooleanQuery_2= ruleBooleanQuery )
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==56) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 60:
                    case 61:
                        {
                        alt54=1;
                        }
                        break;
                    case 62:
                        {
                        alt54=2;
                        }
                        break;
                    case EOF:
                    case 29:
                    case 53:
                    case 54:
                    case 57:
                        {
                        alt54=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 60:
                case 61:
                    {
                    alt54=1;
                    }
                    break;
                case 62:
                    {
                    alt54=2;
                    }
                    break;
                case EOF:
                case 29:
                case 53:
                case 54:
                case 57:
                    {
                    alt54=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2502:5: this_DataQuery_0= ruleDataQuery
                    {
                     
                            newCompositeNode(grammarAccess.getQueryAccess().getDataQueryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataQuery_in_ruleQuery5748);
                    this_DataQuery_0=ruleDataQuery();

                    state._fsp--;

                     
                            current = this_DataQuery_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2512:5: this_PlayerQuery_1= rulePlayerQuery
                    {
                     
                            newCompositeNode(grammarAccess.getQueryAccess().getPlayerQueryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePlayerQuery_in_ruleQuery5775);
                    this_PlayerQuery_1=rulePlayerQuery();

                    state._fsp--;

                     
                            current = this_PlayerQuery_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2522:5: this_BooleanQuery_2= ruleBooleanQuery
                    {
                     
                            newCompositeNode(grammarAccess.getQueryAccess().getBooleanQueryParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanQuery_in_ruleQuery5802);
                    this_BooleanQuery_2=ruleBooleanQuery();

                    state._fsp--;

                     
                            current = this_BooleanQuery_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleBooleanQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2538:1: entryRuleBooleanQuery returns [EObject current=null] : iv_ruleBooleanQuery= ruleBooleanQuery EOF ;
    public final EObject entryRuleBooleanQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanQuery = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2539:2: (iv_ruleBooleanQuery= ruleBooleanQuery EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2540:2: iv_ruleBooleanQuery= ruleBooleanQuery EOF
            {
             newCompositeNode(grammarAccess.getBooleanQueryRule()); 
            pushFollow(FOLLOW_ruleBooleanQuery_in_entryRuleBooleanQuery5837);
            iv_ruleBooleanQuery=ruleBooleanQuery();

            state._fsp--;

             current =iv_ruleBooleanQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanQuery5847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanQuery"


    // $ANTLR start "ruleBooleanQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2547:1: ruleBooleanQuery returns [EObject current=null] : ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' ( ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) ) ) )? ) ;
    public final EObject ruleBooleanQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_boolean_3_1=null;
        Token lv_boolean_3_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2550:28: ( ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' ( ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) ) ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2551:1: ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' ( ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) ) ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2551:1: ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' ( ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2551:2: (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' ( ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) ) ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2551:2: (otherlv_0= '!' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==56) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2551:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleBooleanQuery5885); 

                        	newLeafNode(otherlv_0, grammarAccess.getBooleanQueryAccess().getExclamationMarkKeyword_0());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2555:3: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2556:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2556:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2557:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanQueryRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanQuery5907); 

            		newLeafNode(otherlv_1, grammarAccess.getBooleanQueryAccess().getBooleanValueBooleanCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2568:2: (otherlv_2= 'is' ( ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==57) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2568:4: otherlv_2= 'is' ( ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) ) )
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleBooleanQuery5920); 

                        	newLeafNode(otherlv_2, grammarAccess.getBooleanQueryAccess().getIsKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2572:1: ( ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2573:1: ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2573:1: ( (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2574:1: (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2574:1: (lv_boolean_3_1= 'true' | lv_boolean_3_2= 'false' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==58) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==59) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2575:3: lv_boolean_3_1= 'true'
                            {
                            lv_boolean_3_1=(Token)match(input,58,FOLLOW_58_in_ruleBooleanQuery5940); 

                                    newLeafNode(lv_boolean_3_1, grammarAccess.getBooleanQueryAccess().getBooleanTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanQueryRule());
                            	        }
                                   		setWithLastConsumed(current, "boolean", lv_boolean_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2587:8: lv_boolean_3_2= 'false'
                            {
                            lv_boolean_3_2=(Token)match(input,59,FOLLOW_59_in_ruleBooleanQuery5969); 

                                    newLeafNode(lv_boolean_3_2, grammarAccess.getBooleanQueryAccess().getBooleanFalseKeyword_2_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanQueryRule());
                            	        }
                                   		setWithLastConsumed(current, "boolean", lv_boolean_3_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanQuery"


    // $ANTLR start "entryRuleDataQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2610:1: entryRuleDataQuery returns [EObject current=null] : iv_ruleDataQuery= ruleDataQuery EOF ;
    public final EObject entryRuleDataQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataQuery = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2611:2: (iv_ruleDataQuery= ruleDataQuery EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2612:2: iv_ruleDataQuery= ruleDataQuery EOF
            {
             newCompositeNode(grammarAccess.getDataQueryRule()); 
            pushFollow(FOLLOW_ruleDataQuery_in_entryRuleDataQuery6023);
            iv_ruleDataQuery=ruleDataQuery();

            state._fsp--;

             current =iv_ruleDataQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataQuery6033); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataQuery"


    // $ANTLR start "ruleDataQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2619:1: ruleDataQuery returns [EObject current=null] : ( ( (lv_exclamation_0_0= '!' ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_condition_2_1= '!=' | lv_condition_2_2= '==' ) ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDataQuery() throws RecognitionException {
        EObject current = null;

        Token lv_exclamation_0_0=null;
        Token otherlv_1=null;
        Token lv_condition_2_1=null;
        Token lv_condition_2_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2622:28: ( ( ( (lv_exclamation_0_0= '!' ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_condition_2_1= '!=' | lv_condition_2_2= '==' ) ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2623:1: ( ( (lv_exclamation_0_0= '!' ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_condition_2_1= '!=' | lv_condition_2_2= '==' ) ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2623:1: ( ( (lv_exclamation_0_0= '!' ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_condition_2_1= '!=' | lv_condition_2_2= '==' ) ) ) ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2623:2: ( (lv_exclamation_0_0= '!' ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_condition_2_1= '!=' | lv_condition_2_2= '==' ) ) ) ( (otherlv_3= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2623:2: ( (lv_exclamation_0_0= '!' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2624:1: (lv_exclamation_0_0= '!' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2624:1: (lv_exclamation_0_0= '!' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2625:3: lv_exclamation_0_0= '!'
                    {
                    lv_exclamation_0_0=(Token)match(input,56,FOLLOW_56_in_ruleDataQuery6076); 

                            newLeafNode(lv_exclamation_0_0, grammarAccess.getDataQueryAccess().getExclamationExclamationMarkKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataQueryRule());
                    	        }
                           		setWithLastConsumed(current, "exclamation", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2638:3: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2639:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2639:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2640:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataQueryRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataQuery6110); 

            		newLeafNode(otherlv_1, grammarAccess.getDataQueryAccess().getObjectOneObjectCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2651:2: ( ( (lv_condition_2_1= '!=' | lv_condition_2_2= '==' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2652:1: ( (lv_condition_2_1= '!=' | lv_condition_2_2= '==' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2652:1: ( (lv_condition_2_1= '!=' | lv_condition_2_2= '==' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2653:1: (lv_condition_2_1= '!=' | lv_condition_2_2= '==' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2653:1: (lv_condition_2_1= '!=' | lv_condition_2_2= '==' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            else if ( (LA59_0==61) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2654:3: lv_condition_2_1= '!='
                    {
                    lv_condition_2_1=(Token)match(input,60,FOLLOW_60_in_ruleDataQuery6130); 

                            newLeafNode(lv_condition_2_1, grammarAccess.getDataQueryAccess().getConditionExclamationMarkEqualsSignKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataQueryRule());
                    	        }
                           		setWithLastConsumed(current, "condition", lv_condition_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2666:8: lv_condition_2_2= '=='
                    {
                    lv_condition_2_2=(Token)match(input,61,FOLLOW_61_in_ruleDataQuery6159); 

                            newLeafNode(lv_condition_2_2, grammarAccess.getDataQueryAccess().getConditionEqualsSignEqualsSignKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataQueryRule());
                    	        }
                           		setWithLastConsumed(current, "condition", lv_condition_2_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2681:2: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2682:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2682:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2683:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataQueryRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataQuery6195); 

            		newLeafNode(otherlv_3, grammarAccess.getDataQueryAccess().getObjectTwoObjectCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataQuery"


    // $ANTLR start "entryRuleBraceQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2702:1: entryRuleBraceQuery returns [EObject current=null] : iv_ruleBraceQuery= ruleBraceQuery EOF ;
    public final EObject entryRuleBraceQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBraceQuery = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2703:2: (iv_ruleBraceQuery= ruleBraceQuery EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2704:2: iv_ruleBraceQuery= ruleBraceQuery EOF
            {
             newCompositeNode(grammarAccess.getBraceQueryRule()); 
            pushFollow(FOLLOW_ruleBraceQuery_in_entryRuleBraceQuery6231);
            iv_ruleBraceQuery=ruleBraceQuery();

            state._fsp--;

             current =iv_ruleBraceQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBraceQuery6241); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBraceQuery"


    // $ANTLR start "ruleBraceQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2711:1: ruleBraceQuery returns [EObject current=null] : ( (otherlv_0= '!' )? otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleBraceQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_queries_2_0 = null;

        EObject lv_queries_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2714:28: ( ( (otherlv_0= '!' )? otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2715:1: ( (otherlv_0= '!' )? otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2715:1: ( (otherlv_0= '!' )? otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2715:2: (otherlv_0= '!' )? otherlv_1= '(' ( (lv_queries_2_0= ruleQueryTypes ) ) ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )* otherlv_6= ')'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2715:2: (otherlv_0= '!' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==56) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2715:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleBraceQuery6279); 

                        	newLeafNode(otherlv_0, grammarAccess.getBraceQueryAccess().getExclamationMarkKeyword_0());
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleBraceQuery6293); 

                	newLeafNode(otherlv_1, grammarAccess.getBraceQueryAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2723:1: ( (lv_queries_2_0= ruleQueryTypes ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2724:1: (lv_queries_2_0= ruleQueryTypes )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2724:1: (lv_queries_2_0= ruleQueryTypes )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2725:3: lv_queries_2_0= ruleQueryTypes
            {
             
            	        newCompositeNode(grammarAccess.getBraceQueryAccess().getQueriesQueryTypesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryTypes_in_ruleBraceQuery6314);
            lv_queries_2_0=ruleQueryTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBraceQueryRule());
            	        }
                   		add(
                   			current, 
                   			"queries",
                    		lv_queries_2_0, 
                    		"QueryTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2741:2: ( (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=53 && LA62_0<=54)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2741:3: (otherlv_3= '||' | otherlv_4= '&&' ) ( (lv_queries_5_0= ruleQueryTypes ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2741:3: (otherlv_3= '||' | otherlv_4= '&&' )
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==53) ) {
            	        alt61=1;
            	    }
            	    else if ( (LA61_0==54) ) {
            	        alt61=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 61, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2741:5: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleBraceQuery6328); 

            	                	newLeafNode(otherlv_3, grammarAccess.getBraceQueryAccess().getVerticalLineVerticalLineKeyword_3_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2746:7: otherlv_4= '&&'
            	            {
            	            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleBraceQuery6346); 

            	                	newLeafNode(otherlv_4, grammarAccess.getBraceQueryAccess().getAmpersandAmpersandKeyword_3_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2750:2: ( (lv_queries_5_0= ruleQueryTypes ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2751:1: (lv_queries_5_0= ruleQueryTypes )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2751:1: (lv_queries_5_0= ruleQueryTypes )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2752:3: lv_queries_5_0= ruleQueryTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBraceQueryAccess().getQueriesQueryTypesParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQueryTypes_in_ruleBraceQuery6368);
            	    lv_queries_5_0=ruleQueryTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBraceQueryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"queries",
            	            		lv_queries_5_0, 
            	            		"QueryTypes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleBraceQuery6382); 

                	newLeafNode(otherlv_6, grammarAccess.getBraceQueryAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBraceQuery"


    // $ANTLR start "entryRulePlayerQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2780:1: entryRulePlayerQuery returns [EObject current=null] : iv_rulePlayerQuery= rulePlayerQuery EOF ;
    public final EObject entryRulePlayerQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerQuery = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2781:2: (iv_rulePlayerQuery= rulePlayerQuery EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2782:2: iv_rulePlayerQuery= rulePlayerQuery EOF
            {
             newCompositeNode(grammarAccess.getPlayerQueryRule()); 
            pushFollow(FOLLOW_rulePlayerQuery_in_entryRulePlayerQuery6418);
            iv_rulePlayerQuery=rulePlayerQuery();

            state._fsp--;

             current =iv_rulePlayerQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlayerQuery6428); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayerQuery"


    // $ANTLR start "rulePlayerQuery"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2789:1: rulePlayerQuery returns [EObject current=null] : ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) ) ) )? ) ;
    public final EObject rulePlayerQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_boolean_5_1=null;
        Token lv_boolean_5_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2792:28: ( ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) ) ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:1: ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) ) ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:1: ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:2: (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'is' ( ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) ) ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:2: (otherlv_0= '!' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==56) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2793:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,56,FOLLOW_56_in_rulePlayerQuery6466); 

                        	newLeafNode(otherlv_0, grammarAccess.getPlayerQueryAccess().getExclamationMarkKeyword_0());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2797:3: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2798:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2798:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2799:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPlayerQueryRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlayerQuery6488); 

            		newLeafNode(otherlv_1, grammarAccess.getPlayerQueryAccess().getPlayerRoleCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,62,FOLLOW_62_in_rulePlayerQuery6500); 

                	newLeafNode(otherlv_2, grammarAccess.getPlayerQueryAccess().getFullStopKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2814:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2815:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2815:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2816:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPlayerQueryRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlayerQuery6520); 

            		newLeafNode(otherlv_3, grammarAccess.getPlayerQueryAccess().getStatusStateCrossReference_3_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2827:2: (otherlv_4= 'is' ( ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==57) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2827:4: otherlv_4= 'is' ( ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_57_in_rulePlayerQuery6533); 

                        	newLeafNode(otherlv_4, grammarAccess.getPlayerQueryAccess().getIsKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2831:1: ( ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2832:1: ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2832:1: ( (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2833:1: (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2833:1: (lv_boolean_5_1= 'true' | lv_boolean_5_2= 'false' )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==58) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==59) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2834:3: lv_boolean_5_1= 'true'
                            {
                            lv_boolean_5_1=(Token)match(input,58,FOLLOW_58_in_rulePlayerQuery6553); 

                                    newLeafNode(lv_boolean_5_1, grammarAccess.getPlayerQueryAccess().getBooleanTrueKeyword_4_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPlayerQueryRule());
                            	        }
                                   		setWithLastConsumed(current, "boolean", lv_boolean_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2846:8: lv_boolean_5_2= 'false'
                            {
                            lv_boolean_5_2=(Token)match(input,59,FOLLOW_59_in_rulePlayerQuery6582); 

                                    newLeafNode(lv_boolean_5_2, grammarAccess.getPlayerQueryAccess().getBooleanFalseKeyword_4_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPlayerQueryRule());
                            	        }
                                   		setWithLastConsumed(current, "boolean", lv_boolean_5_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayerQuery"


    // $ANTLR start "entryRuleCommunication"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2869:1: entryRuleCommunication returns [EObject current=null] : iv_ruleCommunication= ruleCommunication EOF ;
    public final EObject entryRuleCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunication = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2870:2: (iv_ruleCommunication= ruleCommunication EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2871:2: iv_ruleCommunication= ruleCommunication EOF
            {
             newCompositeNode(grammarAccess.getCommunicationRule()); 
            pushFollow(FOLLOW_ruleCommunication_in_entryRuleCommunication6636);
            iv_ruleCommunication=ruleCommunication();

            state._fsp--;

             current =iv_ruleCommunication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommunication6646); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommunication"


    // $ANTLR start "ruleCommunication"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2878:1: ruleCommunication returns [EObject current=null] : ( ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'send' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' (otherlv_13= 'via' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= ';' ) ;
    public final EObject ruleCommunication() throws RecognitionException {
        EObject current = null;

        Token lv_importance_0_1=null;
        Token lv_importance_0_2=null;
        Token otherlv_1=null;
        Token lv_execution_2_1=null;
        Token lv_execution_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2881:28: ( ( ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'send' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' (otherlv_13= 'via' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:1: ( ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'send' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' (otherlv_13= 'via' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:1: ( ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'send' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' (otherlv_13= 'via' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:2: ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'send' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? otherlv_12= ')' (otherlv_13= 'via' ( (otherlv_14= RULE_ID ) ) )? otherlv_15= ';'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2882:2: ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=63 && LA67_0<=64)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2883:1: ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2883:1: ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2884:1: (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2884:1: (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==63) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==64) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2885:3: lv_importance_0_1= 'im'
                            {
                            lv_importance_0_1=(Token)match(input,63,FOLLOW_63_in_ruleCommunication6691); 

                                    newLeafNode(lv_importance_0_1, grammarAccess.getCommunicationAccess().getImportanceImKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCommunicationRule());
                            	        }
                                   		setWithLastConsumed(current, "importance", lv_importance_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2897:8: lv_importance_0_2= 'unim'
                            {
                            lv_importance_0_2=(Token)match(input,64,FOLLOW_64_in_ruleCommunication6720); 

                                    newLeafNode(lv_importance_0_2, grammarAccess.getCommunicationAccess().getImportanceUnimKeyword_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCommunicationRule());
                            	        }
                                   		setWithLastConsumed(current, "importance", lv_importance_0_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2912:3: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2913:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2913:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2914:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCommunicationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunication6757); 

            		newLeafNode(otherlv_1, grammarAccess.getCommunicationAccess().getSenderObjectCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2925:2: ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2926:1: ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2926:1: ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2927:1: (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2927:1: (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==65) ) {
                alt68=1;
            }
            else if ( (LA68_0==66) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2928:3: lv_execution_2_1= 'can'
                    {
                    lv_execution_2_1=(Token)match(input,65,FOLLOW_65_in_ruleCommunication6777); 

                            newLeafNode(lv_execution_2_1, grammarAccess.getCommunicationAccess().getExecutionCanKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommunicationRule());
                    	        }
                           		setWithLastConsumed(current, "execution", lv_execution_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2940:8: lv_execution_2_2= 'must'
                    {
                    lv_execution_2_2=(Token)match(input,66,FOLLOW_66_in_ruleCommunication6806); 

                            newLeafNode(lv_execution_2_2, grammarAccess.getCommunicationAccess().getExecutionMustKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommunicationRule());
                    	        }
                           		setWithLastConsumed(current, "execution", lv_execution_2_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,67,FOLLOW_67_in_ruleCommunication6834); 

                	newLeafNode(otherlv_3, grammarAccess.getCommunicationAccess().getSendKeyword_3());
                
            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleCommunication6846); 

                	newLeafNode(otherlv_4, grammarAccess.getCommunicationAccess().getToKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2963:1: ( (otherlv_5= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2964:1: (otherlv_5= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2964:1: (otherlv_5= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2965:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCommunicationRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunication6866); 

            		newLeafNode(otherlv_5, grammarAccess.getCommunicationAccess().getReceiverRoleCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,62,FOLLOW_62_in_ruleCommunication6878); 

                	newLeafNode(otherlv_6, grammarAccess.getCommunicationAccess().getFullStopKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2980:1: ( (otherlv_7= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2981:1: (otherlv_7= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2981:1: (otherlv_7= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2982:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCommunicationRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunication6898); 

            		newLeafNode(otherlv_7, grammarAccess.getCommunicationAccess().getMessageMessageCrossReference_7_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleCommunication6910); 

                	newLeafNode(otherlv_8, grammarAccess.getCommunicationAccess().getLeftParenthesisKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2997:1: ( ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2997:2: ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2997:2: ( (otherlv_9= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2998:1: (otherlv_9= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2998:1: (otherlv_9= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2999:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommunicationRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunication6931); 

                    		newLeafNode(otherlv_9, grammarAccess.getCommunicationAccess().getParameterObjectCrossReference_9_0_0()); 
                    	

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3010:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==28) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3010:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleCommunication6944); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getCommunicationAccess().getCommaKeyword_9_1_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3014:1: ( (otherlv_11= RULE_ID ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3015:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3015:1: (otherlv_11= RULE_ID )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3016:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCommunicationRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunication6964); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getCommunicationAccess().getParameterObjectCrossReference_9_1_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleCommunication6980); 

                	newLeafNode(otherlv_12, grammarAccess.getCommunicationAccess().getRightParenthesisKeyword_10());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3031:1: (otherlv_13= 'via' ( (otherlv_14= RULE_ID ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==69) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3031:3: otherlv_13= 'via' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,69,FOLLOW_69_in_ruleCommunication6993); 

                        	newLeafNode(otherlv_13, grammarAccess.getCommunicationAccess().getViaKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3035:1: ( (otherlv_14= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3036:1: (otherlv_14= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3036:1: (otherlv_14= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3037:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommunicationRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommunication7013); 

                    		newLeafNode(otherlv_14, grammarAccess.getCommunicationAccess().getChannelChannelDefintionCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleCommunication7027); 

                	newLeafNode(otherlv_15, grammarAccess.getCommunicationAccess().getSemicolonKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommunication"


    // $ANTLR start "entryRuleActivity"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3060:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3061:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3062:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity7063);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity7073); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3069:1: ruleActivity returns [EObject current=null] : ( ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'do' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ';' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_importance_0_1=null;
        Token lv_importance_0_2=null;
        Token otherlv_1=null;
        Token lv_execution_2_1=null;
        Token lv_execution_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3072:28: ( ( ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'do' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3073:1: ( ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'do' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3073:1: ( ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'do' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3073:2: ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) ) otherlv_3= 'do' ( (otherlv_4= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ')' otherlv_10= ';'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3073:2: ( ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=63 && LA73_0<=64)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3074:1: ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3074:1: ( (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3075:1: (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3075:1: (lv_importance_0_1= 'im' | lv_importance_0_2= 'unim' )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==63) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==64) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3076:3: lv_importance_0_1= 'im'
                            {
                            lv_importance_0_1=(Token)match(input,63,FOLLOW_63_in_ruleActivity7118); 

                                    newLeafNode(lv_importance_0_1, grammarAccess.getActivityAccess().getImportanceImKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActivityRule());
                            	        }
                                   		setWithLastConsumed(current, "importance", lv_importance_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3088:8: lv_importance_0_2= 'unim'
                            {
                            lv_importance_0_2=(Token)match(input,64,FOLLOW_64_in_ruleActivity7147); 

                                    newLeafNode(lv_importance_0_2, grammarAccess.getActivityAccess().getImportanceUnimKeyword_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActivityRule());
                            	        }
                                   		setWithLastConsumed(current, "importance", lv_importance_0_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3103:3: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3104:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3104:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3105:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity7184); 

            		newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getRoleRoleCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3116:2: ( ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3117:1: ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3117:1: ( (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3118:1: (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3118:1: (lv_execution_2_1= 'can' | lv_execution_2_2= 'must' )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==65) ) {
                alt74=1;
            }
            else if ( (LA74_0==66) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3119:3: lv_execution_2_1= 'can'
                    {
                    lv_execution_2_1=(Token)match(input,65,FOLLOW_65_in_ruleActivity7204); 

                            newLeafNode(lv_execution_2_1, grammarAccess.getActivityAccess().getExecutionCanKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		setWithLastConsumed(current, "execution", lv_execution_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3131:8: lv_execution_2_2= 'must'
                    {
                    lv_execution_2_2=(Token)match(input,66,FOLLOW_66_in_ruleActivity7233); 

                            newLeafNode(lv_execution_2_2, grammarAccess.getActivityAccess().getExecutionMustKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		setWithLastConsumed(current, "execution", lv_execution_2_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,70,FOLLOW_70_in_ruleActivity7261); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getDoKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3150:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3151:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3151:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3152:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity7281); 

            		newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getTaskTaskCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleActivity7293); 

                	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getLeftParenthesisKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3167:1: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3167:2: ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3167:2: ( (otherlv_6= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3168:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3168:1: (otherlv_6= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3169:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity7314); 

                    		newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getParameterObjectCrossReference_6_0_0()); 
                    	

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3180:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==28) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3180:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleActivity7327); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3184:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3185:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3185:1: (otherlv_8= RULE_ID )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3186:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity7347); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getParameterObjectCrossReference_6_1_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleActivity7363); 

                	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getRightParenthesisKeyword_7());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleActivity7375); 

                	newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleSystemwork"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3213:1: entryRuleSystemwork returns [EObject current=null] : iv_ruleSystemwork= ruleSystemwork EOF ;
    public final EObject entryRuleSystemwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemwork = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3214:2: (iv_ruleSystemwork= ruleSystemwork EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3215:2: iv_ruleSystemwork= ruleSystemwork EOF
            {
             newCompositeNode(grammarAccess.getSystemworkRule()); 
            pushFollow(FOLLOW_ruleSystemwork_in_entryRuleSystemwork7411);
            iv_ruleSystemwork=ruleSystemwork();

            state._fsp--;

             current =iv_ruleSystemwork; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemwork7421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemwork"


    // $ANTLR start "ruleSystemwork"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3222:1: ruleSystemwork returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' ) ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' ) ) ) otherlv_5= 'systemwork' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' otherlv_14= ';' ) ;
    public final EObject ruleSystemwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importance_2_1=null;
        Token lv_importance_2_2=null;
        Token otherlv_3=null;
        Token lv_execution_4_1=null;
        Token lv_execution_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3225:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' ) ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' ) ) ) otherlv_5= 'systemwork' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' otherlv_14= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3226:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' ) ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' ) ) ) otherlv_5= 'systemwork' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' otherlv_14= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3226:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' ) ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' ) ) ) otherlv_5= 'systemwork' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' otherlv_14= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3226:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' ) ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' ) ) ) otherlv_5= 'systemwork' ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= ')' otherlv_14= ';'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3226:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==71) ) {
                    alt77=1;
                }
            }
            switch (alt77) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3226:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3226:3: ( (otherlv_0= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:1: (otherlv_0= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3228:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemworkRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemwork7467); 

                    		newLeafNode(otherlv_0, grammarAccess.getSystemworkAccess().getReturnObjectObjectCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSystemwork7479); 

                        	newLeafNode(otherlv_1, grammarAccess.getSystemworkAccess().getEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3243:3: ( ( (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=63 && LA79_0<=64)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3244:1: ( (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3244:1: ( (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3245:1: (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3245:1: (lv_importance_2_1= 'im' | lv_importance_2_2= 'unim' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==63) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==64) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3246:3: lv_importance_2_1= 'im'
                            {
                            lv_importance_2_1=(Token)match(input,63,FOLLOW_63_in_ruleSystemwork7501); 

                                    newLeafNode(lv_importance_2_1, grammarAccess.getSystemworkAccess().getImportanceImKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSystemworkRule());
                            	        }
                                   		setWithLastConsumed(current, "importance", lv_importance_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3258:8: lv_importance_2_2= 'unim'
                            {
                            lv_importance_2_2=(Token)match(input,64,FOLLOW_64_in_ruleSystemwork7530); 

                                    newLeafNode(lv_importance_2_2, grammarAccess.getSystemworkAccess().getImportanceUnimKeyword_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSystemworkRule());
                            	        }
                                   		setWithLastConsumed(current, "importance", lv_importance_2_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3273:3: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3274:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3274:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3275:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemworkRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemwork7567); 

            		newLeafNode(otherlv_3, grammarAccess.getSystemworkAccess().getRoleRoleCrossReference_2_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3286:2: ( ( (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3287:1: ( (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3287:1: ( (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3288:1: (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3288:1: (lv_execution_4_1= 'can' | lv_execution_4_2= 'must' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==65) ) {
                alt80=1;
            }
            else if ( (LA80_0==66) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3289:3: lv_execution_4_1= 'can'
                    {
                    lv_execution_4_1=(Token)match(input,65,FOLLOW_65_in_ruleSystemwork7587); 

                            newLeafNode(lv_execution_4_1, grammarAccess.getSystemworkAccess().getExecutionCanKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemworkRule());
                    	        }
                           		setWithLastConsumed(current, "execution", lv_execution_4_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3301:8: lv_execution_4_2= 'must'
                    {
                    lv_execution_4_2=(Token)match(input,66,FOLLOW_66_in_ruleSystemwork7616); 

                            newLeafNode(lv_execution_4_2, grammarAccess.getSystemworkAccess().getExecutionMustKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemworkRule());
                    	        }
                           		setWithLastConsumed(current, "execution", lv_execution_4_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleSystemwork7644); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemworkAccess().getSystemworkKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3320:1: ( (otherlv_6= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3321:1: (otherlv_6= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3321:1: (otherlv_6= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3322:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemworkRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemwork7664); 

            		newLeafNode(otherlv_6, grammarAccess.getSystemworkAccess().getSystemSystemCrossReference_5_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,62,FOLLOW_62_in_ruleSystemwork7676); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemworkAccess().getFullStopKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3337:1: ( (otherlv_8= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3338:1: (otherlv_8= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3338:1: (otherlv_8= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3339:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemworkRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemwork7696); 

            		newLeafNode(otherlv_8, grammarAccess.getSystemworkAccess().getFunctionFunctionCrossReference_7_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleSystemwork7708); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemworkAccess().getLeftParenthesisKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3354:1: ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3354:2: ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3354:2: ( (otherlv_10= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3355:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3355:1: (otherlv_10= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3356:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemworkRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemwork7729); 

                    		newLeafNode(otherlv_10, grammarAccess.getSystemworkAccess().getParameterObjectCrossReference_9_0_0()); 
                    	

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3367:2: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==28) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3367:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleSystemwork7742); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getSystemworkAccess().getCommaKeyword_9_1_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3371:1: ( (otherlv_12= RULE_ID ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3372:1: (otherlv_12= RULE_ID )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3372:1: (otherlv_12= RULE_ID )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3373:3: otherlv_12= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSystemworkRule());
                    	    	        }
                    	            
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemwork7762); 

                    	    		newLeafNode(otherlv_12, grammarAccess.getSystemworkAccess().getParameterObjectCrossReference_9_1_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleSystemwork7778); 

                	newLeafNode(otherlv_13, grammarAccess.getSystemworkAccess().getRightParenthesisKeyword_10());
                
            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleSystemwork7790); 

                	newLeafNode(otherlv_14, grammarAccess.getSystemworkAccess().getSemicolonKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemwork"

    // Delegated rules


    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA44_eotS =
        "\16\uffff";
    static final String DFA44_eofS =
        "\16\uffff";
    static final String DFA44_minS =
        "\3\4\1\101\4\uffff\1\101\1\uffff\2\103\2\uffff";
    static final String DFA44_maxS =
        "\1\100\2\4\1\107\4\uffff\1\102\1\uffff\2\110\2\uffff";
    static final String DFA44_acceptS =
        "\4\uffff\1\3\1\4\1\5\1\7\1\uffff\1\6\2\uffff\1\2\1\1";
    static final String DFA44_specialS =
        "\16\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\3\47\uffff\1\5\1\uffff\1\4\1\uffff\1\7\3\uffff\1\6\12\uffff"+
            "\1\1\1\2",
            "\1\10",
            "\1\10",
            "\1\12\1\13\4\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "",
            "\1\15\2\uffff\1\14\1\uffff\1\11",
            "\1\15\2\uffff\1\14\1\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "2074:1: (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_IFQuery_4= ruleIFQuery | this_Systemwork_5= ruleSystemwork | this_Loop_6= ruleLoop )";
        }
    }
    static final String DFA45_eotS =
        "\14\uffff";
    static final String DFA45_eofS =
        "\14\uffff";
    static final String DFA45_minS =
        "\3\4\1\101\2\uffff\1\101\2\103\3\uffff";
    static final String DFA45_maxS =
        "\1\100\2\4\1\107\2\uffff\1\102\2\110\3\uffff";
    static final String DFA45_acceptS =
        "\4\uffff\1\3\1\4\3\uffff\1\5\1\2\1\1";
    static final String DFA45_specialS =
        "\14\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\3\47\uffff\1\5\1\uffff\1\4\20\uffff\1\1\1\2",
            "\1\6",
            "\1\6",
            "\1\7\1\10\4\uffff\1\11",
            "",
            "",
            "\1\7\1\10",
            "\1\13\2\uffff\1\12\1\uffff\1\11",
            "\1\13\2\uffff\1\12\1\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "2164:1: (this_Communication_0= ruleCommunication | this_Activity_1= ruleActivity | this_Alternative_2= ruleAlternative | this_TimeAlternative_3= ruleTimeAlternative | this_Systemwork_4= ruleSystemwork )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterview_in_ruleDomainmodel132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleDomainmodel151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemtype_in_ruleTypeDefinition247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChannelDefintion_in_ruleTypeDefinition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleTypeDefinition301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoletype_in_ruleTypeDefinition328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDatatype410 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDatatype428 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDatatype453 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDatatype465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatatype482 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDatatype499 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDatatype511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemtype_in_entryRuleSystemtype547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemtype557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSystemtype594 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSystemtype612 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystemtype637 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSystemtype649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemtype666 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSystemtype683 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleSystemtype704 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_16_in_ruleSystemtype717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChannelDefintion_in_entryRuleChannelDefintion753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChannelDefintion763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleChannelDefintion800 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleChannelDefintion818 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChannelDefintion843 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_ruleChannelDefintion863 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21_in_ruleChannelDefintion892 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleChannelDefintion921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChannelDefintion938 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChannelDefintion955 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleChannelDefintion967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoletype_in_entryRuleRoletype1003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoletype1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRoletype1050 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRoletype1068 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRoletype1093 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRoletype1105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRoletype1122 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRoletype1139 = new BitSet(new long[]{0x0000000046010000L});
    public static final BitSet FOLLOW_ruleState_in_ruleRoletype1160 = new BitSet(new long[]{0x0000000046010000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleRoletype1182 = new BitSet(new long[]{0x0000000044010000L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleRoletype1204 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleRoletype1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleState1300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState1317 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask1370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTask1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1434 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTask1451 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1472 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleTask1485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1505 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleTask1521 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTask1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMessage1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1633 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMessage1650 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1671 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleMessage1684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1704 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleMessage1720 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMessage1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunction1815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1832 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunction1849 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1870 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleFunction1883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1903 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleFunction1919 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_32_in_ruleFunction1938 = new BitSet(new long[]{0x0000000200002010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1971 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_33_in_ruleFunction1990 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunction2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterview_in_entryRuleInterview2054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterview2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInterview2101 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInterview2119 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInterview2144 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInterview2156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterview2173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterview2190 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleInterview2202 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleRole_in_ruleInterview2223 = new BitSet(new long[]{0x000003E200010000L});
    public static final BitSet FOLLOW_ruleObject_in_ruleInterview2244 = new BitSet(new long[]{0x000003E200010000L});
    public static final BitSet FOLLOW_ruleBusinessProcess_in_ruleInterview2266 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleInterview2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_ruleObject2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleObject2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleObject2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleObject2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBoolean2535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolean2555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolean2573 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBoolean2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem2626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSystem2673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem2693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem2710 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData2763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleData2810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleData2830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleData2847 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleData2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole2900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRole2955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_40_in_ruleRole2984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole3020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole3037 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRole3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessProcess_in_entryRuleBusinessProcess3092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessProcess3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBusinessProcess3139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessProcess3156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBusinessProcess3173 = new BitSet(new long[]{0x0000540000010000L});
    public static final BitSet FOLLOW_ruleProcessStartElements_in_ruleBusinessProcess3194 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBusinessProcess3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessStartElements_in_entryRuleProcessStartElements3243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessStartElements3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartTimeAlternative_in_ruleProcessStartElements3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_ruleProcessStartElements3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartAlternative_in_ruleProcessStartElements3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChart_in_entryRuleChart3389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChart3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleChart3445 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChart3457 = new BitSet(new long[]{0x8000500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessChartElements_in_ruleChart3478 = new BitSet(new long[]{0x8000500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleChart3491 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleChart3503 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChart3515 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleChart3536 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleChart3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartTimeAlternative_in_entryRuleStartTimeAlternative3585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartTimeAlternative3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleStartTimeAlternative3641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStartTimeAlternative3653 = new BitSet(new long[]{0x0000540000010000L});
    public static final BitSet FOLLOW_ruleProcessStartElements_in_ruleStartTimeAlternative3674 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStartTimeAlternative3687 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleStartTimeAlternative3699 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStartTimeAlternative3711 = new BitSet(new long[]{0x0000540000010000L});
    public static final BitSet FOLLOW_ruleProcessStartElements_in_ruleStartTimeAlternative3732 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStartTimeAlternative3745 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleStartTimeAlternative3758 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStartTimeAlternative3770 = new BitSet(new long[]{0x0000540000010000L});
    public static final BitSet FOLLOW_ruleProcessStartElements_in_ruleStartTimeAlternative3791 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStartTimeAlternative3804 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleTimeAlternative_in_entryRuleTimeAlternative3842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeAlternative3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTimeAlternative3898 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTimeAlternative3910 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleTimeAlternative3931 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleTimeAlternative3944 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleTimeAlternative3956 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTimeAlternative3968 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleTimeAlternative3989 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleTimeAlternative4002 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleTimeAlternative4015 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTimeAlternative4027 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleTimeAlternative4048 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleTimeAlternative4061 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleStartAlternative_in_entryRuleStartAlternative4099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartAlternative4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleStartAlternative4155 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStartAlternative4167 = new BitSet(new long[]{0x0000540000010000L});
    public static final BitSet FOLLOW_ruleProcessStartElements_in_ruleStartAlternative4188 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStartAlternative4201 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleStartAlternative4213 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStartAlternative4225 = new BitSet(new long[]{0x0000540000010000L});
    public static final BitSet FOLLOW_ruleProcessStartElements_in_ruleStartAlternative4246 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStartAlternative4259 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleStartAlternative4272 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStartAlternative4284 = new BitSet(new long[]{0x0000540000010000L});
    public static final BitSet FOLLOW_ruleProcessStartElements_in_ruleStartAlternative4305 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStartAlternative4318 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative4356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAlternative4412 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAlternative4424 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleAlternative4445 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleAlternative4458 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAlternative4470 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAlternative4482 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleAlternative4503 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleAlternative4516 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAlternative4529 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAlternative4541 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleAlternative4562 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleAlternative4575 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleProcessElements_in_entryRuleProcessElements4613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessElements4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommunication_in_ruleProcessElements4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleProcessElements4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleProcessElements4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeAlternative_in_ruleProcessElements4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIFQuery_in_ruleProcessElements4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemwork_in_ruleProcessElements4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_ruleProcessElements4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessChartElements_in_entryRuleProcessChartElements4867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessChartElements4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommunication_in_ruleProcessChartElements4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleProcessChartElements4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleProcessChartElements4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeAlternative_in_ruleProcessChartElements5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemwork_in_ruleProcessChartElements5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_entryRuleLoop5067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoop5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLoop5114 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleLoop5126 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_50_in_ruleLoop5145 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoop5181 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleLoop5199 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLoop5211 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleLoop5232 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleLoop5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIFQuery_in_entryRuleIFQuery5281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIFQuery5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIFQuery5328 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIFQuery5340 = new BitSet(new long[]{0x0100000008000010L});
    public static final BitSet FOLLOW_ruleQueryTypes_in_ruleIFQuery5361 = new BitSet(new long[]{0x0060000020000000L});
    public static final BitSet FOLLOW_53_in_ruleIFQuery5375 = new BitSet(new long[]{0x0100000008000010L});
    public static final BitSet FOLLOW_54_in_ruleIFQuery5393 = new BitSet(new long[]{0x0100000008000010L});
    public static final BitSet FOLLOW_ruleQueryTypes_in_ruleIFQuery5415 = new BitSet(new long[]{0x0060000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIFQuery5429 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIFQuery5441 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleIFQuery5462 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleIFQuery5475 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIFQuery5488 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIFQuery5500 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcessElements_in_ruleIFQuery5521 = new BitSet(new long[]{0x8011500000010010L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_ruleIFQuery5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryTypes_in_entryRuleQueryTypes5572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryTypes5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleQueryTypes5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBraceQuery_in_ruleQueryTypes5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery5691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataQuery_in_ruleQuery5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlayerQuery_in_ruleQuery5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanQuery_in_ruleQuery5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanQuery_in_entryRuleBooleanQuery5837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanQuery5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBooleanQuery5885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanQuery5907 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBooleanQuery5920 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_ruleBooleanQuery5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBooleanQuery5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataQuery_in_entryRuleDataQuery6023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataQuery6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDataQuery6076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataQuery6110 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleDataQuery6130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_61_in_ruleDataQuery6159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataQuery6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBraceQuery_in_entryRuleBraceQuery6231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBraceQuery6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBraceQuery6279 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBraceQuery6293 = new BitSet(new long[]{0x0100000008000010L});
    public static final BitSet FOLLOW_ruleQueryTypes_in_ruleBraceQuery6314 = new BitSet(new long[]{0x0060000020000000L});
    public static final BitSet FOLLOW_53_in_ruleBraceQuery6328 = new BitSet(new long[]{0x0100000008000010L});
    public static final BitSet FOLLOW_54_in_ruleBraceQuery6346 = new BitSet(new long[]{0x0100000008000010L});
    public static final BitSet FOLLOW_ruleQueryTypes_in_ruleBraceQuery6368 = new BitSet(new long[]{0x0060000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBraceQuery6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlayerQuery_in_entryRulePlayerQuery6418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlayerQuery6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePlayerQuery6466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlayerQuery6488 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_rulePlayerQuery6500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlayerQuery6520 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_rulePlayerQuery6533 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_rulePlayerQuery6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePlayerQuery6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommunication_in_entryRuleCommunication6636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommunication6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCommunication6691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_64_in_ruleCommunication6720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunication6757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_ruleCommunication6777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_ruleCommunication6806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleCommunication6834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleCommunication6846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunication6866 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleCommunication6878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunication6898 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCommunication6910 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunication6931 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleCommunication6944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunication6964 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleCommunication6980 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleCommunication6993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommunication7013 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCommunication7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity7063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleActivity7118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_64_in_ruleActivity7147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity7184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_ruleActivity7204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_66_in_ruleActivity7233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleActivity7261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity7281 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleActivity7293 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity7314 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleActivity7327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity7347 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleActivity7363 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActivity7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemwork_in_entryRuleSystemwork7411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemwork7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemwork7467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleSystemwork7479 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleSystemwork7501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_64_in_ruleSystemwork7530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemwork7567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_ruleSystemwork7587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_66_in_ruleSystemwork7616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleSystemwork7644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemwork7664 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleSystemwork7676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemwork7696 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSystemwork7708 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemwork7729 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleSystemwork7742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemwork7762 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleSystemwork7778 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystemwork7790 = new BitSet(new long[]{0x0000000000000002L});

}