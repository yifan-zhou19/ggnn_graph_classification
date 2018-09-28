package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n = 0;
	   int i;
	   int k = 0;
	   int p;
	   String s = new String(new char[800]);
	   char[][] word = new char[400][900];
	   s = new Scanner(System.in).nextLine();
		for (i = 0; s.charAt(i) != 0; i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				word[n] = (s.Substring(k));
				n++;
			   k = i + 1;

			}
		}
		word[n] = (s.Substring(k));
		n = n + 1;
		for (i = 0;i < n - 1;i++)
		{
		  p = String.valueOf(word[i]).length();
		  if (p == 0)
		  {
			  continue;
		  }
		  else
		  {
		  System.out.printf("%d,",p);
		  }
		}
		p = String.valueOf(word[n - 1]).length();
		  System.out.printf("%d",p);
		  return 0;

	}
}

