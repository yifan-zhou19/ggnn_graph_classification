package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] sz = new int[500];
		int m;
		int i;
		int s = 0;
		int k;
		int n = 0;
		for (k = 0;k < 500;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[k] = Integer.parseInt(tempVar);
			}
			n = n + 1;
			if (sz[k - 1] == 0 && sz[k] == 0)
			{
				break;
			}
		}
		for (k = 0;k < n;k++)
		{
			if (k % 2 == 0 && sz[k] != 0)
			{
				for (i = 2; i <= sz[k]; i++)
				{
					s = (s + sz[k + 1]) % i;
				}
				System.out.printf("%d\n", s + 1);
				s = 0;
				i = 2;
			}
		}
	}

}

