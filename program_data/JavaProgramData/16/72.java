package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		int k = 1;
		int[] a = new int[5];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 10000;i = i * 10)
		{
								if (m / i != 0)
								{
								j++;
								}
								else
								{
								break;
								}
		}
		for (i = 1;i < j;i++)
		{
						k = 10 * k;
		}
		for (i = j;i >= 1;i--)
		{
						 a[i] = m / k;
						 m = m % k;
						 k = k / 10;
		}
		for (i = 1;i <= j;i++)
		{
						System.out.printf("%d",a[i]);
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

