package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int[][] m = new int[25][2];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i][0] = Integer.parseInt(tempVar2);
			}
		}
		void deal(int,int x[][2]);
		deal(k, m);
		for (i = 0;i < k;i++)
		{
			if (m[i][1] > max)
			{
				max = m[i][1];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
	public static void deal(int k, int[][] m)
	{
		int i;
		int j;
		int max;
		for (i = 0;i < k;i++)
		{
			max = 0;
			for (j = 0;j < i;j++)
			{
				if (m[j][0] >= m[i][0] != 0 && m[j][1] > max)
				{
					max = m[j][1];
				}
			}
			m[i][1] = max + 1;
		}
	}

}

