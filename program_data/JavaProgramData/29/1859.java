package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[1000];
		int i;
		int j;
		float[] b = new float[1000];
		float[] sum = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		b[1] = 1F;
		b[2] = 2F;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum[i] = 0F;
			for (j = 1;j <= a[i];j++)
			{
				sum[i] = sum[i] + (b[j + 1] / b[j]);
				b[j + 2] = b[j] + b[j + 1];

			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n", sum[i]);
		}
		return 0;
	}
}

