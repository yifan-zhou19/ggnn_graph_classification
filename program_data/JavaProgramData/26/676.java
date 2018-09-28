package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String word = new String(new char[100]);
	 String answord = new String(new char[100]);
	  word = new Scanner(System.in).nextLine();
	  int len = word.length();
	  int i = 0;
	  int anslen = 0;
	  answord = tangible.StringFunctions.changeCharacter(answord, 0, word.charAt(0));
	  anslen++;
	  for (i = 1;i < len;i++)
	  {
	   if (word.charAt(i) == ' ' && word.charAt(i - 1) == ' ')
	   {
		continue;
	   }
	   else
	   {
		answord = tangible.StringFunctions.changeCharacter(answord, anslen++, word.charAt(i));
	   }
	  }
	  answord = tangible.StringFunctions.changeCharacter(answord, anslen, '\0');
	  System.out.println(answord);
	  return 0;
	}

}

