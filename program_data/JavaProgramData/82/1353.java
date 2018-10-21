package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t = 0;
		int b = 0;
		int[] max = new int[110];
		int[] min = new int[110];
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
				max[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				min[i] = Integer.parseInt(tempVar3);
			}
		}
		if (max[0] >= 90 && max[0] <= 140 && min[0] >= 60 && min[0] <= 90)
		{
			t++;
			b = t;
		}
		for (i = 1;i < n;i++)
		{
			if (max[i] >= 90 && max[i] <= 140 && min[i] >= 60 && min[i] <= 90)
			{
				if (max[i - 1] >= 90 && max[i - 1] <= 140 && min[i - 1] >= 60 && min[i - 1] <= 90)
				{
					t++;
					if (t > b)
					{
						b = t;
					}
				}
				else
				{
					t = 0;
					t++;
					if (t > b)
					{
						b = t;
					}
				}
			}
			else
			{
				if (max[i - 1] >= 90 && max[i - 1] <= 140 && min[i - 1] >= 60 && min[i - 1] <= 90)
				{
					if (t > b)
					{
						b = t;
						t = 0;
					}
				}
			}
		}
		System.out.printf("%d",b);
		return 0;
	}
}

