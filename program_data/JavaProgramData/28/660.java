package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String word = new String(new char[300]);
		int i;
		int n;
		int j = 0;
		int m;
		int k;
		int ch;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i <= n;i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
			   word = tangible.StringFunctions.changeCharacter(word, j, s.charAt(i));
			   j++;
			   word = tangible.StringFunctions.changeCharacter(word, j, '\0');
			}
			else if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
			{
			   ch = word.length();
			   System.out.printf("%d,",ch);
			   j = 0;
			   for (k = 0;k < 100;k++)
			   {
				 word = tangible.StringFunctions.changeCharacter(word, k, '\0');
			   }
			}
			else if (s.charAt(i) == '\0')
			{
			   ch = word.length();
			   System.out.printf("%d",ch);
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		return 0;
	}

}

