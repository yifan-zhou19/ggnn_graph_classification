package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[300];
		int[] b = new int[300];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				System.out.printf("%d",a[i]);
			}
			b[i] = 1;
			for (j = 0;j < i;j++)
			{
				if (a[i] != a[j] && b[i] == 1)
				{
					b[i] = 1;
				}
				else
				{
					b[i] = 0;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}
}

