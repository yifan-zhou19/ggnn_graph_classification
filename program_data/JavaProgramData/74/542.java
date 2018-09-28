package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] ar = new int[10];
		int s = 0;
		int p = m;
		while (p != 0)
		{
			ar[s++] = p % 10;
			p /= 10;
		}
		int i;
		int j;
		int k;
		int first = 1;
		for (i = m; i <= n; i++)
		{
			for (j = 0; j < s / 2; j++)
			{
				if (ar[j] != ar[s - 1 - j])
				{
					break;
				}
			}
			if (j == s / 2 && i % 2)
			{
				int prime = 1;
				for (j = 3;j <= Math.sqrt((double)i);j += 2)
				{
					if (i % j == 0)
					{
						prime = 0;
						break;
					}
				}
				if (prime != 0)
				{
					if (first != 0)
					{
						first = 0;
					}
					else
					{
						System.out.print(",");
					}
					System.out.printf("%d", i);
				}
			}
			j = 0;
			while (ar[j] == 9)
			{
				j++;
			}
			ar[j]++;
			for (k = 0; k < j; k++)
			{
				ar[k] = 0;
			}
			if (j == s)
			{
				s++;
			}
		}
		if (first != 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

