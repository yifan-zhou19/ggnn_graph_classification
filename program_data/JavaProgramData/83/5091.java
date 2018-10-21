package <missing>;

public class GlobalMembers
{
	public static double jp(int p)
	{
		double jp;
		if (p >= 90)
		{
			jp = 4.0;
		}
		else if (p >= 85)
		{
			jp = 3.7;
		}
		else if (p >= 82)
		{
			jp = 3.3;
		}
		else if (p >= 78)
		{
			jp = 3.0;
		}
		else if (p >= 75)
		{
			jp = 2.7;
		}
		else if (p >= 72)
		{
			jp = 2.3;
		}
		else if (p >= 68)
		{
			jp = 2.0;
		}
		else if (p >= 64)
		{
			jp = 1.5;
		}
		else if (p >= 60)
		{
			jp = 1.0;
		}
		else
		{
			jp = 0.0;
		}
		return jp;
	}
	public static int Main()
	{
		int n;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] list1 = new int[10];
		double[] list2 = new double[10];
		int i;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				list1[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
			list2[i] = jp(p) * list1[i];
		}

		int sum1 = 0;
		double sum2;
		for (i = 0;i < n;i++)
		{
			 sum1 += list1[i];
		}
		for (i = 0;i < n;i++)
		{
			sum2 += (list2[i] / sum1);
		}

		System.out.printf("%.2f",sum2);
		return 0;
	}



}

