package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] c = new int[100];
		float[] a = new float[100];
		float[] b = new float[100];
		float sum = 0.000F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			c[i] = n;
		}
		for (i = 0;i < m;i++)
		{
			sum = 0.000F;
			for (j = 0;j < c[i];j++)
			{
				if (j == 0)
				{
					a[j] = 2F;
					b[j] = 1F;
				}
				else
				{
					a[j] = a[j - 1] + b[j - 1];
					b[j] = a[j - 1];
				}
				sum = sum + a[j] / b[j];
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}

}

