package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String c = new String(new char[14]);
		int i = 0;
		int j = 0;
		int a;
		int m;
		int n;
		int p;
		int q;
		for (;;)
		{
			a = scanf("%s %s",str,substr);
		 if (a == EOF)
		 {
				break;
		 }
		 else
		 {
			 m = str.length();
		 n = substr.length();
		 p = 0;
		 for (i = 0;i < m;i++)
		 {
				if (str.charAt(i) <= str.charAt(p))
				{
					continue;
				}
			 else
			 {
				 p = i;
			 }
		 }
		 for (q = 0;q < m + n;q++)
		 {
				if (q <= p)
				{
					c = tangible.StringFunctions.changeCharacter(c, q, str.charAt(q));
				}
			 if (q > p && q < p + n + 1)
			 {
					c = tangible.StringFunctions.changeCharacter(c, q, substr.charAt(q - p - 1));
			 }
			 if (q >= p + n + 1)
			 {
					c = tangible.StringFunctions.changeCharacter(c, q, str.charAt(q - n));
			 }
		 }
		 for (q = 0;q < m + n;q++)
		 {
				System.out.printf("%c",c.charAt(q));
		 }
		 System.out.print("\n");
		 }
		}
		return 0;
	}
}

