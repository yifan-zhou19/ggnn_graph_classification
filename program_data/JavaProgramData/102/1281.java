package <missing>;

public class GlobalMembers
{
	public static void big_small(float[] a, int n)
	{
		int i;
		int k;
		float b;
		for (i = 0;i <= n;i++)
		{
			for (k = i + 1;k <= n;k++)
			{
				if (a[i] < a[k])
				{
					b = a[i];
					a[i] = a[k];
					a[k] = b;
				}
			}
		}
	}
	public static void small_big(float[] a, int n)
	{
		int i;
		int k;
		float b;
		for (i = 0;i <= n;i++)
		{
			for (k = i + 1;k <= n;k++)
			{
				if (a[i] > a[k])
				{
					b = a[i];
					a[i] = a[k];
					a[k] = b;
				}
			}
		}
	}
	public static int Main()
	{
		char[][] g = new char[41][7];
		int n;
		int i;
		int j = 0;
		int k = 0;
		float[] a = new float[40];
		float[] b = new float[40];
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
				g[i] = tempVar2.charAt(0);
			}
			if (String.valueOf(g[i]).length() == 4)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Float.parseFloat(tempVar3);
				}
				j++;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					b[k] = Float.parseFloat(tempVar4);
				}
				k++;
			}
		}
		small_big(a, j);
		big_small(b, k);
		for (i = 1;i <= j;i++)
		{
		   System.out.printf("%3.2f ",a[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
		   System.out.printf("%3.2f ",b[i]);
		}
		System.out.printf("%3.2f",b[k - 1]);
	}
}

