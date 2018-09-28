package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[22][22];
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (s[i][j] > s[i - 1][j] - 1 && s[i][j] > s[i + 1][j] - 1 && s[i][j] > s[i][j + 1] - 1 && s[i][j] > s[i][j - 1] - 1)
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
		return 0;
	}
}

