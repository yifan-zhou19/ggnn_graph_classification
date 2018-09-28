package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int t = 0;
		int l;
		int l1;
		int e = 0;
		int m;
		int n;
		l = a.length();
		l1 = a.length();
		if (a.length() != b.length())
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		int i = 0;
		int j = 0;
		while (t != l1)
		{
			for (i = 0;i < l;i++)
			{
				for (j = 0;j < l;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						e = 1;
						break;
					}
				}
				if (e == 1)
				{
					break;
				}
			}
			if (e == 1)
			{
			for (m = i;m < l;m++)
			{
				a = tangible.StringFunctions.changeCharacter(a, m, a.charAt(m + 1));
			}
			for (n = j;n < l;n++)
			{
				b = tangible.StringFunctions.changeCharacter(b, n, b.charAt(n + 1));
			}
			l--;
			}
			t++;
			e = 0;
		}
		if (l == 0)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else if (l != 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}
}

