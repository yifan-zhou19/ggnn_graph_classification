package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		char temp;
		String letter1 = new String(new char[53]);
		String letter2 = new String(new char[53]);
		for (i = 0;i < 52;i++)
		{
			letter1 = tangible.StringFunctions.changeCharacter(letter1, i, 1);
			letter2 = tangible.StringFunctions.changeCharacter(letter2, i, 1);
		}
		letter1 = tangible.StringFunctions.changeCharacter(letter1, 52, '\0');
		letter2 = tangible.StringFunctions.changeCharacter(letter2, 52, '\0');
		while ((temp = System.in.read()) != ' ')
		{
			  if (temp >= 'a' && temp <= 'z')
			  {
				 temp -= 'a';
			  }
			  else
			  {
				  temp -= 'A';
			  }
			  letter1.charAt(temp)++;
		}
		while ((temp = System.in.read()) != '\n')
		{
			  if (temp >= 'a' && temp <= 'z')
			  {
				 temp -= 'a';
			  }
			  else
			  {
				  temp -= 'A';
			  }
			  letter2.charAt(temp)++;
		}
	   if (strcmp(letter1,letter2) == 0)
	   {
		 System.out.print("YES");
	   }
	   else
	   {
		   System.out.print("NO");
	   }
	   return 1;
	}

}

