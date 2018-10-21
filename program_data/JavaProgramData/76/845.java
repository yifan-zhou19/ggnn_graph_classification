package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int min;
		int max;
		int c = 0;
		int j;
		int[] qs = new int[50000];
		int[] zd = new int[50000];
		double g;
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
				qs[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zd[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0 || qs[i] < min)
			{
				min = qs[i];
			}
			if (i == 0 || zd[i] > max)
			{
				max = zd[i];
			}
		}
		for (g = (1.0 * min + 0.5);g <= (1.0 * max);g += 1.0)
		{
			for (j = 0;j < n;j++)
			{
				if (g >= 1.0 * qs[j] && g <= 1.0 * zd[j])
				{
					c++;
					break;
				}
			}
		}
		if (c == max - min)
		{
			System.out.printf("%d %d\n",min,max);
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}




}

