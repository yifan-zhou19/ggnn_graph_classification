package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int b;
		int i;
		int j;
		int n;
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
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] > a[i + 1])
				{
					b = a[i];
					a[i] = a[i + 1];
					a[i + 1] = b;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
	i = i + 1;
		for (;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}
}

