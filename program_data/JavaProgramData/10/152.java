package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int max;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 1;
			for (j = 1;j <= i - 1;j++)
			{
				if (a[i] > a[j])
				{
					continue;
				}
				if (b[i] < b[j] + 1)
				{
					b[i] = b[j] + 1;
				}
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d\n",max);
	}




}

