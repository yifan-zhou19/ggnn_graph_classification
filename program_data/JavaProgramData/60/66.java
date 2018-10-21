package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int[] a = new int[111111];
		int k;
		int m;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (m = 2;m <= n;m++)
			{
				k = Math.sqrt(m);
				for (i = 2;i <= k;i++)
				{
					if (m % i == 0)
					{
						break;
					}
				}
				if (i > k)
				{
					a[j] = m;
					j++;
				}
				else
				{
					continue;
				}
			}
		}
		s = j;
		for (j = 0;j <= s;j++)
		{
			if (a[j + 1] - a[j] == 2)
			{
				System.out.printf("%d %d\n",a[j],a[j + 1]);
			}
			else
			{
				continue;
			}
		}
	}
}

