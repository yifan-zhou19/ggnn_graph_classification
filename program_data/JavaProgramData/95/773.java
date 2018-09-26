package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char flag = '=';
		char i = 0;
		String sen_1 = new String(new char[80]);
		String sen_2 = new String(new char[80]);

		sen_1 = new Scanner(System.in).nextLine();
		sen_2 = new Scanner(System.in).nextLine();

		for (i = 0;i < 80;i++)
		{
		  if (65 <= sen_1.charAt(i) && sen_1.charAt(i) <= 90)
		  {
			sen_1 = tangible.StringFunctions.changeCharacter(sen_1, i, sen_1.charAt(i) + 32);
		  }
		  if (65 <= sen_2.charAt(i) && sen_2.charAt(i) <= 90)
		  {
			sen_2 = tangible.StringFunctions.changeCharacter(sen_2, i, sen_2.charAt(i) + 32);
		  }

		  if (sen_1.charAt(i) == '\0' && sen_2.charAt(i) != '\0')
		  {
		   flag = '<';
		   break;
		  }
		  else if (sen_2.charAt(i) == '\0' && sen_1.charAt(i) != '\0')
		  {
		   flag = '>';
		   break;
		  }
		  else if (sen_1.charAt(i) > sen_2.charAt(i))
		  {
		   flag = '>';
		   break;
		  }
		  else if (sen_1.charAt(i) < sen_2.charAt(i))
		  {
		   flag = '<';
		   break;
		  }
		  else if (sen_1.charAt(i) == '\0' && sen_2.charAt(i) == '\0')
		  {
		  break;
		  }
		}
		System.out.printf("%c",flag);
	}

}

