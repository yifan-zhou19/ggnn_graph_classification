package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] d = new int[1000];
		int m;
		int i;
		int j;
		int t;
		float[] c = new float[1000];
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a[1] = 1;
		a[2] = 2;
		b[1] = 2;
		b[2] = 3;
		for (j = 1;j <= m;j++)
		{
			t = d[j];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			sum = 0F;
			for (i = 1;i <= t;i++)
			{
			a[i + 2] = a[i + 1] + a[i];
			b[i + 2] = b[i + 1] + b[i];
			c[i] = (1.0 * b[i]) / a[i];
			sum = sum + c[i];
			}
			System.out.printf("%.3f\n", sum);
		}

	}
}

