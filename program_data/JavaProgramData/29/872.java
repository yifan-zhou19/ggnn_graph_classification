package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[1000];
		float[] b = new float[1000];
		int m;
		int i;
		int n;
		int j;
		float s = 0F;
		a[1] = 1F;
		a[2] = 2F;
		for (i = 3;i < 999;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		b[1] = 2F;
		for (i = 2;i < 1000;i++)
		{
			b[i] = (a[i - 1] / a[i]) + 1;
		}
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
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
			s = s + b[j];
			}
			System.out.printf("%.3f\n",s);
			s = 0F;
		}
		return 0;
	}


}

