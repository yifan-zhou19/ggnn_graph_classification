package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int j;
		int k = 0;
		int num = 0;
		int sum = 0;
		int tot = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			num = 0;
			for (j = 1;j <= i;j++)
			{

				if (i % j == 0)
				{
					num = num + 1;
				}

			}
			if (num == 2)
			{
				sum = sum + 1;
			a[k] = i;
			k = k + 1;
			}

		}
		for (j = 0;j < k - 1;j++)
		{
			if (a[j + 1] - a[j] == 2)
			{
				tot = tot + 1;
				System.out.printf("%d %d\n",a[j],a[j + 1]);
			}

		}
		if (tot == 0)
		{
			System.out.print("empty");
		}
		return 0;







	}

}

