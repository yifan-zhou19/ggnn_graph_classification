package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int d = 1;
		int i;
		int j;
		int min;
		int max = 0;
		int[] qd = new int[50000];
		int[] zd = new int[50000];
		int[] sz = new int[50000];
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
				qd[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				zd[i] = Integer.parseInt(tempVar3);
			}
		}
		min = qd[0];
		for (i = 0;i < n;i++)
		{
			if (qd[i] < min)
			{
				min = qd[i];
			}
			if (zd[i] > max)
			{
				max = zd[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = qd[i];j < zd[i];j++)
			{
				sz[j] = 1;
			}
		}
		for (i = min;i < max;i++)
		{
			d *= sz[i];
		}
		if (d == 0)
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

