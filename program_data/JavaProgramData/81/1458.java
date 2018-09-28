package <missing>;

public class GlobalMembers
{
	//??????????????????
	public static int Main()
	{
		int panduan = new int(int sz[][5],int n,int m);
		int[][] sz = new int[5][5];
		int n;
		int m;
		int i;
		int k;
		for (i = 0;i < 5;i++)
		{ //?????????
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][k] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (panduan(sz, n, m) != 0)
		{ //????????????
			for (i = 0;i < 5;i++)
			{
				for (k = 0;k < 4;k++)
				{
					System.out.printf("%d ",sz[i][k]);
				}
				System.out.printf("%d\n",sz[i][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
	//??????????????????
	public static int panduan(int[][] sz, int n, int m)
	{
		int result;
		int[] zhong = new int[5];
		int i;
		if ((n < 5 && n >= 0) && (m < 5 && m >= 0))
		{
			for (i = 0;i < 5;i++)
			{ //?????n?m??????
				zhong[i] = sz[m][i];
				sz[m][i] = sz[n][i];
				sz[n][i] = zhong[i];
			}
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
}

