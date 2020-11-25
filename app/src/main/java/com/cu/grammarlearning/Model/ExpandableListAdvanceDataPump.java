package com.cu.grammarlearning.Model;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ExpandableListAdvanceDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        String Active_Passive="                -၀ါက်တြင္ပါေသာ sub, verb, obj မ်ားကိုရွာပါ။\n" +
                "                -sub နဲ့ object ေနရာလဲပါ။ Subj ေရွ႕တြင္ ထည့္ပါ။\n" +
                "                -Pronoun မ်ားဆိုလ်ွင္ I=me, He=him, she=her, we=us, they=them, who=whom ေၿပာင္းေပးပါ။\n" +
                "               -by you/ by them/ by someone/ by people ထည့္စရာမလိုပါ။\n" +
                "               -nobody ၿဖဳတ္လ်ွင္ not ထည့္ပါ။\n" +
                "\t\t\ta. teach/ teacher===> am/ is/ are + taught\n" +
                "\t\t\tb. taught===> was/ were + taught\n" +
                "\t\t\tc. is/ are + teaching ===> is/ are +being +taught\n" +
                "\t\t\t\twas/ were + taught===> was/ were + being + taught\n" +
                "\t\t\td. will/ can/ may +teach===>will/ can/ many + be + taught\n" +
                "\t\t\twould/ could/ might +teach ===> would/ could/ might + be +taught\n" +
                "\t\t\te. am/ is + going to + teach ===> am/ is + going to + be + taught\n" +
                "\t\t\t are + going to + teach ===> are +going to + be + taught\n" +
                "\t\t\tf. has/ have + taught ===> has/have + been + taught\n" +
                "\t\t\t had + taught===> had + been + taught<br></blockquote>\n" +
                "\t\t\t\n" +
                "\n" +
                "                               Passive===> Active\n" +
                "\t                     -by ၿဖဳတ္ ေနာက္မွ obj ကို subj အၿဖစ္သုံးပါ။\n" +
                "\t                     -verb ကို is/ are/ was/ were/ be/ being/ been ၿဖဳတ္ပါ။\n" +
                "                                   -v3 ကို v1/ v2/ ving ေၿပာင္းပါ။\n" +
                "\t                     -ေရွ့မွ subj ကို verb ေနာက္သို့ obj အၿဖစ္ပို႔ပါ။";
        String After="1.after Ving\n" +
                "\t-အရင္ျဖစ္ပ်က္သည့္ verb ကို Ving ေျပာင္း\n" +
                "\t-and, and then, first ပါလ်ွင္ျဖဳတ္\n" +
                "             -second subject သည္ pronoun ျဖစ္လ်ွင္ လိုအပ္လ်ွင္ noun ေျပာင္း\n" +
                "             -second Sentence တြင္ subj မပါလ်ွင္ ထည့္\n" +
                "\n" +
                " 2. after + subj + had + V3\n" +
                "\t-after ၏ ေနာက္တြင္ subj ပါလ်ွင္ V ကို had + V3 ေျပာင္း\n" +
                "\t-then, and then, first ပါလ်ွင္ျဖဳတ္\n" +
                "\t-second Sentence တြင္ subj မပါလ်ွင္ ထည့္\n" +
                "\n" +
                "3. after + being + V3 \n" +
                "\t- after + subj + had been + V3";
        String Although_In_spite_Of="1. Type(A)\n" +
                "       -subj တူရင္ ျဖဳတ္\n" +
                "       -V to be ကို Being ေျပာင္း\n" +
                "       -လိုအပ္ရင္ Pronoun ကို noun ေျပာင္း\n" +
                "__________________________________________\n" +
                "2.Type(B)\n" +
                "        -subj တူရင္ ျဖဳတ္\n" +
                "        -V ကို Ving ေျပာင္း\n" +
                "        -မူလ adv ကို ing ေျပာင္း\n" +
                "        -လိုအပ္ရင္ Pronoun ကို noun ေျပာင္း\n" +
                "__________________________________________\n" +
                "3.Type(C)\n" +
                "        -Subj တူလ်ွင္ first subj ကိုမျဖဳတ္ရ in spite of နဲ႔တြဲ\n" +
                "        -V to be ကို Ving ေျပာင္း\n" +
                "        -Subj မတူရင္ first subj ကိုမျဖုတ္ရ in spite of နဲ႔တြဲ\n" +
                "        -V ကို Ving ေျပာင္း\n" +
                "________________________________________________\n" +
                "4.in spite of==> although\n" +
                "         -|in spite of |-------| being   | adj | , subj | verb |\n" +
                "         -|although &nbsp;| subj | V to be | adj | , subj | verb |\n" +
                "\t\t\t\t\t";
        String Both_and="          - မတူ(၂)ခု\n" +
                "          -တူ(၁)ခု\n" +
                "          -မတူေသာ ပုဒ္မ်ားကို Both နဲ့ and ၾကားထည့္\n" +
                "          -Conj(စကားဆက္မ်ား)or, and, so, the same, as well as, also, either ၿဖဳတ္\n" +
                "          -too စာေၾကာင္းမွ အၿငင္း(verb)ပါရင္ -->အမ်ားအၿငင္းေၿပာင္း\n" +
                "          -v1 -->do not v1 \n" +
                "          -v2 -->did not v1\n" +
                "          -neither နဲ့ never ပါရင္ အၿငင္း(verb)ေၿပာင္း";
        String Direct_Indirect="1. Imperative\n" +
                "            -said to --> told, asked ေျပာင္း\n" +
                "            -requested(ေတာင္းပန္), pleased, begged, ordered, commanded(အမိန့္ေပး), advised(အျကံေပး), suggested\n" +
                "            -please ပါရင္ျဖဳတ္ \n" +
                "            -verb(1) --> to + V1\n" +
                "            -Don't --> not to ေျပာင္း\n" +
                "\n" +
                "2. Question with helping verb\n" +
                "            -said to --> asked ေျပာင္း\n" +
                "            -or not ပာလ်ွင္ whether ထည့္\n" +
                "            -or not မပာလ်ွင္ if/whether ျကိုက္ရာထည့္\n" +
                "            -ေမးခြန္း၀ါက်ကို ရိုးရိုး၀ါက်ေျပာင္း (?)ျဖဳတ္ \n" +
                "\n" +
                "3. Question with (W.H)\n" +
                "            -said to --> asked ေျပာင္း\n" +
                "            -ေပးထားေသာ W.H ျပန္ထည့္\n" +
                "            -ေမးခြန္း၀ါက်ကို ရိုးရိုး၀ါက်ေျပာင္း (?)ျဖဳတ္ \n" +
                "            \n" +
                "            * Notes\n" +
                "            I --> ေျပာသူကိုျကည့္ said ရဲ့ေရွ႕မွာရွိ <br>\n" +
                "            I | me | my \n" +
                "            he  | him| his \n" +
                "            she| her | her \n" +
                "            You --> နားေထာင္သူကိုျကည့္ said ရဲ့ေနာက္မွာရွိ";
        String Either_or="             -Verb အနည္းကိုသုံးပါ။\n" +
                "             -ၿဖစ္လ်ွင္ေနာက္မွာ Pronoun နွင့္ Verb ကိုက္ညီရမည္။\n" +
                "             -if ျဖဳတ္ျပီး either--or နွင့္ဆက္လ်ွင္ does/does not ျဖဳတ္ပါ။ ";
        String If_Unless=" 1.Type(A)\n" +
                "    -if  sentence တြင္ not ပါလ်ွင္ ျဖဳတ္\n" +
                "    -will စာ ေျကာင္း မေျပာင္းရ\n" +
                "____________________________________________\n" +
                "2.Unless---->if\n" +
                "    -unless ေနရာ if အစားထိုး V ကို အျငင္းေျပာင္း";
        String It_is_It_was="             -၀ါက်ကို It is/ was ၿဖင့္စၿပီး Noun or Noun စကားစုကို ကူးပါ။\n" +
                "             -Noun သည္ လူၿဖစ္လ်ွင္ who\n" +
                "             -လူမဟုတ္လ်ွင္ that (သို့) which ထည့္ၿပီး၀ါက်မွက်န္စာလုံးအားလုံးကူးပါ။\n" +
                "           ";
        String Neither_Nor="               -not/ no/ never ျဖဳတ္ပါ။\n" +
                "               -not/ no/ never မပါလ်ွင္ adj ကို ဆန့္က်င္ဘက္ေျပာင္းပါ။\n" +
                "               -verb ကိုအနည္းကိန္းျပင္ပါ။";
        String No_sooner_than="       -had ကိုေရွ့ထုတ္ just ကိုျဖဳတ္\n" +
                "       -when ေနရာ than ထည့္    \n" +
                "       -had ကိုေရွ႕ထုတ္ comma ေနရာ than ထားပါ။\n" +
                "       -as soon as မွာ V2 ပါ။\n" +
                "       -No sooner မွာ did ကပ္ပါ။\n" +
                "       -V2 ေနရာ V1 သြား\n" +
                "       -comma ေနရာ than ကို ထားပါ။";
        String Not_only_But_also="        -မတူ(၂)ခု\n" +
                "        -တူ(၁)ခု\n" +
                "        -subj နဲ့ verb ညီေအာင္ျပဳ\n" +
                "        -စာေၾကာင္းမွ မတူေသာပုဒ္မ်ားကိုရွာပါ။\n" +
                "        -တူေသာပုဒ္ကို (၁)ခုသာယူပါ။\n" +
                "        -မတူေသာ ပုဒ္မ်ားကို not only နဲ့ but also ၾကားဆက္ပါ။\n" +
                "        -စာေၾကာင္းမွ neither/never ပာရင္(verb)ကိုအျငင္းေျပာင္းပါ။\n" +
                "        -v1 အနည္း -->does not v1\n" +
                "        -v1 အမ်ား -->do not v1\n" +
                "        -v2  -->did not v1\n" +
                "        -ျငင္းစရာ(verb)မပါရင္ -->adj ကို ဆန့္က်င္ဘက္ေျပာင္းပါ။";
        String Parallel_structure="               -if, when, but, and, so, or, as စေသာ conjuction ျဖဳတ္\n" +
                "               -Noun ႏွင့္တြဲေနေသာ verb to be ကိုျဖဳတ္\n" +
                "               -Pronoun နွင့္တြဲေနေသာ verb to be ကိုမျဖဳတ္ရ\n" +
                "               -adj ကို comparative ေၿပာင္း\n" +
                "               -comparative (၂)လုံးပါလ်ွင္(၁) လုံးျဖဳတ္\n" +
                "               -not/little --> less ေၿပာင္း\n" +
                "               -very ပါလ်ွင္ျဖဳတ္\n" +
                "               -much/many -->more ေၿပာင္း\n" +
                "               -much/many/more ေနာက္မွ Noun ပာရင္ --> the more + Noun လို့ေရး";
        String Relative_clause="             -အထူးျပဳလိုေသာပုဒ္ကို It is/It was ၿဖင့္တပ္ေရးပါ။\n" +
                "             -လူ -->who, လူမဟုတ္ -->that ခံေပးပါ။\n" +
                "             -က်န္အပိုင္းမ်ား who/that ေနာက္ၿပန္ထည့္       ";
        String So_that_Such_that="         -such ေနရာ so ထည့္\n" +
                "         -a/an ျဖဳတ္\n" +
                "         -adj ေနာက္ noun ျဖဳတ္ (subjေနရာသို႔ေရႊ႕)\n" +
                "         -that ေနာက္၀ါက်မေျပာင္းရ                \n" +
                "_________________________________________________\n" +
                "         -so ေနရာsuch ထည့္\n" +
                "         -adj ေရွ့မွာ a/ an ထည့္\n" +
                "         -uncountable noun ဆို a/an မထည့္ရ\n" +
                "         -adj ေနာက္ noun ထည့္ ( so _ that စာေၾကာင္းရ့ဲsubj က noun)\n" +
                "         -that ေနာက္၀ါမေျပာင္းရ\n" +
                "         -very  ပါရင္ျဖဳတ္ (very= so)     \n" +
                "         -a.So..that ===> Too...to\n" +
                "        -so + adj ==> to + adj\n" +
                "        -that sub ၿဖဳတ္\n" +
                "        -cannot/could not ေနရာ to ထည့္";
        String When_By_the_time="-when= by the time သည္ same meaning ၿဖစ္သည့္အတြက္ အစားထိုးသုံးနိိုင္ပါသည္";
        String Too_to_Not_enough_to="     -is/are ==> is/are not ေျပာင္း\n" +
                "     -too ျဖဳတ္ပါ။\n" +
                "     -adj ကို ဆန့္က်င္ဘက္ေျပာင္းပါ။\n" +
                "     -adj ေနာက္က enough ထည့္ပါ။\n" +
                "\n" +
                "Not enough to====>Too....to\n" +
                "       -is/ are not ==> is/ are ေၿပာင္း \n" +
                "       -too ထည့္\n" +
                "       -adj ကိုဆန့္္က်င္ဘက္ေၿပာင္း\n" +
                "       -enough ျဖဳတ္";
        String Too_to_So_that="          -Too + adj ကို so+ adj + that လို႔ ေရး\n" +
                "          -to + V1 အစား subj + cannot/ could not + V1ေရး\n" +
                "          -ေရွ႕စာေျကာင္း V1---> cannot\n" +
                "          -ေရွ႕စာေျကာင္း V2---> could not\n" +
                " __________________________________________________\n" +
                "         so that......Too to\n" +
                "             -so + adj---> to + adj \n" +
                "             -that subj ျဖဳတ္\n" +
                "             -cannot/ could not ေနရာ to ထည့္";
        String When_V_ing="1.type(A)\n" +
                "            -စာေၾကာင္းဆက္စာလုံး When နွင့္ေနာက္မွျပဳလုပ္သူျဖဳတ္ပါ။\n" +
                "            -verb ကို ing ေၿပာင္း\n" +
                "            -နာမ္စားေနရာတြင္ ျဖဳတ္လိုက္ေသာနာမ္အစားထိုးပါ။\n" +
                "          \n" +
                "2.Type(B) \n" +
                "            -helping verb သည္ v to be ၿဖစ္လ်ွင္မျဖဳတ္ရ being ေၿပာင္း\n" +
                "                  \n" +
                "3.Type(C) \n" +
                "            -Nobody/No one ပါလ်ွင္ျဖဳတ္\n" +
                "             -verb ကို -->without being + v3 ေၿပာင္း\n" +
                "             -ဒု၀ါက်မွ Obj ျဖဳတ္";
        String Now_in_apposition="             -တူေသာ Noun/ pronoun ရွာ\n" +
                "             -ဒုတိယ Noun/ pronoun ျဖဳတ္\n" +
                "             -ဒုတိယ Noun ေနာက္က v to be ကိုျဖဳတ္\n" +
                "             -၄င္း v to be ေနာက္ကစာေၾကာင္းကို ပထမ Noun ေနာက္မွာ comma ခံဆက္\n" +
                "             -v to be ၂ခုပါလ်ွင္ Noun နွင့္တြဲေနေသာ v to be ကိုျဖဳတ္\n" +
                "             -ving, v3, adj, preposition Phrase နွင့္တြဲေသာ v to be ကိုမျဖဳတ္ရ\n" +
                "            ";

        expandableListDetail.put("Active.....Passive", Collections.singletonList(Active_Passive));
        expandableListDetail.put("After", Collections.singletonList(After));
        expandableListDetail.put("Although.....In spite Of", Collections.singletonList(Although_In_spite_Of));
        expandableListDetail.put("Both.....and", Collections.singletonList(Both_and));
        expandableListDetail.put("Direct.....Indirect", Collections.singletonList(Direct_Indirect));
        expandableListDetail.put("Either.....or", Collections.singletonList(Either_or));
        expandableListDetail.put("If.....Unless", Collections.singletonList(If_Unless));
        expandableListDetail.put("It is.....It was", Collections.singletonList(It_is_It_was));
        expandableListDetail.put("Neither......Nor", Collections.singletonList(Neither_Nor));
        expandableListDetail.put("No sooner.....than", Collections.singletonList(No_sooner_than));
        expandableListDetail.put("Not only.....But also", Collections.singletonList(Not_only_But_also));
        expandableListDetail.put("Parallel structure", Collections.singletonList(Parallel_structure));
        expandableListDetail.put("Relative clause", Collections.singletonList(Relative_clause));
        expandableListDetail.put("So that.....Such that", Collections.singletonList(So_that_Such_that));
        expandableListDetail.put("When.....By the time", Collections.singletonList(When_By_the_time));
        expandableListDetail.put("Too to.....Not enough to", Collections.singletonList(Too_to_Not_enough_to));
        expandableListDetail.put("Too to.....So that", Collections.singletonList(Too_to_So_that));
        expandableListDetail.put("When.....V-ing", Collections.singletonList(When_V_ing));
        expandableListDetail.put("Now in apposition", Collections.singletonList(Now_in_apposition));
        return expandableListDetail;
    }
}