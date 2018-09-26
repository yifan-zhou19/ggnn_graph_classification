package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[2000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 2,n = 0;i <= m;i++)
		{
			n = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					n = n + 1;
				}
			}
			if (n == 0)
			{
				a[k] = i;
				k++;
			}
		}
		if (k == 0 || k == 1 || k == 2)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				if (a[i + 1] - a[i] == 2)
				{
					System.out.printf("%d %d\n",a[i],a[i + 1]);
				}
			}
		}
	}
}

