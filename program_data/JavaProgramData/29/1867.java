package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		float[] a = new float[200];
		float[] b = new float[200];
		float s;
		a[1] = 2F;
		a[2] = 3F;
		b[1] = 1F;
		b[2] = 2F;
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			s = 0F;
			for (j = 1;j <= n;j++)
			{
				a[j + 2] = a[j] + a[j + 1];
				b[j + 2] = b[j] + b[j + 1];
				s = s + (a[j] / b[j]);
			}
			System.out.printf("%.3f\n", s);
		}

		return 0;
	}

}

