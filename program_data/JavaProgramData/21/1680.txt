package <missing>;

public class GlobalMembers
{
	public static void average(int[] a, float[] b)
	{
		int n = 0;
		int sum = 0;
		int i;
		float aver;
		for (;a[n] != 0;n++)
		{
			sum += a[n];
		}
		aver = (float)sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = a[i] - aver;
		}
	}
	public static float max(float[] b, int n)
	{
		int i;
		int k = 0;
		for (i = 0;i < n;i++)
		{
		if (Math.abs(b[i]) > Math.abs(b[k]))
		{
			k = i;
		}
		}
		return Math.abs(b[k]);
	}
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j = 0;
		float[] b = new float[300];
		float c;
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
		}
		average(a, b);
		c = max(b, n);
		for (i = 0;i < n;i++)
		{
			if (b[i] == (-c))
			{
				if (j != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",a[i]);
				j++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == c)
			{
				if (j != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",a[i]);
			}
		}
		System.out.print("\n");
	}


}

