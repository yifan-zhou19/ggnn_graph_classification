package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int rn = 0;
		int r = 0;
		int i = 0;
		int j = 0;
		int a;
		int l = 0;
		int num;
		int k = -1;
		int[] re = new int[1000];

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
			l = 0;
			for (j = 2;j < i;j++)
			{
				a = i % j;
				if (a == 0)
				{
					l++;
				}

			}
			if (l == 0)
			{
				rn = 0;
				r = 0;
				num = i;
				while (num != 0)
				{
				  r = num % 10;
				  rn *= 10;
				  rn += r;
				  num /= 10;
				}
				if (rn == i)
				{
					k++;
					re[k] = i;

				}
			}
		}
		if (k == -1)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i <= k;i++)
			{
				if (i == k)
				{
					System.out.printf("%d",re[k]);
				}
				else
				{
					System.out.printf("%d,",re[i]);
				}
			}
		}


	}
}

