package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int e;
		int min;
		int max;
		int m;
		int[] all = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n];
		for (i = 0;i < n;i++)
		{
			m = 2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			sz[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * m);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
			for (j = sz[i][0] * 2;j <= sz[i][1] * 2;j++)
			{
				all[j] = 1;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (sz[i][0] < sz[i + 1][0])
			{
				e = sz[i][0];
				sz[i][0] = sz[i + 1][0];
				sz[i + 1][0] = e;
			}
			min = sz[n - 1][0];
		}
		for (i = 0;i < n - 1;i++)
		{
			if (sz[i][1] > sz[i + 1][1])
			{
				e = sz[i][1];
				sz[i][1] = sz[i + 1][1];
				sz[i + 1][1] = e;
			}
			max = sz[n - 1][1];
		}
		for (i = min * 2;i <= max * 2;i++)
		{
			if (all[i] == 0)
			{
				break;
			}
		}
		if (i != max * 2 + 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}
}

