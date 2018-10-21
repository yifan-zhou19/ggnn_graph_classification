package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
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
		int k = 1;
		int x = 0;
		int y = 0;
		int m;
		int n;
		m = a.length();
		n = b.length();
		for (i = 0;i < a.length();i++)
		{
			for (j = 0;j < b.length();j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '1');
					k = k * 0;
					break;
				}
			}
			if (k == 0)
			{
				x = x + 1;
			}
			k = 1;
		}
		if (x == m && m == n)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

