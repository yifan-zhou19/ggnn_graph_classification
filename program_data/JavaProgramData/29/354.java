package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[1000];
		float[] b = new float[1000];
		int n;
		int m;
		int j;
		int i;
		float sum;
		a[1] = 1F;
		a[2] = 2F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= m;j++)
		{
			sum = 0F;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 3;i <= n + 1;i++)
		{
		a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 1;i <= n;i++)
		{
					sum = sum + a[i + 1] / a[i];
		}
				   System.out.printf("%.3f\n",sum);
		}
				  System.in.read();
				  System.in.read();
	}

}

