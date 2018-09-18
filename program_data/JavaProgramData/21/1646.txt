package <missing>;

public class GlobalMembers
{
	public static float f(float[] a, int n)
	{
		float s = 0F;
		int i;
		for (i = 0;i <= n - 1;i++)
		{
			s = s + a[i];
		}
		return s / n;
	}
	public static float g(float a)
	{
		if (a > 0F)
		{
			return a;
		}
		else
		{
			return -a;
		}
	}
	public static void Main()
	{
		float[] a = new float[100];
		float[] b = new float[100];
		float c = 0F;
		float d;
		float t;
		float[] m = new float[100];
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = n - 2;j >= i;j--)
			{
				if (a[j + 1] < a[j])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}

		d = f(a, n);
		for (i = 0;i <= n - 1;i++)
		{
			b[i] = g((d - a[i]));
			if (b[i] > c)
			{
				c = b[i];
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (b[i] == c)
			{
				m[k] = a[i];
				k++;
			}
		}
		if (k == 1)
		{
			System.out.printf("%.0f",m[0]);
		}
		else
		{
			for (i = 0;i <= k - 2;i++)
			{
				System.out.printf("%.0f,",m[i]);
			}
			System.out.printf("%.0f",m[k - 1]);
		}

	}
}

