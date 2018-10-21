package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int total;
		int final;
		int count = 0;

		int calc = new int(int total, int n, int k);

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

		for (final = k; ; final++)
		{
				  count = 0;
				  total = final * n + k;
				  if (total % n == k)
				  {
								 count++;
				  }

				  for (i = 2; i <= n; i++)
				  {
						total = calc(total, n, k);

						if (total % n == k)
						{
								 count++;
						}
				  }

				  if (count == n)
				  {
						   System.out.printf("%d", total);
						   break;
				  }

		}

		   return 0;
	}

	public static int calc(int total, int n, int k)
	{
		return (total * n / (n - 1) + k);
	}








}

