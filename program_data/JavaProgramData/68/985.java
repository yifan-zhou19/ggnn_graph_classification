package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k = 1;
		int l;
		int n;
		int m;
		int flag;
		int[] a = new int[25000];
		int[] b = new int[25000];
		int[] c = new int[25000];
		a[0] = 3;
		c[3] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 5;i <= n;i = i + 2)
		{
			for (j = 3;j < i;j = j + 2)
			{
				if (i % j == 0)
				{
					break;
				}
				if (j > Math.sqrt(i))
				{
					a[k] = i;
					c[a[k]] = 1;
					k++;
					break;

				}
			}
		}

		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 0;j <= k;j++)
			{
				if (c[i - a[j]] == 1)
				{
					System.out.printf("%d=%d+%d\n",i,a[j],i - a[j]);
				break;
				}
			}
		}
	}


}

