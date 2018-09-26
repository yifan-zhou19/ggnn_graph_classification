package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < m;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			float[] a = new float[(n + i)];
			float[] b = new float[(n + i)];
			a[0] = 1.0F;
			a[1] = 2.0F;
			b[0] = 2.0F;
			b[1] = 3.0F;
			for (int j = 2;j < n;j++)
			{
				a[j] = a[j - 1] + a[j - 2];
				b[j] = b[j - 1] + b[j - 2];
			}
			float sum = 0F;
			for (int j = 0;j < n;j++)
			{
				sum += b[j] / a[j];
			}
			System.out.printf("%.3f\n",sum);
		}
	}
}

