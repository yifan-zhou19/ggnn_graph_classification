package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l = 0;
		int k;
		int m;
		int[] f = new int[300];
		float s = 0F;
		float[] a = new float[301];
		float c;
		float b;
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
				a[i] = Float.parseFloat(tempVar2);
			}
			s = s + a[i];
		}
		s = s / n;
		c = 0F;
		b = 0F;
		for (i = 0;i < n;i++)
		{
			c = Math.abs((float)a[i] - s);
			if (c > b)
			{
				b = c;
			}
		}
		for (i = 0;i < n;i++)
		{
			c = Math.abs((float)a[i] - s);
			if ((b - c) < 1e-6)
			{
				f[l] = a[i];
				l++;
			}

		}
		n = l;
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n - 1;k++)
			{
				if (f[k] > f[k + 1])
				{
					m = f[k];
					f[k] = f[k + 1];
					f[k + 1] = m;
				}
			}
		}
		System.out.printf("%d",f[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(",%d",f[i]);
		}
		return 0;
	}


}

