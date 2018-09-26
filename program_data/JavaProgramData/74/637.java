package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			int i;
			int j;
			int m;
			int n;
			int[] a = new int[10000];
			int sum = 0;
			int k = 0;
			int[] b = new int[10000];
			int P;
			int r = 0;
			int t;
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
		for (i = m;i <= n;i++)
		{
			sum = 0;
			P = i;
			for (j = 0;;j++)
			{
				t = P % 10;
				P = P / 10;
				sum = sum * 10 + t;
				if (P == 0)
				{
								break;
				}
			}
			if (sum == i)
			{
				a[k] = i;
				k++;
			}

		}


		for (i = 0;i < k;i++)
		{
			for (j = 2;j < a[i];j++)
			{
				if (a[i] % j == 0)
				{
					break;
				}
			}

				if (j == a[i])
				{
					b[r] = a[i];
					r++;
				}

		}

		if (r == 0)
		{
			System.out.print("no\n");
		}

				for (i = 0;i < r;i++)
				{
					if (i != (r - 1))
					{
						System.out.printf("%d,",b[i]);
					}
					else
					{
						System.out.printf("%d",b[i]);
					}
				}
	}

}

