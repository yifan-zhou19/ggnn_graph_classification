package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		int j;
		int sum1 = 0;
		float GPA;
		float[] c = new float[100];
		float sum = 0F;
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			if (90 <= b[j])
			{
				c[j] = 4.0F;
			}
			else if (85 <= b[j])
			{
				c[j] = 3.7F;
			}
			else if (82 <= b[j])
			{
				c[j] = 3.3F;
			}
			else if (78 <= b[j])
			{
				c[j] = 3.0F;
			}
			else if (75 <= b[j])
			{
				c[j] = 2.7F;
			}
			else if (72 <= b[j])
			{
				c[j] = 2.3F;
			}
			else if (68 <= b[j])
			{
				c[j] = 2.0F;
			}
			else if (64 <= b[j])
			{
				c[j] = 1.5F;
			}
			else if (60 <= b[j])
			{
				c[j] = 1.0F;
			}
			else
			{
				c[j] = 0.0F;
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			sum = sum + a[j] * c[j];
		}
		for (j = 0;j <= n - 1;j++)
		{
			sum1 = sum1 + a[j];
		}
		GPA = sum / sum1;
		System.out.printf("%.2f\n",GPA);
	}

}

