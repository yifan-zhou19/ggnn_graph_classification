package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char[][] ans1 = new char[50][20];
		char[][] ans2 = new char[50][20];
		int e;
		int s;
		int ls;
		int lans1;
		int l;
		int i;
		int lans2;
		str = new Scanner(System.in).nextLine();
		ls = str.length();
		s = 0;
		e = -1;
		lans1 = 0;
		while (s < ls && e < ls)
		{
			l = 0;
			for (s = e+1;str.charAt(s) == ' ' && s < ls;s++)
			{
				;
			}
			for (e = s;str.charAt(e) != ' ' && e < ls;e++)
			{
				;
			}
			for (i = s;i < e;i++)
			{
				ans1[lans1][l++] = str.charAt(i);
			}
			ans1[lans1][l] = 0;
			lans1++;
		}
		s = 0;
		e = -1;
		lans2 = 0;
		while (s < ls && e < ls)
		{
			l = 0;
			for (s = e+1;str.charAt(s) != ' ' && s < ls;s++)
			{
				;
			}
			for (e = s;str.charAt(e) == ' ' && e < ls;e++)
			{
				;
			}
			for (i = s;i < e;i++)
			{
				ans2[lans2][l++] = str.charAt(i);
			}
			ans2[lans2][l] = 0;
			lans2++;
		}
		for (i = lans1 - 1;i >= 0;i--)
		{
			System.out.printf("%s",ans1[i]);
			if (i != 0)
			{
				System.out.printf("%s",ans2[i - 1]);
			}
		}


		return 0;
	}

}
