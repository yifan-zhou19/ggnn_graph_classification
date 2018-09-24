package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = ""; //???????????
		char c;
		int i = 1;
		while (c = System.in.read()) //????
		{
			 if ((a.charAt(i - 1) == ' ') && (c == ' ')) //??????� �??????????
			 {

				continue;
			 }

			  if (c == '\n') //???????????
			  {
				break;
			  }
			 else
			 {
			   a = tangible.StringFunctions.changeCharacter(a, i, c);
			   i++;
			 }

		}
		for (int i = 1;i < 100;i++) //????????
		{
			 if (a.charAt(i) != '\0')
			 {
				System.out.print(a.charAt(i));
			 }

		}





		return 0;
	}


}

