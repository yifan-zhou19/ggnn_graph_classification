package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			b[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					b[i] = MAX(b[j] + 1,b[i]);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			max = MAX(max,b[i]);
		}
		System.out.printf("%d\n",max);
	}

}

