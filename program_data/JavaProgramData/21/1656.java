package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int s;
		int[] c = new int[300];
		float[] b = new float[300];
		float p;
		float m;
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
		for (i = 0,s = 0;i < n;i++)
		{
			s = s + a[i];
		}
		p = (float)s / (float)n;
		for (i = 0;i < n;i++)
		{
			b[i] = (float)a[i] - p;
			if (b[i] < 0F)
			{
				b[i] = 0 - b[i];
			}
		}
		for (i = 0,m = 0F;i < n;i++)
		{
			if (b[i] > m - 0.001)
			{
				m = b[i];
			}
		}
		for (i = 0,s = 0;i < n;i++)
		{
			if (b[i] > m - 0.001 && (float)a[i] < p - 0.001)
			{
				c[s] = a[i];
				s++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > m - 0.001 && (float)a[i] > p + 0.001)
			{
				c[s] = a[i];
				s++;
			}
		}
		for (i = 0;i < s - 1;i++)
		{
			System.out.printf("%d,",c[i]);
		}
		System.out.printf("%d\n",c[s - 1]);
	}

}

