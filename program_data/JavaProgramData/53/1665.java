package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 1;
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] == a[j])
				{
					b[j] = 0;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] == 1)
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
		for (i = i + 1;i <= n;i++)
		{
			if (b[i] == 1)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}


}

