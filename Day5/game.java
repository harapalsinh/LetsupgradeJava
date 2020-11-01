package Day5;

public class game {
	
	question[] questions=new question[2];
    player player=new player();

    String[] questionsdata={"Who is the president of india?","Largest district in india is ..."};
    String[] options1={"Narendra Modi","Ladakh"};
    String[] options2={"Rajnathsingh","Kutch"};
    String[] options3={"Ramnath kovind","Jaipur"};
    String[] options4={"Vaikaiya Naydu","Mirzapur"};
    int[] answers={3,2};


    public void InitGame()
    {
//        created three objects
        for(int i=0;i<2;i++){
            questions[i]=new question();
        }
        

        for(int i=0;i<2;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].CorrectAnswer=answers[i];
        }


    }
    public void play()
    {

          player.GetDetails();
          for(int i=0;i<2;i++)
          { 
              boolean result=questions[i].askQuestion();
              if(result==true)
              {
                  System.out.println("Right Answer !!!");
                  player.score=player.score+1;
              }
              else{
                  System.out.println("Wrong Answer.. Better luck next time");
                  player.score=player.score-1;
              }
          }

        System.out.println("Hello "+player.Name+", your score is "+player.score);

    }

}
