package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int len;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  for (i = 0;i < n;i++)
		  {
			  final String letter = "";
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  letter = tempVar2.charAt(0);
			  }
			  len = letter.length();
			  if (letter.charAt(len - 2) == 'e' || letter.charAt(len - 2) == 'l')
			  {
				  letter = tangible.StringFunctions.changeCharacter(letter, len - 2, '\0');
			  }
			  if (letter.charAt(len - 2) == 'n')
			  {
				  letter = tangible.StringFunctions.changeCharacter(letter, len - 3, '\0');
			  }
			  System.out.printf("%s\n",letter);
		  }
	}



}

