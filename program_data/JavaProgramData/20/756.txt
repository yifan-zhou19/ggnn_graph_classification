package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		//freopen("D:/input.txt","r",stdin);
		//freopen("D:/output.txt","w",stdout);
		int n;
		int i;
		int m;
		String a = new String(new char[14]);
		String b = new String(new char[4]);
		String a1 = new String(new char[14]);
		char t;
		while (scanf("%s%s",a,b) != EOF)
		{
			n = a.length();
			m = 0;
			t = a.charAt(0);
			for (i = 1;i <= n - 1;i++)
			{
				if (a.charAt(i) > t)
				{
					m = i;
					t = a.charAt(i);
				}
			}
			for (i = m + 1;i <= n - 1;i++)
			{
				a1 = tangible.StringFunctions.changeCharacter(a1, i + 3, a.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, m + 1, b.charAt(0));
			a = tangible.StringFunctions.changeCharacter(a, m + 2, b.charAt(1));
			a = tangible.StringFunctions.changeCharacter(a, m + 3, b.charAt(2));
			for (i = m + 4;i <= n + 2;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a1.charAt(i));
			}
			a = a.substring(0, n + 3);
			System.out.printf("%s\n",a);
		}
	}
}

