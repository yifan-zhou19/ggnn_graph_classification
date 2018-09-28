package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[100];
		float[] b = new float[100];
		a[0] = 2F;
		a[1] = 3F;
		b[0] = 1F;
		b[1] = 2F;
		for (int i = 2;i < 100;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
			b[i] = b[i - 1] + b[i - 2];
		}
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			float sum = 0F;
			for (int j = 0;j < m;j++)
			{
				sum += a[j] / b[j];
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}

}

