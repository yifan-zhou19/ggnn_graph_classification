package <missing>;

public class GlobalMembers
{
	public static void jud(String a, String b)
	{
		int i;
		int[][] c = new int[2][52];
		int m = 0;
		for (i = 0; !a[i].equals(0);i++)
		{
			if (a[i].compareTo(91) < 0)
			{
				c[0][a[i] - 65]++;
			}
			else
			{
				c[0][a[i] - 71]++;
			}
		}
		for (i = 0; !b[i].equals(0);i++)
		{
			if (b[i].compareTo(91) < 0)
			{
				c[1][b[i] - 65]++;
			}
			else
			{
				c[1][b[i] - 71]++;
			}
		}
		for (i = 0;i < 52;i++)
		{
			if (c[0][i] != c[1][i])
			{
				m++;
			}
		}
		if (m == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
	public static int Main()
	{
		String a = new String(new char[30]);
		String b = new String(new char[30]);
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
		jud(a, b);
	}
}

