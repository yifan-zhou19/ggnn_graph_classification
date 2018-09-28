package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int[] b = new int[300];
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
			b[j] = 0;
		}
		for (i = 0;i < n;i++)
		{
			int m = a[i];
			for (j = i + 1;j < n;j++)
			{
				if (m == a[j])
				{
					b[j] = 1;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (b[i] == 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}

}

