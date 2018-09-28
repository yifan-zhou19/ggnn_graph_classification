package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10];
		int[] b = new int[10];
		double[] c = new double[10];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] < 60)
			{
				c[i] = 0;
			}
			else if (b[i] <= 63 && b[i] >= 60)
			{
				c[i] = 1.0;
			}
			else if (b[i] <= 67 && b[i] >= 64)
			{
				c[i] = 1.5;
			}
			else if (b[i] <= 71 && b[i] >= 68)
			{
				c[i] = 2.0;
			}
			else if (b[i] <= 74 && b[i] >= 72)
			{
				c[i] = 2.3;
			}
			else if (b[i] <= 77 && b[i] >= 75)
			{
				c[i] = 2.7;
			}
			else if (b[i] <= 81 && b[i] >= 78)
			{
				c[i] = 3.0;
			}
			else if (b[i] <= 84 && b[i] >= 82)
			{
				c[i] = 3.3;
			}
			else if (b[i] <= 89 && b[i] >= 85)
			{
				c[i] = 3.7;
			}
			else
			{
				c[i] = 4.0;
			}
		}
		double GPA;
		double sum = 0;
		double score = 0;
		for (i = 0;i < n;i++)
		{
			sum = sum + c[i] * a[i];
			score = score + a[i];
		}
		GPA = sum / (double)score;
		System.out.printf("%.2f",GPA);
	}

}

