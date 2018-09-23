package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[123];
		float[] b = new float[123];
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int flag = 0;
		float s = 0.0F;
		float max = 0.0F;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			s += a[i];
		}
		s = s / n;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
			for (i = 0;i < n;i++)
			{
				b[i] = (float)Math.abs(a[i] - s);
			}
			for (i = 0;i < n;i++)
			{
				if (b[i] > max)
				{
					max = b[i];
				}
			}
			for (i = 0;i < n;i++)
			{
				if (b[i] == max)
				{
					if (flag == 1)
					{
						System.out.print(",");
					}
						System.out.printf("%d",a[i]);
						flag = 1;
				}
			}
			return 0;
	}
}

