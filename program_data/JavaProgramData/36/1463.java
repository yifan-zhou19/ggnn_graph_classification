package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch1 = new String(new char[100]);
		String ch2 = new String(new char[100]);
		char temp;
		int l;
		int i;
		int j;


		ch1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		ch2 = ConsoleInput.readToWhiteSpace(true).charAt(0);


		if (ch1.length() == ch2.length())
		{
			   l = ch1.length();
			   for (i = 0;i < l;i++) //????
			   {
				  for (j = 0;j < l - i - 1;j++)
				  {
					  if (ch1.charAt(j) > ch1.charAt(j + 1))
					  {
						  temp = ch1.charAt(j);
						  ch1 = tangible.StringFunctions.changeCharacter(ch1, j, ch1.charAt(j + 1));
						  ch1 = tangible.StringFunctions.changeCharacter(ch1, j + 1, temp);
					  }
					  if (ch2.charAt(j) > ch2.charAt(j + 1))
					  {
						  temp = ch2.charAt(j);
						  ch2 = tangible.StringFunctions.changeCharacter(ch2, j, ch2.charAt(j + 1));
						  ch2 = tangible.StringFunctions.changeCharacter(ch2, j + 1, temp);
					  }
				  }
			   }

				 if (strcmp(ch1,ch2) == 0)
				 {
					System.out.print("YES");
				 }
				 else
				 {
					System.out.print("NO");
				 }
		}
		else
		{
			System.out.print("NO");
		}

		return 0;
	}
}

