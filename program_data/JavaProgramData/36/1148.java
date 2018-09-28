package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int i;
		int j;
		int m;
		int n;
		m = a.length();
		n = b.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		if (m == n && m == 1)
		{
		if (a.charAt(0) == b.charAt(0))
		{
			System.out.print("YES");
		}
		if (a.charAt(0) != b.charAt(0))
		{
			System.out.print("NO");
		}
		}
		if (m == n && m > 1)
		{
		for (j = m - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (a.charAt(i) > a.charAt(i + 1))
				{
				c = a.charAt(i);
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
				a = tangible.StringFunctions.changeCharacter(a, i + 1, c);
				}
			}
		}
		for (j = n - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (b.charAt(i) > b.charAt(i + 1))
				{
				c = b.charAt(i);
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
				b = tangible.StringFunctions.changeCharacter(b, i + 1, c);
				}
			}
		}
		m = strcmp(a,b);
		if (m == 0)
		{
			System.out.print("YES");
		}
		if (m == 1)
		{
			System.out.print("NO");
		}
		}
		return 0;
	}

}

