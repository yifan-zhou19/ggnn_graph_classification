package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j;
		int t;
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
				if ((a[i] == a[j]) && (b[j] == 0))
				{
					b[j] = 1;
				}
			}
		}
				for (i = 0;i < n;i++)
				{
					if (b[i] == 0)
					{
						j = i,t = a[i];
					}
				}
		for (i = 0;i < j;i++)
		{
			if (b[i] == 0)
			{
				System.out.printf("%d,",a[i]);
			}
		}
		System.out.printf("%d",t);

	}
}

