package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100000];
		int sum = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (n == 1)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i <= n - 1;i++)
			{
				sum = 0;
				for (j = 0;j <= i - 1;j++)
				{
					if (a[i] == a[j])
					{
						sum = 1;
					}
				}
				if (sum == 0)
				{
					System.out.printf(" %d",a[i]);
				}
			}
		}
	}
}

