package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
		int s;
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
		i = 0;
		m = 0;
		s = 0;
		for (m = n;i < n;m++)
		{
			i = 0;
			s = m;
		for (;i < n;i++)
		{
			if (s % n == k && s >= n)
			{
			s = s - s / n - k;
			}
			else
			{
				break;
			}
		}
		}
		System.out.printf("%d\n",m - 1);
	}
}

