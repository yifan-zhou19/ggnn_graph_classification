package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float sum1 = 0F;
		float sum2 = 0F;
		float xf;
		float[] a = new float[11];
		float[] b = new float[11];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (90F <= b[i])
			{
				xf = 4.0 * a[i];
			}
			else if (85F <= b[i])
			{
				xf = 3.7 * a[i];
			}
			else if (82F <= b[i])
			{
				xf = 3.3 * a[i];
			}
			else if (78F <= b[i])
			{
				xf = 3.0 * a[i];
			}
			else if (75F <= b[i])
			{
				xf = 2.7 * a[i];
			}
			else if (72F <= b[i])
			{
				xf = 2.3 * a[i];
			}
			else if (68F <= b[i])
			{
				xf = 2.0 * a[i];
			}
			else if (64F <= b[i])
			{
				xf = 1.5 * a[i];
			}
			else if (60F <= b[i])
			{
				xf = 1.0 * a[i];
			}
			else
			{
				xf = 0F;
			}
			sum1 += xf;
			sum2 += a[i];
		}
		System.out.printf("%.2f",sum1 / sum2);
		return 0;
	}

}

