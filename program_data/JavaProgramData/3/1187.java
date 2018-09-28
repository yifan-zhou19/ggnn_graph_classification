package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int p;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[][] s = new int[2][1000];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(s[0][i]) = Integer.parseInt(tempVar3);
			}
			s[1][i] = k - s[0][i];
		}
		for (i = 0;i < n;i++)
		{
			for (p = 0;p < n;p++)
			{
				if ((s[1][i] == s[0][p]) && (i != p))
				{
					l++;
				}
			}
		}
		if (l == 0)
		{
			System.out.print("no");
		}
		if (l != 0)
		{
			System.out.print("yes");
		}
			return 0;
	}


}

