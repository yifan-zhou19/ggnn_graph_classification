package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[500];
		int i;
		int j;
		int n;
		int t;
		int f;
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
				if (a[i + j] > a[i + j + 1])
				{
					t = a[i + j];
					a[i + j] = a[i + j + 1];
					a[i + j + 1] = t;
				}
			}
		}
		for (i = 0,f = 0;i < n;i++)
		{
			if (a[i] % 2 != 0 && f == 0)
			{
				System.out.printf("%d",a[i]);
				f = 1;
			}
			else if (a[i] % 2 != 0 && f != 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}
}

