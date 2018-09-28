package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] start = new int[10000];
		int[] end = new int[10000];
		int e;
		int f;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				start[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				end[i] = Integer.parseInt(tempVar3);
			}
		}
		int max = end[0];
		for (int i = 1;i < n;i++)
		{
			if (end[i] > max)
			{
				max = end[i];
			}
		}
		for (int k = 1;k <= n;k++)
		{
			for (int i = 0;i < n - k;i++)
			{
				if (start[i] > start[i + 1])
				{
					e = start[i + 1];
					f = end[i + 1];
					start[i + 1] = start[i];
					end[i + 1] = end[i];
					start[i] = e;
					end[i] = f;
				}
			}
		}
		int min = start[0];
		for (int i = 1;i < n;i++)
		{
			if (start[i] <= end[i - 1])
			{
				if (end[i] < end[i - 1])
				{
					end[i] = end[i - 1];
				};
			}
			else
			{
				s = 0;
				break;
			}
			if (i == n - 1)
			{
				s = 1;
			}
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		if (s == 1)
		{
			System.out.printf("%d %d",min,max);
		}
	}



}

