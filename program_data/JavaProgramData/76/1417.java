package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int max;
		int min;
		int p;
		int s = 0;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] zdd = new int[n];
		int[] ydd = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zdd[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				ydd[i] = Integer.parseInt(tempVar3);
			}
		}
		min = zdd[0];
		max = ydd[0];
			for (i = 0;i < n;i++)
			{
				if (zdd[i] < min)
				{
					min = zdd[i];
				}
				if (max < ydd[i])
				{
					max = ydd[i];
				}
			}
		int[] y = new int[max];
		for (i = min;i < max;i++)
		{
			y[i] = 1;
		}
		for (x = min + 0.5;x <= max;x++)
		{
			p = 0;
			for (i = 0;i < n;i++)
			{
			if ((x >= zdd[i]) && (x <= ydd[i]))
			{
				p++;
			}
			}
			if (p > 0)
			{
				s++;
			}
		}
		if (s == max - min)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}


}

