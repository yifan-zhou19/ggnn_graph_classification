package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		float[] a = new float[201];
		float[] sum = new float[100];
		for (i = 1;i <= 200;i++)
		{
			if (i == 1)
			{
				a[i] = 1F;
			}
			else if (i == 2)
			{
				a[i] = 2F;
			}
			else
			{
				a[i] = a[i - 1] + a[i - 2];
			}
		}
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
				k = Integer.parseInt(tempVar2);
			}
			sum[i] = 0F;
			for (j = 0;j < k;j++)
			{
				sum[i] = sum[i] + (a[j + 2] / a[j + 1]);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.3f\n",sum[i]);
		}
		return 0;
	}

}

