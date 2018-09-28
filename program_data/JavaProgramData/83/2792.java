package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] xf = new int[10];
		int[] a = new int[10];
		float GPA = 0F;
		float b;
		float sum = 0F;
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
				xf[i] = Integer.parseInt(tempVar2);
			}
			sum += xf[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90)
			{
				b = 4.0F;
			}
			if (a[i] <= 89 && a[i] >= 85)
			{
				b = 3.7F;
			}
			if (a[i] <= 84 && a[i] >= 82)
			{
				b = 3.3F;
			}
			if (a[i] <= 81 && a[i] >= 78)
			{
				b = 3.0F;
			}
			if (a[i] <= 77 && a[i] >= 75)
			{
				b = 2.7F;
			}
			if (a[i] <= 74 && a[i] >= 72)
			{
				b = 2.3F;
			}
			if (a[i] <= 71 && a[i] >= 68)
			{
				b = 2.0F;
			}
			if (a[i] <= 67 && a[i] >= 64)
			{
				b = 1.5F;
			}
			if (a[i] <= 63 && a[i] >= 60)
			{
				b = 1.0F;
			}
			if (a[i] < 60)
			{
				b = 0.0F;
			}
			GPA += b * xf[i];
		}
		System.out.printf("%.2f",GPA / sum);
	}



}

