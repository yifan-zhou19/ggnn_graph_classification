package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] max = new int[100];
		int[] min = new int[100];
		int i;
		int j;
		int t = 0;
		int tr = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				max[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				min[i] = Integer.parseInt(tempVar3);
			}
			if (max[i] <= 140 && max[i] >= 90 && min[i] >= 60 && min[i] <= 90)
			{
				t++;
			}
			else
			{
				t = 0;
			}
			if (t >= tr)
			{
				tr = t;
			}
		}
		System.out.printf("%d",tr);
		return 0;
	}

}

