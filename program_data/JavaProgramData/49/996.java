package <missing>;

public class GlobalMembers
{
	public static void f(String s, int m)
	{
		String s1 = new String(new char[502]);
		int i;
		int k = 0;
		m = s.length();
		for (i = 0;i < m;i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, m - 1 - i, s[i]);
		}
		for (i = 0;i < m;i++)
		{
			if (s[i].equals(s1.charAt(i)))
			{
				k++;
			}
			else
			{
				break;
			}
		}
		if (k == m)
		{
			System.out.printf("%s\n",s);
		}
	}
	public static int Main()
	{
	   String s = new String(new char[502]);
	   String str = new String(new char[502]);
	   int n;
	   int i;
	   int j;
	   int k;
	   s = new Scanner(System.in).nextLine();
	   n = s.length();
	   for (i = 2;i <= n;i++)
	   {
		   for (j = 0;j <= n - i;j++)
		   {
			   for (k = 0;k < i;k++)
			   {
				   str = tangible.StringFunctions.changeCharacter(str, k, s.charAt(j + k));
			   }
			   str = tangible.StringFunctions.changeCharacter(str, i, '\0');
			   f(str, i);
		   }
	   }
	   return 0;
	}

}

