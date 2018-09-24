package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int i;
		int j;
		int m;
		int n;
		int h;
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
		h = 0;
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					h++;
					a = a.substring(0, i);
					b = b.substring(0, j);
					break;
				}
			}
		}
		if (h == m)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		}
		return 0;

	}

}

