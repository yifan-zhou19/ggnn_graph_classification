package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
		int m = 0;
		float[] c = new float[10];
		float sum = 0F;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

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
		if (b[i] >= 90 && b[i] <= 100)
		{
			c[i] = 4.0 * a[i];
		}
		if (b[i] >= 85 && b[i] <= 89)
		{
			c[i] = 3.7 * a[i];
		}
		if (b[i] >= 82 && b[i] <= 84)
		{
			c[i] = 3.3 * a[i];
		}
		if (b[i] >= 78 && b[i] <= 81)
		{
			c[i] = 3.0 * a[i];
		}
		if (b[i] >= 75 && b[i] <= 77)
		{
			c[i] = 2.7 * a[i];
		}
		if (b[i] >= 72 && b[i] <= 74)
		{
			c[i] = 2.3 * a[i];
		}
		if (b[i] >= 68 && b[i] <= 71)
		{
			c[i] = 2.0 * a[i];
		}
		if (b[i] >= 64 && b[i] <= 67)
		{
			c[i] = 1.5 * a[i];
		}
		if (b[i] >= 60 && b[i] <= 63)
		{
			c[i] = 1.0 * a[i];
		}
		if (b[i] < 60)
		{
			c[i] = 0F;
		}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + c[i];
			m = m + a[i];
		}
		GPA = sum / m;
		System.out.printf("%.2f",GPA);
	}
}

