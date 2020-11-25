package com.cu.grammarlearning.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ExpandableListBasicDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        String Article="                -၀ါက်တြင္ပါေသာ sub, verb, obj မ်ားကိုရွာပါ။\n" +
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
        String Present_Simple="         -လက္ရွိ action ကိုေၿပာရင္ V1 သုံး\n" +
                "        - habitual action ဆိုရင္လည္း V1 သုံး\n" +
                "        -always, usually, generally, often, frequently, rarely,\n" +
                "        seldom, every, day, daily, every week, weekly, every year, \n" +
                "        yearly, once a year, etc ပါရင္ present simple သုံး\n" +
                "       - active ဆိုရင္(V1 or V1(s, es)) ===> passive ဆ္ိုရင္(am,is,are + v3)";
        String Present_Continuous="                   - Near future ဆိုရင္ present continuous သုံး\n" +
                "                   -ေလာ/ေၿပာ/လုပ္ကိုင္ေန ဆိုရင္ present continuous သုံး </li>\n" +
                "                   -look, listen, hurry, be quite, now, at present, at this moment, still, nowadays ပါရင္\n" +
                "                       present continuous သုံး\n" +
                "                   -active ဆိုရင္(am/is/are + ving) ===> passive ဆိုရင္(am/is/are + being + v3)\n" +
                "               \n" +
                "               \n" +
                "               ";
        String Present_Perfect="              - အတိတ္ကေန အခုထိိလုပ္ေနတာ ဆိုရင္ present perfect သုံး \n" +
                "              - already, just, since, for, yet, ever, never, recently, lately ပါရင္\n" +
                "               present perfect သုံး\n" +
                "              -active ဆိုရင္(has/have + v3) ===> passive ဆိုရင္(has/have + being + v3)\n" +
                "               \n" +
                "           \n" +
                "                ";
        String Present_Perfect_Continuous="          -တိတ္/ ခု/ ဆက္ ဆိုရင္ present perfect continuous သုံး\n" +
                "           has/have been + ving";
        String Past_Simple="        - အရင္တုန္းကလုပ္ခဲ့ၿဖစ္ခဲ့တာ၊အခုမလုပ္ေတာ့ မၿဖစ္ေတာ့ဘူးျပီးျပီဆို\n" +
                "         v2 ကိုသုံး\n" +
                "       -yesterday, last month, a year ago, once, once upon a time ပါရင္ v2 သုံးပါ။\n" +
                "       ";
        String Past_Continuous="             -ယခင္အခ်ိန္မွာတုန္းကၿဖစ္ေနဆဲ၊ လုပ္ေနဆဲၿဖစ္ခဲ့\n" +
                "             အခုလုပ္မေန/ ၿဖစ္မေနေတာ့ဘူးဆိုရင္\n" +
                "               was/were + ving သုံး";
        String Past_Perfect="    -အတိတ္ကၿဖစ္ၿပီးဆိုရင္\n" +
                "     had +v3 သုံး";
        String Past_Perfect_Continuous="    -အတိတ္မွာ အၾကာၾကီးလုပ္ခဲ့တဲ့ ၾကာခ်ိန္ကို ေလးနက္ေစခ်င္ရင္\n" +
                "      had + been + ving";
        String Future_Simple="      -အနာဂတ္မွာ ၿဖစ္ပ်က္တာဆိုရင္ model + V1 ကို သုံး\n" +
                "      -Soon, tomorrow, next day, next time, coming Sunday, this afternoon, tomorrow evening future tense ကိုသုံး\n";
        String Future_Continuous="-အနာဂတ္အခ်ိန္ကိုေရာက္ရင္ လုပ္ေနမယ့္  အခ်ိန္ကိုေဖာ္ၿပရင္\n" +
                " Future Continuous Tense သုံး";
        String Future_Perfect="-တိတ္/ခု/ဆက္ဆိုရင္\n" +
                " အနာဂတ္ကို  ေဖာ္ၿပတဲ့အခ်ိန္ရာက္ရင္လုပ္ၿပီးၿပီဆိုရင္ <br> will + have + v3 သုံး\n" +
                "                   ";
        String Future_Perfect_Continuous="-အတိိတ္ကေနစခဲ့ အနာဂတ္ထိလုပ္ၿပီး လုပ္ဆဲၿဖစ္ေနရင္\n" +
                "  shall have been +ving သုံး";

        expandableListDetail.put("Article", Collections.singletonList(Article));
        expandableListDetail.put("Present Simple", Collections.singletonList(Present_Simple));
        expandableListDetail.put("Present Continuous", Collections.singletonList(Present_Continuous));
        expandableListDetail.put("Present Perfect", Collections.singletonList(Present_Perfect));
        expandableListDetail.put("Present Perfect Continuous", Collections.singletonList(Present_Perfect_Continuous));
        expandableListDetail.put("Past Simple", Collections.singletonList(Past_Simple));
        expandableListDetail.put("Past Continuous", Collections.singletonList(Past_Continuous));
        expandableListDetail.put("Past Perfect", Collections.singletonList(Past_Perfect));
        expandableListDetail.put("Past Perfect Continuous", Collections.singletonList(Past_Perfect_Continuous));
        expandableListDetail.put("Future Simple", Collections.singletonList(Future_Simple));
        expandableListDetail.put("Future Continuous", Collections.singletonList(Future_Continuous));
        expandableListDetail.put("Future Perfect", Collections.singletonList(Future_Perfect));
        expandableListDetail.put("Future Perfect Continuous", Collections.singletonList(Future_Perfect_Continuous));
        return expandableListDetail;
    }
}