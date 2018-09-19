package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int j;
		int o;
		int k = 0;
		int[] c = new int[100];
		float sum = 0F;
		float[] b = new float[100];
		float t;
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
			sum = sum + a[i];
		}
		t = sum / n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					o = a[j];
				a[j] = a[j + 1];
				a[j + 1] = o;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		b[i] = Math.abs(a[i] - t);
		}
		m = b[0];
		for (i = 0;i < n;i++)
		{
		if (b[i] > m)
		{
			m = b[i];
		}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == m)
			{
				c[k] = a[i];
				k++;
			}
		}
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",c[i]);
			}
			System.out.printf("%d",c[k - 1]);
	}
}

