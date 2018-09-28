package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum1 = 0;
		float sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum1 += a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] < 60)
			{
				sum += 0;
			}
			if (b[i] >= 60 && b[i] <= 63)
			{
				sum += a[i] * 1.0;
			}
			if (b[i] >= 64 && b[i] <= 67)
			{
				sum += a[i] * 1.5;
			}
			if (b[i] >= 68 && b[i] <= 71)
			{
				sum += a[i] * 2.0;
			}
			if (b[i] >= 72 && b[i] <= 74)
			{
				sum += a[i] * 2.3;
			}
			if (b[i] >= 75 && b[i] <= 77)
			{
				sum += a[i] * 2.7;
			}
			if (b[i] >= 78 && b[i] <= 81)
			{
				sum += a[i] * 3.0;
			}
			if (b[i] >= 82 && b[i] <= 84)
			{
				sum += a[i] * 3.3;
			}
			if (b[i] >= 85 && b[i] <= 89)
			{
				sum += a[i] * 3.7;
			}
			if (b[i] >= 90 && b[i] <= 100)
			{
				sum += a[i] * 4.0;
			}
		}
		System.out.printf("%.2f",sum / sum1);
		return 0;
	}

}

