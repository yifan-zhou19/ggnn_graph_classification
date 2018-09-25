package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int max;
		int[] ss = new int[100];
		int[] sz = new int[100];
		int[] time = new int[100];
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
				ss[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		t = 0;
		for (i = 0;i < n;i++)
		{
			if (ss[i] >= 90 && ss[i] <= 140 && sz[i] <= 90 && sz[i] >= 60)
			{
				t++;
				time[i] = t;
			}
			else
			{
				t = 0;
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (max < time[i])
			{
				max = time[i];
			}
		}
		System.out.printf("%d",max);
		return 0;

	}

}

