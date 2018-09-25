package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int o = 0;
		int p = 0;
		int n;
		char[][] c = new char[50][10];
		final String f = "female";
		final String m = "male";
		float[] h = new float[50];
		float[] a = new float[50];
		float[] b = new float[50];
		float u;
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
				c[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(c[i],m) == 0)
			{
				a[o++] = h[i];
			}
			else if (strcmp(c[i],f) == 0)
			{
				b[p++] = h[i];
			}
		}
		for (k = 1;k < o;k++)
		{
			for (i = 0;i < o - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					u = a[i + 1];
					a[i + 1] = a[i];
					a[i] = u;
				}
			}
		}
		 for (k = 1;k < p;k++)
		 {
			for (i = 0;i < p - k;i++)
			{
				if (b[i] < b[i + 1])
				{
					u = b[i + 1];
					b[i + 1] = b[i];
					b[i] = u;
				}
			}
		 }
		for (i = 0;i < o;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}
		for (i = 0;i < p - 1;i++)
		{
			System.out.printf("%.2f ",b[i]);
		}
		System.out.printf("%.2f",b[p - 1]);

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

