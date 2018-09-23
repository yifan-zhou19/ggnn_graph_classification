package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[15]);
		String str = new String(new char[15]);
		String substr = new String(new char[3]);
		int i = 0;
		int max;
		int n;
		int k;

		for (;;)
		{
			i = 0;
		   if ((a[0] = System.in.read()) == EOF)
		   {
			   System.exit(-1);
		   }
		   a = tangible.StringFunctions.changeCharacter(a, 1, new Scanner(System.in).nextLine());
		   while (a.charAt(i) != ' ')
		   {
			   str = tangible.StringFunctions.changeCharacter(str, i, a.charAt(i));
			   i = i + 1;
		   }
		   str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		   substr = tangible.StringFunctions.changeCharacter(substr, 0, a.charAt(i + 1));
		   substr = tangible.StringFunctions.changeCharacter(substr, 1, a.charAt(i + 2));
		   substr = tangible.StringFunctions.changeCharacter(substr, 2, a.charAt(i + 3));

		   max = 0;
		   n = str.length();
			for (k = 1;k <= n - 1;k++)
			{
				if (str.charAt(k) > str.charAt(max))
				{
					max = k;
				}
			}
			for (k = n - 1;k >= max + 1;k = k - 1)
			{
				str = tangible.StringFunctions.changeCharacter(str, k + 3, str.charAt(k));
			}
			str = tangible.StringFunctions.changeCharacter(str, max + 1, substr.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, max + 2, substr.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, max + 3, substr.charAt(2));
			str = tangible.StringFunctions.changeCharacter(str, n + 3, '\0');
	System.out.printf("%s\n",str);
		}
	}


}

