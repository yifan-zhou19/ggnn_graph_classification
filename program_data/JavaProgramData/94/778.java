package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int j = 0;
		int temp;
		int[] a = new int[500];
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
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (j == 0 && a[i] % 2 == 1)
			{
				System.out.printf("%d",a[i]);
				j = 1;
			}
			else if (j != 0 && a[i] % 2 == 1)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return (0);
	}
}

