package com.cu.grammarlearning.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class QuizDataPump {
    public static ArrayList<QuizItem> getData(String title) {
        ArrayList<QuizItem> quizItems=new ArrayList<>();

        ArrayList<QuizItem> quizItems1=new ArrayList<>();
        quizItems1.add(new QuizItem("How .....  did they find of gllobal warming.","(i) many evidence","(ii) much evidence","","","(ii) much evidence"));
        quizItems1.add(new QuizItem("Do electric cars produce .....?","(i) many pollution","(ii) much pollution","","","(ii) much pollution"));
        quizItems1.add(new QuizItem("..... enjoy sports which are not competitive.","(i) Many people","(ii) Much people","","","(i) Many people"));
        quizItems1.add(new QuizItem("I haven't heard ..... about recent developments in extreme sports.","(i) many news","(ii) much news","","","(ii) much news"));
        quizItems1.add(new QuizItem("How ..... have we got before the game starts?","(i) much time","(ii) many time","","","(i) much time"));

        ArrayList<QuizItem> quizItems2=new ArrayList<>();
        quizItems2.add(new QuizItem("A ..... book was published recently about the history of Sydney.","(i) fascinating","(ii) fascinated","","","(i) fascinating"));
        quizItems2.add(new QuizItem("Edinburgh is really ---- because a great deal has happened there over the centuries.","(i) interested","(ii) interesting","","","(ii) interesting"));
        quizItems2.add(new QuizItem("Many people are ---- by foreign cities that are very different from ones in their own country.","(i) fascinated","(ii) fascinating","","","(i) fascinated"));
        quizItems2.add(new QuizItem("I was ---- to discover that Sydney has a large Chinese population.","(i) astonished","(ii) astonishing","","","(i) astonished"));
        quizItems2.add(new QuizItem("I'm very ---- in the way that Sydney has developed.","(i) interested","(ii) interesting","","","(i) interested"));

        ArrayList<QuizItem> quizItems3=new ArrayList<>();
        quizItems3.add(new QuizItem("Any change to our climate will mean .... our way of life quite significantly.","(i) to adapt","(ii) adapting","","","(ii) adapting"));
        quizItems3.add(new QuizItem("It is hard ..... that some animals have complex social organisations.","(i) to believe","(ii) believing","","","(i) to believe"));
        quizItems3.add(new QuizItem("Most people understand the importance of ..... friends close by.","(i) to have","(ii) having","","","(ii) having"));
        quizItems3.add(new QuizItem("The tennis coach planned a practice schedule to help the players ..... their skills.","(i) (to) improve","(ii) astonishing","","","(i) (to) improve"));
        quizItems3.add(new QuizItem("The climate is too complex for us .... sure of how our actions affect it.","(i) be","(ii) to be","","","(ii) to be"));

        ArrayList<QuizItem> quizItems4=new ArrayList<>();
        quizItems4.add(new QuizItem("They ---- to Scotland.","(i) have gone","(ii) went","","","(i) have gone"));
        quizItems4.add(new QuizItem("It is hard ..... that some animals have complex social organisations.","(i) to believe","(ii) believing","","","(ii) believing"));
        quizItems4.add(new QuizItem("Most people understand the importance of ..... friends close by.","(i) to have","(ii) having","","","(ii) having"));
        quizItems4.add(new QuizItem("The tennis coach planned a practice schedule to help the players ..... their skills.","(i) (to) improve","(ii) astonishing","","","(i) (to) improve"));
        quizItems4.add(new QuizItem("The climate is too complex for us .... sure of how our actions affect it.","(i) be","(ii) to be","","","(i) be"));

        ArrayList<QuizItem> quizItems5=new ArrayList<>();
        quizItems5.add(new QuizItem("It was hard to see the cruise ship through the fog.(make out)","(i) It was hard to make the cruise ship out through the fog.","","","(ii) It was hard to make out the cruise ship through the fog.","(i) It was hard to make the cruise ship out through the fog."));
        quizItems5.add(new QuizItem("A rival bought the student travel company when it went bankrupt.(take over)","(i) A rival take the student travel company over when it went bankrupt.","(ii) A rival took the student travel company over when it went bankrupt.","","","(ii) A rival took the student travel company over when it went bankrupt."));
        quizItems5.add(new QuizItem("Can I suggest Maria as a suitable replacement for Lisa?(put forward)","(i) Can I put Maria forward as a suitable replacement for Lisa?","(ii) Can I put forward Maria as a suitable replacement for Lisa?","","","(ii) Can I put forward Maria as a suitable replacement for Lisa?"));
        quizItems5.add(new QuizItem("My father started the holiday company in 1967.(set up)","(i) My father set the holiday company up in 1967.","(ii) My father set up the holiday company in 1967.","","","(i) My father set the holiday company up in 1967."));
        quizItems5.add(new QuizItem("We'll have to employ extra staff when it's high season.(take on)","(i) We'll have to take extra staff on when it's high season.","(ii) We'll have to take extra on staff when it's high season.","","","(i) We'll have to take extra staff on when it's high season."));

        ArrayList<QuizItem> quizItems6=new ArrayList<>();
        quizItems6.add(new QuizItem("Smoking is forbidden in the factory.","(i) You mustn't smoke in the factory.","(ii) You have to smoke in the factory.","","","(i) You mustn't smoke in the factory."));
        quizItems6.add(new QuizItem("It's not necessary to leave home early to beat the rush hour now.","(i) You don't have to leave home early to beat the rush hour now.","(ii) You must leave home early to beat the rush hour now.","","","(ii) You must leave home early to beat the rush hour now."));
        quizItems6.add(new QuizItem("The regulations state that the nightshift begins at 9.30.","(i) We have to begin work at 9.30.","(ii) We must begin work at 9.30.","","","(i) We have to begin work at 9.30."));
        quizItems6.add(new QuizItem("I can stay in bed all day tomorrow.","(i) I must have to get up tomorrow.","(ii) I don't have to get up tomorrow.","","","(ii) I don't have to get up tomorrow."));
        quizItems6.add(new QuizItem("When I work nights,I am forced to do my shopping on the Internet.","(i) When I work nights,I have to do my shopping on the Internet.","(ii) When I work nights,I must do my shopping on the Internet.","","","(i) When I work nights,I have to do my shopping on the Internet."));

        ArrayList<QuizItem> quizItems7=new ArrayList<>();
        quizItems7.add(new QuizItem("That housing complex is being constructed by Yuzana Company.","(i) Yuzana Company constructed that housing complex.","(ii) Yuzana Company is constructing that housing complex.","","","(ii) Yuzana Company is constructing that housing complex."));
        quizItems7.add(new QuizItem("Why have they moved my table?","(i) Why has my table been moved?","(ii) Why have my table been moved?","","","(i) Why has my table been moved?"));
        quizItems7.add(new QuizItem("We must show courtesy to our elders.","(i) Courtesy must be shown to our elders.","(ii) Courtesy must be shown to our elders by us.","","","(i) Courtesy must be shown to our elders."));
        quizItems7.add(new QuizItem("You should wash the bathroom every day.","(i) The bathroom should be washed every day.","(ii) The bathroom washed every day.","","","(i) The bathroom should be washed every day."));
        quizItems7.add(new QuizItem("The students arranged the chairs systematically.","(i) The chairs were arranged systematically by the students.","(ii) The chairs were systematically arranged by the students.","","","(ii) The chairs were systematically arranged by the students."));

        ArrayList<QuizItem> quizItems8=new ArrayList<>();
        quizItems8.add(new QuizItem("In spite of being very clever, she is not proud.","(i) Although  she is very proud, she is not clever.","(ii) Although  she is very clever, she is not proud.","","","(ii) Although  she is very clever, she is not proud."));
        quizItems8.add(new QuizItem("Although he drank black coffee, he still felt sleepy.","(i) In spite of drinking black coffee, he still had been sleepy.","(ii) In spite of drinking black coffee, he still felt sleepy.","","","(ii) In spite of drinking black coffee, he still felt sleepy."));
        quizItems8.add(new QuizItem("She went on working although she felt unwell.","(i) In spite of feeling unwell, she went on working.","(ii) In spite of feeling unwell, she was went on working.","","","(ii) In spite of feeling unwell, she was went on working."));
        quizItems8.add(new QuizItem("Although she is fat, she can run quite fast.","(i) In spite of being fat, she can run quite fast.","(ii) In spite of being fat, she cannot run quite fast.","","","(i) In spite of being fat, she can run quite fast."));
        quizItems8.add(new QuizItem("Although Daw Pu is poor, she is very generous.","(i) In spite of being poor, Daw Pu is not very generous.","(ii) In spite of being poor, Daw Pu is very generous.","","","(ii) In spite of being poor, Daw Pu is very generous."));

        ArrayList<QuizItem> quizItems9=new ArrayList<>();
        quizItems9.add(new QuizItem("Not only Mya Mya but also Latt Latt is expert at using the computer.","(i) Both Myat Myat and Latt Latt is expert at using the computer.","(ii) Both Myat Myat and Latt Latt are expert at using the computer.","","","(ii) Both Myat Myat and Latt Latt are expert at using the computer."));
        quizItems9.add(new QuizItem("The philosopher came back empty-handed and so did the medico.","(i) Both the philosopher and the medico had came back empty-handed.","(ii) Both the philosopher and the medico came back empty-handed.","","","(ii) Both the philosopher and the medico came back empty-handed."));
        quizItems9.add(new QuizItem("Soe Soe likes Korean films and so does Toe Toe.","(i) Both Soe Soe and Toe Toe like Korean films.","(ii) Both Soe Soe and Toe Toe likes Korean films.","","","(i) Both Soe Soe and Toe Toe like Korean films."));
        quizItems9.add(new QuizItem("Neither of the sisters is beautiful.","(i) Both of the sisters are not beautiful.","(ii) Both of the sisters is not beautiful.","","","(i) Both of the sisters are not beautiful."));
        quizItems9.add(new QuizItem("Ko Ko does not study hard and neither does Nyi Nyi.","(i) Both Ko Ko and Nyi Nyi does not study hard.","(ii) Both Ko Ko and Nyi Nyi do not study hard.","","","(ii) Both Ko Ko and Nyi Nyi do not study hard."));

        ArrayList<QuizItem> quizItems10=new ArrayList<>();
        quizItems10.add(new QuizItem("Aye Aye said to Nyi Nyi, Why don't you run and fetch the doctor?","(i) Aye Aye asked Nyi Nyi why he do not run and fetch the doctor.","(ii) Aye Aye asked Nyi Nyi why he did not run and fetch the doctor.","","","(ii) Aye Aye asked Nyi Nyi why he did not run and fetch the doctor."));
        quizItems10.add(new QuizItem("Do you find English a difficult language to learn, Nyi Nyi? asked the teacher.","(i) The teacher asked Nyi Nyi if he did found English a difficult language to learn.","(ii) The teacher asked Nyi Nyi if he found English a difficult language to learn.","","","(ii) The teacher asked Nyi Nyi if he found English a difficult language to learn."));
        quizItems10.add(new QuizItem("The man said to U Po, 'Why didn't you tell the truth at the trial?'.","(i) The man asked U Po why he had not told the truth at the trial.","(ii) The man asked U Po why he did not told the truth at the trial.","","","(i) The man asked U Po why he had not told the truth at the trial."));
        quizItems10.add(new QuizItem("Thandar said to her, 'What happened to you?'.","(i) Thandar asked her what had happened to her.","(ii) Thandar asked her what happened to her.","","","(i) Thandar asked her what had happened to her."));
        quizItems10.add(new QuizItem("Nyo Nyo said, 'Tun Tun, I saw your sister near the post'.","(i) Nyo Nyo told Tun Tun that she seen his sister near the post.","(ii) Nyo Nyo told Tun Tun that she had seen his sister near the post.","","","(ii) Nyo Nyo told Tun Tun that she had seen his sister near the post."));

        ArrayList<QuizItem> quizItems11=new ArrayList<>();
        quizItems11.add(new QuizItem("You must search his pockets  if you want to find the watch.","(i) Unless you search his pocket, you will find the watch.","(ii) Unless you search his pocket, you will not find the watch.","","","(ii) Unless you search his pocket, you will not find the watch."));
        quizItems11.add(new QuizItem("Unless he finds a job soon, his family will starve.","(i) If he finds a job soon,his family will starve.","(ii) If he finds a job soon,his family will not starve.","","","(ii) If he finds a job soon,his family will not starve."));
        quizItems11.add(new QuizItem("If I like the necklace, I will buy it.","(i) Unless I like the necklace, I will not buy it.","(ii) If I like the necklace, I will not buy it.","","","(ii) If I like the necklace, I will not buy it."));
        quizItems11.add(new QuizItem("You will not be fit if you don't do physical exercise.","(i) Unless you do physical exercise, you will not be fit.","(ii) Unless you do physical exercise, you will be fit.","","","(i) Unless you do physical exercise, you will not be fit."));
        quizItems11.add(new QuizItem("Unless she behaves well, she will not be allowed to attend the party.","(i) If she behaves well, she will not be allowed to attend the party.","(ii) If she behaves well, she will be allowed to attend the party.","","","(ii) If she behaves well, she will be allowed to attend the party."));

        ArrayList<QuizItem> quizItems12=new ArrayList<>();
        quizItems12.add(new QuizItem("He didn't explain his behavior and he didn't apologize for it.","(i) He didn't neither explained his behavior nor apologized for it.","(ii) He neither explained his behavior nor apologized for it.","","","(ii) He neither explained his behavior nor apologized for it."));
        quizItems12.add(new QuizItem("I haven't got the time to go on a vacation.I also haven't got the money.","(i) I haven't got neither the time nor the money to go on a vacation.","(ii) I have got neither the time nor the money to go on a vacation.","","","(ii) I have got neither the time nor the money to go on a vacation."));
        quizItems12.add(new QuizItem("Moe Kyaw didn't mean to hurt Tun Tun.He didn't mean to hurt Yin Yin.","(i) Moe Kyaw neither mean to hurt Tun Tun nor Yin Yin.","(ii) Moe Kyaw didn't neither mean to hurt Tun Tun nor Yin Yin.","","","(i) Moe Kyaw neither mean to hurt Tun Tun nor Yin Yin."));
        quizItems12.add(new QuizItem("English as well as History is not a science subject.","(i) Neither English nor history is a science subject.","(ii) Neither English nor history were a science subject.","","","(i) Neither English nor history is a science subject."));
        quizItems12.add(new QuizItem("I will never tell the truth about you and I will not lie for you.","(i) I will neither tell the truth about you nor will not lie for you.","(ii) I will neither tell the truth about you nor lie for you.","","","(ii) I will neither tell the truth about you nor lie for you."));

        ArrayList<QuizItem> quizItems13=new ArrayList<>();
        quizItems13.add(new QuizItem("There are problems with the children.There are problems with their parents.","(i) There are problems with not only  the children but also their parents.","(ii) There are problems not only with the children but also with their parents.","","","(ii) There are problems not only with the children but also with their parents."));
        quizItems13.add(new QuizItem("She was upset.She was angry.","(i) She was not only upset but also angry.","(ii) She  not only was upset but also was angry.","","","(i) She was not only upset but also angry."));
        quizItems13.add(new QuizItem("I sent him many letters.I also tried to telephone him.","(i) I not only sent him many letters but also tried to telephone him.","(ii) I not only sent many letters but also tried to telephone him.","","","(i) I not only sent him many letters but also tried to telephone him."));
        quizItems13.add(new QuizItem("She can dance.She can sing.","(i) She can not only dance but also sing.","(ii) She not only can dance but also can sing.","","","(i) She can not only dance but also sing."));
        quizItems13.add(new QuizItem("He has been late four times.He hasn't done any work.","(i) He has not only been late four times but also done any work.","(ii)Not only has he been late four times but he has also not done any work.","","","(ii)Not only has he been late four times but he has also not done any work."));

        ArrayList<QuizItem> quizItems14=new ArrayList<>();
        quizItems14.add(new QuizItem("The movie wasn't very good.We watched it last night.","(i) The  movie which we watched  last night wasn't very good.","(ii) The  movie that we watched  last night wasn't very good.","","","(i) The  movie which we watched  last night wasn't very good."));
        quizItems14.add(new QuizItem("I have lost my watch.I got it from my father as  a birthday present.","(i) I have lost my watch that I got from my father as  a birthday present.","(ii) I have lost my watch which I got from my father as  a birthday present.","","","(ii) I have lost my watch which I got from my father as  a birthday present."));
        quizItems14.add(new QuizItem("Her daughter was injured in a car accident.She is now in hospital.","(i) Her daughter who was injured in a car accident is now in hospital.","(ii) Her daughter which was injured in a car accident is now in hospital.","","","(i) Her daughter who was injured in a car accident is now in hospital."));
        quizItems14.add(new QuizItem("We all like Daw Mu Mu .She is a good teacher.","(i) We all like Daw Mu Mu that is a good teacher.","(ii) We all like Daw Mu Mu who is a good teacher.","","","(ii) We all like Daw Mu Mu who is a good teacher."));
        quizItems14.add(new QuizItem("We all like BoGyoke Aung San.He is a good leader.","(i) We all like BoGyoke Aung San who is a good leader.","(ii) We all like BoGyoke Aung San that is a good leader.","","","(i) We all like BoGyoke Aung San who is a good leader."));

        ArrayList<QuizItem> quizItems15=new ArrayList<>();
        quizItems15.add(new QuizItem("The coffee was so good that I had another cup.","(i) It was a good such coffee that I had another cup.","(ii) It was such a good coffee that I had another cup.","","","(ii) It was such a good coffee that I had another cup."));
        quizItems15.add(new QuizItem("Yesterday was so could that they couldn't go out.","(i) I was such a cold yesterday that they could go out.","(ii) I was such a cold yesterday that they couldn't go out.","","","(ii) I was such a cold yesterday that they couldn't go out."));
        quizItems15.add(new QuizItem("He is such a stringy person that nobody likes him.","(i) He is so stringy that nobody likes him.","(ii) He is so stringy that anybody likes him.","","","(i) He is so stringy that nobody likes him."));
        quizItems15.add(new QuizItem("It was such an interesting film that I saw it twice.","(i) The film was so interesting that I saw it twice.","(ii) The film was so interesting that I didn't see it twice.","","","(i) The film was so interesting that I saw it twice."));
        quizItems15.add(new QuizItem("The gold ring is so small that I cannot wear it.","(i) It is such a small gold ring that I cannot wear it.","(ii) It is such a small gold ring that I can wear it.","","","(i) It is such a small gold ring that I cannot wear it."));

        ArrayList<QuizItem> quizItems16=new ArrayList<>();
        quizItems16.add(new QuizItem("When the children heard the bell,they shouted with joy.","(i) Hearing the bell,they shouted with joy.","(ii) Hearing the bell,the children shouted with joy.","","","(ii) Hearing the bell,the children shouted with joy."));
        quizItems16.add(new QuizItem("When the boys had done their homework,they went out to play.","(i) Having done their homework,the boys went out to play.","(ii) Having done their homework,they went out to play.","","","(i) Having done their homework,the boys went out to play."));
        quizItems16.add(new QuizItem("When I saw the smoke,I tried to the sound the alarm.","(i) Seeing the smoke,I tried to the sound the alarm.","(ii) Seeing the smoke,I try to the sound the alarm.","","","(ii) Seeing the smoke,I try to the sound the alarm."));
        quizItems16.add(new QuizItem("When she was offered a good salary,she accepted the job.","(i) Being offer a good salary,she accepted the job.","(ii) Being offered a good salary,she accepted the job.","","","(ii) Being offered a good salary,she accepted the job."));
        quizItems16.add(new QuizItem("My brother rushed into the kitchen when he arrived home from school.","(i) Arriving home from school,my brother rushed into the kitchen.","(ii) Rushing into the kitchen,my brother arrived home from school.","","","(i) Arriving home from school,my brother rushed into the kitchen."));

        ArrayList<QuizItem> quizItems17=new ArrayList<>();
        quizItems17.add(new QuizItem("They have ---- problems.","the","a","an","-","-"));
        quizItems17.add(new QuizItem("I have ---- computer.","an","a","-","the","a"));
        quizItems17.add(new QuizItem("She has ---- two brothers.","-","the","a","an","-"));
        quizItems17.add(new QuizItem("It is ---- worst scenario.","an","the","-","a","the"));
        quizItems17.add(new QuizItem("Clean ---- room!","a","the","an","-","an"));

        ArrayList<QuizItem> quizItems18=new ArrayList<>();
        quizItems18.add(new QuizItem("He ---- English at school.","(i) study","(ii) studies","(iii) studied","(iv) studdied","(ii) studies"));
        quizItems18.add(new QuizItem("These things ---- seem important.","(i) doesn't be","(ii) doesn't","(iii) don't be","(iv) don't","(iv) don't"));
        quizItems18.add(new QuizItem("---- you agree with me?","(i) Do","(ii) Does","(iii) Did","(iv) Don't","(i) Do"));
        quizItems18.add(new QuizItem("The computer ---- 1000 dollars.","(i) was","(ii) are","(iii) am","(iv) is","(ii) are"));
        quizItems18.add(new QuizItem("---- want to do it again.","(i) doesn't","(ii) don't","(iii) didn't","(iv) did","(ii) don't"));

        ArrayList<QuizItem> quizItems19=new ArrayList<>();
        quizItems19.add(new QuizItem("I ---- my homework.","(i) was done","(ii) was doing","(iii) were doing","(iv) am doing","(iv) am doing"));
        quizItems19.add(new QuizItem("Father ---- the morning news-paper.","(i) was reading","(ii) is reading","(iii) read","(iv) were read","(ii) is reading"));
        quizItems19.add(new QuizItem("I ---- at the moment.","(i) is studying","(ii) was studying","(iii) am studying","(iv) study","(i) is studying"));
        quizItems19.add(new QuizItem("You ---- badminton tonight.","(i) are playing","(ii) is playing","(iii) was playing","(iv) were playing","(ii) is playing"));
        quizItems19.add(new QuizItem("She ---- in japan.","(i) isn't worked","(ii) wasn't worked","(iii) doesn't working","(iv) isn't working","(ii) wasn't worked"));

        ArrayList<QuizItem> quizItems20=new ArrayList<>();
        quizItems20.add(new QuizItem("They ---- to Scotland.","(i) have gone","(ii) went","(iii) go","(iv) had gone","(i) have gone"));
        quizItems20.add(new QuizItem("We ---- the book.","(i) read","(ii) have read","(iii) had read","(iv) to read","(ii) have read"));
        quizItems20.add(new QuizItem("You ---- David for ten years.","(i) know","(ii) known","(iii) have known","(iv) knew","(iii) have known"));
        quizItems20.add(new QuizItem("I ---- my keys.","(i) had lost","(ii) has lost","(iii) lost","(iv) have lost","(iv) have lost"));
        quizItems20.add(new QuizItem("He  ---- too much coffee.","(i) is drink","(ii) are drink","(iii) was drink","(iv) drink","(i) is drink"));

        ArrayList<QuizItem> quizItems21=new ArrayList<>();
        quizItems21.add(new QuizItem("I ---- all day.","(i) have been studied","(ii) has been studying","(iii) have been studying","(iv) had studied","(iv) had studied"));
        quizItems21.add(new QuizItem("We ----- in London for six months.","(i) has been living","(ii) have been living","(iii) have been lived","(iv) had been living","(ii) have been living"));
        quizItems21.add(new QuizItem("He ---- football for five years.","(i) has been played","(ii) had been playing","(iii) have been playing","(iv) has been playing","(iv) has been playing"));
        quizItems21.add(new QuizItem("I ----- in th garden all day and I need a rest.","(i) has been working","(ii) have been worked","(iii) have been working","(iv) had been working","(iii) have been working"));
        quizItems21.add(new QuizItem("They ---- English for two years.","(i) have been learning","(ii) has been learning","(iii) had been learning","(iv) have been learned","(i) have been learning"));

        ArrayList<QuizItem> quizItems22=new ArrayList<>();
        quizItems22.add(new QuizItem("They all ---- shopping.","(i) went","(ii) go","(iii) gone","(iv) going","(i) went"));
        quizItems22.add(new QuizItem("I never ---- I would see you here.","(i) imagine","(ii) imagined","(iii) imaging","(iv) have imagined","(ii) imagined"));
        quizItems22.add(new QuizItem("He ---- his children from school.","(i) collecting","(ii) collected","(iii) collect","(iv) collects","(ii) collected"));
        quizItems22.add(new QuizItem("Were you ---- of the dark when you were young?","(i) frightens","(ii) be frightened","(iii) frighten","(iv) frightened","(iv) frightened"));
        quizItems22.add(new QuizItem("I ---- so tired that I went straight to bed.","(i) felt","(ii) feel","(iii) feels","(iv) feeling","(i) felt"));

        ArrayList<QuizItem> quizItems23=new ArrayList<>();
        quizItems23.add(new QuizItem("Mrs Brown ---- in the garden when the murder happened.","(i) weren't working","(ii) wasn't working","(iii) wasn't worked","(iv) work","(ii) wasn't working"));
        quizItems23.add(new QuizItem("We ---- TV at three o'clock.","(i) watch","(ii) was watching","(iii) were watched","(iv) were watching","(iv) were watching"));
        quizItems23.add(new QuizItem("They ---- at night.","(i) were studying","(ii) were studied","(iii) was studying","(iv) study","(i) were studying"));
        quizItems23.add(new QuizItem("We ---- when the accident happened.(i) frightens","(i) talk","(ii) were talked","(iii) was talking","(iv) were talking","(iv) were talking"));
        quizItems23.add(new QuizItem("I ---- to school when you saw me.","(i) were going","(ii) was going","(iii) go","(iv) goes","(ii) was going"));

        ArrayList<QuizItem> quizItems24=new ArrayList<>();
        quizItems24.add(new QuizItem("The garden was dead because it ---- dry all summer.","(i) has been","(ii) be","(iii) had been","(iv) is","(iii) had been"));
        quizItems24.add(new QuizItem("He ---- her somewhere before.","(i) meet","(ii) had met","(iii) had meet","(iv) has met","(ii) had met"));
        quizItems24.add(new QuizItem("She told me she ---- a lot before the exam.","(i) has studied","(ii) have studied","(iii) had studied","(iv) study","(iii) had studied"));
        quizItems24.add(new QuizItem("The children ---- their homework,so they were in trouble.","(i) not done","(ii) hadn't done","(iii) hadn't done","(iv) hasn't done","(ii) hadn't done"));
        quizItems24.add(new QuizItem("The children collected the chestnuts that ---- from the tree.","(i) had fallen","(ii) has fallen","(iii) have fallen","(iv) had falled","(i) had fallen"));

        ArrayList<QuizItem> quizItems25=new ArrayList<>();
        quizItems25.add(new QuizItem("I ---- all day, so I didn't want to go out.","(i) had worked","(ii) had working","(iii) had been working","(iv) work","(iii) had been working"));
        quizItems25.add(new QuizItem("How long ---- English before she went to London?","(i) had she been learning","(ii) had been learning","(iii) had she  learning","(iv) had learning","(i) had she been learning"));
        quizItems25.add(new QuizItem("Where ---- ?","(i) had you working","(ii) have you working","(iii) had you worked","(iv) had you been working","(iv) had you been working"));
        quizItems25.add(new QuizItem("We ---- out for three years when we got married.","(i) had been going","(ii) had going","(iii) had gone","(iv) went","(i) had been going"));
        quizItems25.add(new QuizItem("We ---- for 12 hours when we woke us up.","(i) had being waiting","(ii) has been waiting","(iii) had been waiting","(iv) have been waiting","(iii) had been waiting"));

        ArrayList<QuizItem> quizItems26=new ArrayList<>();
        quizItems26.add(new QuizItem("You ---- a lot of money.","(i) earn","(ii) will earn","(iii) would earn","(iv) were earned","(ii) will earn"));
        quizItems26.add(new QuizItem("Everything ---- perfect.","(i) will be","(ii) be","(iii) was","(iv) would be","(i) will be"));
        quizItems26.add(new QuizItem("You ---- any problems.","(i) have","(ii) would have","(iii) would not have","(iv) will not have","(iv) will not have"));
        quizItems26.add(new QuizItem("There ---- anything left to wish for.","(i) would not be","(ii) will not be","(iii) be","(iv) wasn't","(ii) will not be"));
        quizItems26.add(new QuizItem("You ---- around the world.","(i) would be travelled","(ii) will be travel","(iii) would travel","(iv) will travel","(iv) will travel"));

        ArrayList<QuizItem> quizItems27=new ArrayList<>();
        quizItems27.add(new QuizItem("At three o'clock tomorrow, I ---- in my office.","(i) will work","(ii) will working","(iii) will be working","(iv) am working","(iii) will be working"));
        quizItems27.add(new QuizItem("When she arrives, I ---- .","(i) won't be reading","(ii) won't read","(iii) won't reading","(iv) an reading","(i) won't be reading"));
        quizItems27.add(new QuizItem("I ---- ,in the morning tomorrow.","(i) will sleep","(ii) will sleeping","(iii) am sleeping","(iv) will be sleeping","(iv) will be sleeping"));
        quizItems27.add(new QuizItem("At midnight we ---- .","(i) will be sleeps","(ii) will be sleeping","(iii) will be sleep","(iv) will sleeping","(ii) will be sleeping"));
        quizItems27.add(new QuizItem("They ---- all night.","(i) will be dancing","(ii) will be dance","(iii) will being dancing","(iv) will be dances","(i) will be dancing"));

        ArrayList<QuizItem> quizItems28=new ArrayList<>();
        quizItems28.add(new QuizItem("---- the report by the deadline?","(i) Will be finished","(ii) Will finish","(iii) Will you have finished","(iv) Will have finished","(iii) Will you have finished"));
        quizItems28.add(new QuizItem("When ---- everything?","(i) will we have done","(ii) will have done","(iii) will we done","(iv) will done","(i) will we have done"));
        quizItems28.add(new QuizItem("We ---- in London for three years next week.","(i) have","(ii) will have","(iii) will been","(iv) will have been","(iv) will have been"));
        quizItems28.add(new QuizItem("---- home by lunch time?","(i) Will have she got","(ii) Will she got","(iii) Will she have got","(iv) Will have got","(iii) Will she have got"));
        quizItems28.add(new QuizItem("They ---- all the questions by 8.00 in the evening.","(i) will have replied","(ii) will has replied","(iii) will have reply","(iv) will had replied","(i) will have replied"));

        ArrayList<QuizItem> quizItems29=new ArrayList<>();
        quizItems29.add(new QuizItem("","","","","",""));
        quizItems29.add(new QuizItem("","","","","",""));
        quizItems29.add(new QuizItem("","","","","",""));
        quizItems29.add(new QuizItem("","","","","",""));
        quizItems29.add(new QuizItem("","","","","",""));

        switch (title){
            case "Countable/Uncountable Noun":
                quizItems=quizItems1;
                break;
            case "Adjective Ending":
                quizItems=quizItems2;
                break;
            case "V-ing Infinitive3":
                quizItems=quizItems3;
                break;
            case "Unreal Present Future":
                quizItems=quizItems4;
                break;
            case "Phrasal Verb":
                quizItems=quizItems5;
                break;
            case "Modal Verb/ Obligation/Lack Of Obligation":
                quizItems=quizItems6;
                break;
            case "Active.....Passive":
                quizItems=quizItems7;
                break;
            case "Although.....In spite Of":
                quizItems=quizItems8;
                break;
            case "Both.....and":
                quizItems=quizItems9;
                break;
            case "Direct.....Indirect":
                quizItems=quizItems10;
                break;
            case "If.....Unless":
                quizItems=quizItems11;
                break;
            case "Neither......Nor":
                quizItems=quizItems12;
                break;
            case "Not only.....But also":
                quizItems=quizItems13;
                break;
            case "Relative clause":
                quizItems=quizItems14;
                break;
            case "So that.....Such that":
                quizItems=quizItems15;
                break;
            case "When.....V-ing":
                quizItems=quizItems16;
                break;
            case "Article":
                quizItems=quizItems17;
                break;
            case "Present Simple":
                quizItems=quizItems18;
                break;
            case "Present Continuous":
                quizItems=quizItems19;
                break;
            case "Present Perfect":
                quizItems=quizItems20;
                break;
            case "Present Perfect Continuous":
                quizItems=quizItems21;
                break;
            case "Past Simple":
                quizItems=quizItems22;
                break;
            case "Past Continuous":
                quizItems=quizItems23;
                break;
            case "Past Perfect":
                quizItems=quizItems24;
                break;
            case "Past Perfect Continuous":
                quizItems=quizItems25;
                break;
            case "Future Simple":
                quizItems=quizItems26;
                break;
            case "Future Continuous":
                quizItems=quizItems27;
                break;
            case "Future Perfect":
                quizItems=quizItems28;
                break;

            case "Quiz":
                quizItems.addAll(quizItems1);
                quizItems.addAll(quizItems2);
                quizItems.addAll(quizItems3);
                quizItems.addAll(quizItems4);
                quizItems.addAll(quizItems5);
                quizItems.addAll(quizItems6);
                quizItems.addAll(quizItems7);
                quizItems.addAll(quizItems8);
                quizItems.addAll(quizItems9);
                quizItems.addAll(quizItems10);
                quizItems.addAll(quizItems11);
                quizItems.addAll(quizItems12);
                quizItems.addAll(quizItems13);
                quizItems.addAll(quizItems14);
                quizItems.addAll(quizItems15);
                quizItems.addAll(quizItems16);
                quizItems.addAll(quizItems17);
                quizItems.addAll(quizItems18);
                quizItems.addAll(quizItems19);
                quizItems.addAll(quizItems20);
                quizItems.addAll(quizItems21);
                quizItems.addAll(quizItems22);
                quizItems.addAll(quizItems23);
                quizItems.addAll(quizItems24);
                quizItems.addAll(quizItems25);
                quizItems.addAll(quizItems26);
                quizItems.addAll(quizItems27);
                quizItems.addAll(quizItems28);
                break;
        }

        return quizItems;
    }
}