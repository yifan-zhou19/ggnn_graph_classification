package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int total;
		int left;
		int i;
		int x = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		total = n + k;
		for (; ; total++)
		{
			left = total;
			i = 1;
			while (i <= n)
			{
				i++;
				if (left % n == k && left >= n + k)
				{
					left = (left - k) * (n - 1) / n;
				}
				else
				{
					left = 0;
				}
			}
			if (left / (n - 1) >= 1)
			{
				break;
			}
		}
		System.out.printf("%d\n", total);
	}
}

