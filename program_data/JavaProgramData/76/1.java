package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] s = new int[50000][2];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (s[i][0] > s[j][0])
				{
					k = s[i][0];
					s[i][0] = s[j][0];
					s[j][0] = k;
					k = s[i][1];
					s[i][1] = s[j][1];
					s[j][1] = k;
				}
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i][1] >= s[i + 1][0])
			{
				if (s[i][1] > s[i + 1][1])
				{
					s[i + 1][1] = s[i][1];
				}
			}
			else
			{
				k = 1;
			}
		}
		if (k == 1)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d\n",s[0][0],s[n - 1][1]);
		}
		return 0;
	}
}

