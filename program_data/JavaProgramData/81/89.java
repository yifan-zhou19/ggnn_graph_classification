package <missing>;

public class GlobalMembers
{
	public static int hanshu(int m,int n)
	{
		if (m >= 0 && m < 5 && n >= 0 && n < 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int[][] sz = new int[5][5];
		int[] sz2 = new int[5];
		int hang;
		int lie;
		for (hang = 0;hang < 5;hang++)
		{
			for (lie = 0;lie < 5;lie++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[hang][lie] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		int result = hanshu(m, n);
		if (result == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (lie = 0;lie < 5;lie++)
			{
				sz2[lie] = sz[m][lie];
				sz[m][lie] = sz[n][lie];
				sz[n][lie] = sz2[lie];
			}
			for (hang = 0;hang < 5;hang++)
			{
				System.out.printf("%d %d %d %d %d\n",sz[hang][0],sz[hang][1],sz[hang][2],sz[hang][3],sz[hang][4]);
			}
		}
		return 0;
	}

}

