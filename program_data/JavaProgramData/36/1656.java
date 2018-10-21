package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch1 = new String(new char[205]);
		String ch2 = new String(new char[205]);
		String ch = new String(new char[205]);
		int i;
		int k = 0;
		int m;
		int n;
		int j;
		int a;
		int b = 0;
		int c = 0;
		ch = new Scanner(System.in).nextLine();
		m = ch.length();
		n = m / 2;
		for (i = 0;i < n;i++)
		{
			ch1 = tangible.StringFunctions.changeCharacter(ch1, i, ch.charAt(i));
		}
		for (i = n + 1;i < m;i++)
		{
			ch2 = tangible.StringFunctions.changeCharacter(ch2, k, ch.charAt(i));
			k++;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (ch1.charAt(i) < ch1.charAt(j))
				{
					a = ch1.charAt(i);
					ch1 = tangible.StringFunctions.changeCharacter(ch1, i, ch1.charAt(j));
					ch1 = tangible.StringFunctions.changeCharacter(ch1, j, a);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (ch2.charAt(i) < ch2.charAt(j))
				{
					a = ch2.charAt(i);
					ch2 = tangible.StringFunctions.changeCharacter(ch2, i, ch2.charAt(j));
					ch2 = tangible.StringFunctions.changeCharacter(ch2, j, a);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (ch1.charAt(i) == ch2.charAt(i))
			{
				b++;
			}
			else
			{
				c++;
			}
		}
		if (b == n)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}
}

