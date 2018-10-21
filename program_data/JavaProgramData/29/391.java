package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int m;
		int[] n = new int[100];
		int i;
		int j;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		a[0] = 2F;
		b[0] = 1F;
		for (i = 0;i < m;i++)
		{
			c[i] = 2 / 1;
			for (j = 1;j < n[i];j++)
			{

				b[j] = a[j - 1];
				a[j] = a[j - 1] + b[j - 1];
				c[i] = c[i] + a[j] / b[j];
			}
			System.out.printf("%.3f\n",c[i]);
		}

	return 0;
	}
}

