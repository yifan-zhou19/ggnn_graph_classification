package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int[] b = new int[300];
		int j;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if ((a[i] == a[j]) && b[j] == 0)
				{
					b[j] = 1;
				}
			}
		}
				for (i = 0;i < n;i++)
				{
					if (b[i] == 0)
					{
						j = a[i];
					}
				}
		i = 0;
		while (a[i] != j)
		{
			if (b[i] == 0)
			{
				System.out.printf("%d,",a[i]);
			}
			i++;
		}
		System.out.printf("%d\n",j);
	}
}

