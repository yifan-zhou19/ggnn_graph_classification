package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int r;
		int[] a = new int[N];
		int flag;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 2,r = 0;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				a[r] = i;
				r++;
			}
		}

		for (i = 1,flag = 0;i < r;i++)
		{
			if (a[i] - a[i - 1] == 2)
			{
				flag = 1;
				System.out.printf("%d %d\n",a[i - 1],a[i]);
			}
		}

		if (flag == 0)
		{
			System.out.print("empty\n");
		}

		return 0;
	}
}

