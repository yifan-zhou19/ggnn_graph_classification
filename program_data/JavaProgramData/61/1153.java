package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20];
		int[] b = new int[20];
		a[0] = a[1] = 1;
		for (i = 2;i < 20;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
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
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < 21;j++)
			{
				if (b[i] == j)
				{
					System.out.printf("%d\n",a[j - 1]);
				}
			}
		}
		return 0;
	}
}

