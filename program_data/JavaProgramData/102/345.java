package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num_m;
		int num_w;
		int i;
		int j;
		float[] a = new float[50];
		float[] b = new float[50];
		float t;
		String s = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		num_m = 0;
		num_w = 0;
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t = Float.parseFloat(tempVar3);
			}
			if (s.charAt(0) == 'm')
			{
				a[++num_m] = t;
			}
			else
			{
				b[++num_w] = t;
			}
		}
		for (i = num_m - 1; i >= 1; i--)
		{
			for (j = 1; j <= i; j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = num_w - 1; i >= 1; i--)
		{
			for (j = 1; j <= i; j++)
			{
				if (b[j] < b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		for (i = 1; i <= num_m; i++)
		{
			System.out.printf("%.2f ", a[i]);
		}
		for (i = 1; i < num_w; i++)
		{
			System.out.printf("%.2f ", b[i]);
		}
		System.out.printf("%.2f\n", b[num_w]);
		return 0;
	}

}

