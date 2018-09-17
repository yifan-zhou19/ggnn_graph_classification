package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a;
		int[] d;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[(n + 1)];
		for (i = 1;i < n + 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		d = new int[(n + 1)];
		for (i = 1;i <= n;i++)
		{
			d[i] = 1;
		}
		for (i = n - 1;i > 0;i--)
		{

			for (j = i + 1;j <= n;j++)
			{

				if (a[j] <= a[i])
				{
					if (d[i] < d[j] + 1)
					{
						d[i] = d[j] + 1;
					}
				}
			}
		}
		int max = d[1];
		for (i = 1;i <= n;i++)
		{
			if (max < d[i])
			{
				max = d[i];
			}
		}
		System.out.printf("%d\n",max);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(d);
		return 0;
	}


}

