package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int n;
		int[] a = new int[500];
		int num = 0;
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0 && num == 0)
			{
				System.out.printf("%d",a[i]);
				num++;
				continue;
			}
			if (a[i] % 2 != 0 && num != 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}

}

