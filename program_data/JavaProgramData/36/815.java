package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int m;
		int n;
		int t = 0;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					b = b.substring(0, j);
					a = tangible.StringFunctions.changeCharacter(a, i, 1);
					t++;
					r++;
				}
			}
		}

		if (t == n && r == m)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

