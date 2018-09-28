package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		final String re = "";
		char n;
		char i = 0;
		char l1 = 0;
		char k = 0;
		char l2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		while (scanf("%s\n%s",a,b) != EOF)
		{
			l1 = a.length();
			l2 = b.length();
				k = l1 - l2;
			for (i = l1 - 1;i >= k;i--)
			{
				if (a.charAt(i) >= b.charAt(i - k))
				{
					re = tangible.StringFunctions.changeCharacter(re, i, a.charAt(i) - b.charAt(i - k) + '0');
				}
				else
				{
					re = tangible.StringFunctions.changeCharacter(re, i, a.charAt(i) + 10 - b.charAt(i - k) + '0');
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
				}

			}
					  for (i = k - 1;i >= 0;i--)
					  {
						re = tangible.StringFunctions.changeCharacter(re, i, a.charAt(i));
					  }

			   System.out.printf("%s\n",re);

					 for (i = 0;i < 100;i++)
					 {
					   a = tangible.StringFunctions.changeCharacter(a, i, '\0');
					   b = tangible.StringFunctions.changeCharacter(b, i, '\0');
					   re = tangible.StringFunctions.changeCharacter(re, i, '\0');
					 }




		}





	}



}

