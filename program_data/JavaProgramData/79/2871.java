package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int m = 1;
		int king = 0;
		int left = 0;
		int count = 0;
	for (int i1 = 0;n != 0 && m != 0;i1++)
	{
		count = 0;
	int[] houzi = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0 && m == 0)
		{
			break;
		}
		left = n;
		for (int i2 = 0;i2 < n;i2++)
		{
			houzi[i2] = 1;
		}
		for (int i3 = 0;left != 1;i3++)
		{
			if (i3 > n - 1)
			{
				i3 = i3 % (n);
			}
			if (houzi[i3] == 0)
			{
				continue;
			}
			count++;

			if (count == m)
			{
				houzi[i3] = 0;
				left--;
				count = 0;
			}
			if (count > m)
			{
				count = count % m;
			}
		}
		for (int i4 = 0;i4 < n;i4++)
		{
			if (houzi[i4] == 1)
			{
				king = i4 + 1;
				break;
			}
		}
		System.out.printf("%d\n",king);
	}
		return 0;
	}
}

