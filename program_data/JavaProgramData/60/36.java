package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int[] a = new int[10000];
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 2;m <= n;m++)
		{
			for (i = 2;i <= Math.sqrt(m);i++)
			{
				if (m % i == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt(m))
			{
				a[k] = m;
				k = k + 1;
			}
		}
		m = 0;
	//	printf("%d",a[0]);
		for (i = 0;i < k;i++)
		{
			if (a[i] == a[i + 1] - 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				m = m + 1;
			}
		}
		if (m == 0)
		{
			System.out.print("empty");
		}
	}
}

