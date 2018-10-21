package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String x = new String(new char[20]);
		int i;
		int n;
		int a;
		while (scanf("%s %s",str,substr) != EOF)
		{
			n = 0;
		   a = str.length();
		   for (i = 1;i < a;i++)
		   {
			 if (str.charAt(i) > str.charAt(n))
			 {
			 n = i;
			 }
		   }
		   for (i = 0;i < n + 1;i++)
		   {
			 x = tangible.StringFunctions.changeCharacter(x, i, str.charAt(i));
		   }
		   x = tangible.StringFunctions.changeCharacter(x, n + 1, substr.charAt(0));
		   x = tangible.StringFunctions.changeCharacter(x, n + 2, substr.charAt(1));
		   x = tangible.StringFunctions.changeCharacter(x, n + 3, substr.charAt(2));
		   for (i = n + 4;i < a + 4;i++)
		   {
			  x = tangible.StringFunctions.changeCharacter(x, i, str.charAt(i - 3));
		   }
		   for (i = 0;i < a + 3;i++)
		   {
			System.out.printf("%c",x.charAt(i));
		   }
		   System.out.print("\n");
		}
	}

}

