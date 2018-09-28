package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int[] a = new int[100001];
		int x = 0;
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			x = 0;
			for (j = 2;j <= i - 1;j++)
			{
				if (i % j == 0)
				{
					x = 1;
				}
			}
			if (x == 0)
			{
				a[k] = i;
				k++;
			}
		}
		x = 0;
		for (i = 1;i <= k - 2;i++)
		{
			if (a[i + 1] == a[i] + 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				x = 1;
			}
		}
		if (x == 0)
		{
			System.out.print("empty");
		}
	}

}

