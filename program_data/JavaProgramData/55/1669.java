package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a = 0;
	int b = 0;
	int length = 0;
	long dec = 0;
	String origin = new String(new char[100]); //???char origin?a???~int temp?a???~dec?????~int answer?b???~char final?b???
	String final = new String(new char[100]);
	int[] temp = new int[100];
	int[] answer = new int[100];
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	origin = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	length = origin.length();

	for (int i = length - 1;i >= 0;i--) //char origin?a???~int temp?a???
	{
	  if (origin.charAt(i) >= 'a' && origin.charAt(i) <= 'z')
	  {
				temp[i] = origin.charAt(i) - 87;
	  }
	  else if (origin.charAt(i) >= 'A' && origin.charAt(i) <= 'Z')
	  {
		   temp[i] = origin.charAt(i) - 55;
	  }
	  else
	  {
	   temp[i] = origin.charAt(i) - 48;
	  }
	}





	for (int i = length - 1;i >= 0;i--) //int temp?a???~dec?????
	{

	 dec = dec + temp[i] * Math.pow((double)a,(length - i - 1));

	}
	//cout<<dec;

	int j = 0;
	   while ((dec / b) != 0) //dec?????~int answer?b????????
	   {
			answer[j] = dec % b;
	   dec = dec / b;
	j++;
	   }
	   answer[j] = dec % b;

	  for (int k = j;k >= 0;k--) //int answer?b???~char final?b??????????
	  {
		  if (answer[k] >= 10 && answer[k] <= 35)
		  {
	 final = tangible.StringFunctions.changeCharacter(final, k, (char)(answer[k] + 55));
	 System.out.print(final.charAt(k));
		  }
	 else
	 {
	 System.out.print(answer[k]);
	 }

	  }




	}


}

