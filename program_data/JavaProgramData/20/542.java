package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String a = new String(new char[11]);

		int j;
		int k;
		int i;
		int n;
		int m;


		while (scanf("%s%s",str,substr) != EOF)
		{
		n = str.length();
			 m = substr.length();
				 for (j = 0;j < n;j++)
				 {
		   a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(j));
				 }

			for (k = 1;k < n;k++)
			{
				   if (a.charAt(0) < a.charAt(k))
				   {
					 a = tangible.StringFunctions.changeCharacter(a, 0, a.charAt(k));
				   }
			}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%c",str.charAt(j));
			if (str.charAt(j) == a.charAt(0))
			{
				break;
			}
		}
		for (k = 0;k < m;k++)
		{
			System.out.printf("%c",substr.charAt(k));
		}
		for (i = (j + 1);i < n;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
			 System.out.print("\n");
		}
	}

}

