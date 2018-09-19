package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[20]);
		String s2 = new String(new char[10]);
		String k = new String(new char[20]);
		int i;
		int j;
		int n;
		int m;
		int max;
		while (scanf("%s%s",s1,s2) != EOF)
		{
		  m = s1.length();
		  for (i = 0;i <= m - 1;i++)
		  {
			k = tangible.StringFunctions.changeCharacter(k, i, s1.charAt(i));
		  }
		  for (i = 1;i <= 10;i++)
		  {
			for (j = 0;j <= m - 2;j++)
			{
			  if (k.charAt(j) < k.charAt(j + 1))
			  {
				n = k.charAt(j);
				k = tangible.StringFunctions.changeCharacter(k, j, k.charAt(j + 1));
				k = tangible.StringFunctions.changeCharacter(k, j + 1, n);
			  }
			}
		  }
		  for (i = 0;i <= m - 1;i++)
		  {
			if (s1.charAt(i) == k.charAt(0))
			{
			 max = i;
			 break;
			}
		  }
		  for (i = 0;i <= max;i++)
		  {
			System.out.printf("%c",s1.charAt(i));
		  }
	   for (i = 0;i <= 2;i++)
	   {
		 System.out.printf("%c",s2.charAt(i));
	   }
		  for (i = max + 1;i <= m - 1;i++)
		  {
			System.out.printf("%c",s1.charAt(i));
		  }
	  System.out.print("\n");

		}

	}
}

