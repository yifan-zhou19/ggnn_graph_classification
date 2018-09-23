package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] c = new int[100];
		int max;
		double[] a = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
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
				a[i] = Double.parseDouble(tempVar2);
			}
		}
		c[n - 1] = 1;
		for (i = n - 1;i >= 0;i--)
		{
			max = 0;
			for (j = i + 1;j < n;j++)
			{
				if (a[j] <= a[i] != 0 && c[j]> max)
				{
					max = c[j];
				}
			}
			c[i] = max + 1;
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.printf("%d",max);

	}

}

