package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		char c;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int n = 0;
		int p = 1;
		int w = 0;
		while ((c = System.in.read()) != ' ')
		{
			for (i = 1;i <= n;i++)
			{
				if (c == s.charAt(i))
				{
					a[i]++;
					w = 1;
					break;
				}
			}
			if (w != 0)
			{
				w = 0;
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, ++n, c);
			}
		}
		while ((c = System.in.read()) != '\n')
		{
			for (i = 1;i <= n;i++)
			{
				if (c == s.charAt(i))
				{
					a[i]--;
					break;
				}
			}
			if (i == n + 1)
			{
				p = 0;
				break;
			}
		}
		if (p == 1)
		{
			for (i = 1;i <= n;i++)
			{
				if (a[i] != -1)
				{
					p = 0;
					break;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
	}

}

