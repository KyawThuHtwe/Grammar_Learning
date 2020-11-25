package com.cu.grammarlearning.Model;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ExpandableListIntermediateDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        String Countable_Uncountable_Noun="-ေရတြက္လို႔ရတဲ့ noun ဆိုရင္ many ကိုသုံး (example-money)\n" +
                "\t      -ေရတြက္လို႔မရတဲ့ noun ဆိုရင္  much ကိုသုံး (example-water)\n" +
                "\t      -မရွိသေလာက္နည္းတယ္ဆိုရင္ a few ကိုသုံး\n" +
                "\t      -လုံး၀မရွိဘူးဆိုရင္ few ကိုသုံး\n" +
                "\t      -နည္းနည္းရွိတယ္ဆိုရင္ little ကိုသုံး";
        String Adjective_Ending="- ကို္ယ္ဘာသာ ခံစားရတာဆိုရင္ ed သုံး\n" +
                "          -တစ္ၿခားအရာက ကိုယ့္ကိုခံစားေစတာဆိုရင္ ing သုံး";
        String V_ing_Infinitive="-love, enjoy, adore, feel like, detest, hate, can't stand, dislike, don't mind, avoid, suggest\n" +
                "                       consider, miss, imagine, finish, it's not worth, it's/ there's no use, there's no point\n" +
                "                       ဒီ verb ေတြရဲ့ေနာက္မွာဆိုရင္ ingသုံး\n" +
                "                  \n" +
                "                   -good/bad at, pleased/ worried about, afraid, terrified of, interested in, keen on\n" +
                "                       adj/pro combination ေနာက္မွာ ing သုံး\n" +
                "                   \n" +
                "                   -look forward to, object to, insist on, believe in, succeed in, apologise for, accuse someone of, consist of, congratulate someone on\n" +
                "                       ဒီ verb and preposition ေနာက္မွာ ing သုံး\n" +
                "                   \n" +
                "                   -အခ်ဳိ႕ verb ေတြရဲ့ေနာက္မွာ to သုံးရတယ္ (for eg.agree, hope, promise, ask, want, expect, choose, intend, prefer, help, pretend\n" +
                "                  - after let, had better and would rather တို့ေနာက္မွာ v1 လိုက္တယ္";
        String Unreal_Present_Future="-comma ေရွ့မွာ if + sub + v2 ဆိုရင္ comma ေနာက္မွာ sub + would + v1\n" +
                "            -comma ေရွ့မွာ if + sub +have + v3 ဆိုရင္ comma ေနာက္မွာ sub + would + have+ v3\n" +
                "            -စာေၾကာင္းမွာ it's time/ it's high time/ it's about time ပါရင္\n" +
                "                     it's time/ it's high time/ it's about time +subj + v2 နဲ့ေျဖ\n" +
                "               \n" +
                "            -စာေၾကာင္းမွာ if only/ I wish ပါရင္ if only/ I + wish + subj + v2 နဲ့ေရး\n" +
                "             -စာေၾကာင္းမွာ if only and wish ပါရင္ if only and wish + would +v1 နဲ့ေရး";
        String Phrasal_Verb="-verb နဲ့ preposition အတြဲကို phrasal verb လို႔ေခၚတယ္\n" +
                "          -စာေၾကာင္းမွာ noun obj ပါရင္အဲ့ noun obj ရဲ့အေရွ႕(သုိ့)အေနာက္မွာ adverb particles ကိုထားနိုင္တယ္<br>\n" +
                "               eg.The agency took on extra staff for the summer.\n" +
                "                  The agency took extra staff on for the summer.\n" +
                "             \n" +
                "          -စာေၾကာင္းမွာ pronoun obj ပါခဲ့ရင္အဲ့ pronoun obj ရဲ႕အေနာက္မွာ \n" +
                "                   adverb paticles ထားရမယ္\n" +
                "                   eg.The agency took them <u>on</u> for the summer.\n" +
                "              \n" +
                "         -စာေၾကာင္းမွာ obj မပါရင္ verb နဲ့ adverb particle ကိုမခြဲရဘူး\n" +
                "               eg.We <u>sat up</u> all night when our plane was delayed.";

        expandableListDetail.put("Countable/Uncountable Noun", Collections.singletonList(Countable_Uncountable_Noun));
        expandableListDetail.put("Adjective Ending", Collections.singletonList(Adjective_Ending));
        expandableListDetail.put("V-ing Infinitive", Collections.singletonList(V_ing_Infinitive));
        expandableListDetail.put("Unreal Present Future", Collections.singletonList(Unreal_Present_Future));
        expandableListDetail.put("Phrasal Verb", Collections.singletonList(Phrasal_Verb));
        return expandableListDetail;
    }
}