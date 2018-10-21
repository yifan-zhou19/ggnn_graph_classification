package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		int i;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = n + k;; i += n)
		{
			m = i;
			for (int j = 0;j < n;j++)
			{
				if (m % n != k)
				{
					temp = 1;
					break;
				}
				m = m - k - m / n;
			}
			if (temp == 0 && m > 0)
			{
				break;
			}
			temp = 0;
		}
		System.out.printf("%d\n",i);
		return 0;
	}
}

