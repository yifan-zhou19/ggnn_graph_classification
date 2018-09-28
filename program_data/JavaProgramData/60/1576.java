package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//zhao su shu
		int n;
		int i;
		int[] a = new int[10000];
		int j = 0;
		int k = 0;
		int d;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2)
		{
			d = 0;
			for (k = 2;k <= Math.sqrt(i);k++)
			{
				if (i % k == 0)
				{
					d = 1;
				}
			}
			if (d == 0)
			{
				j = j + 1;
				a[j] = i;
				sum = j;

			}
		}
		//suan jian er
		k = 0;
		for (j = 1;j <= sum;j++)
		{
			if (a[j + 1] - a[j] == 2)
			{
				System.out.printf("%d %d\n",a[j],a[j + 1]);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}

}

