package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[][] x = new int[2][52];

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

		for (i = 0;i < (int)a.length();i++)
		{
			if (a.charAt(i) > 90)
			{
				x[0][a.charAt(i) - 97]++;
			}
			else
			{
				x[0][a.charAt(i) - 39]++;
			}
		}
		for (i = 0;i < (int)b.length();i++)
		{
			if (b.charAt(i) > 90)
			{
				x[1][b.charAt(i) - 97]++;
			}
			else
			{
				x[1][b.charAt(i) - 39]++;
			}
		}

		int u = 0;
		for (i = 0;i < 52;i++)
		{
			if (x[0][i] != x[1][i])
			{
				u = 1;
				break;
			}
		}
		if (u == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}


}

