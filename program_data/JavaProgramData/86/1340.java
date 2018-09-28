package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int q;
		int m = 0;
		int[] time = new int[10];
		int t = 0;
		int sum = 0;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (q = 0;q <= n - 1;q++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (j = 0;j <= k - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			if (k == 0)
			{
				System.out.printf("%d\n",60);
			}
			else
			{
				for (i = 0;i <= k - 1;i++)
				{
					t = a[i] + 3 * i;
					if (t >= 60)
					{
						m++;
						l = i - 1;
						break;

					}
				}
				if (m == 0)
				{
					if ((a[k - 1] + 3 * k) < 60)
					{
					sum = 60 - 3 * k;
					}
					if ((a[k - 1] + 3 * k) >= 60)
					{
						sum = a[k - 1];
					}
				System.out.printf("%d\n",sum);
				}
				else
				{
				if ((a[l] + (l + 1) * 3) <= 60)
				{
					sum = 60 - 3 * (l + 1);
					System.out.printf("%d\n",sum);
				}
				if ((a[l] + (l + 1) * 3) > 60)
				{
					System.out.printf("%d\n",a[l]);
				}
				}
				m = 0;
				t = 0;
				sum = 0;
				l = 0;
			}
		}

		return 0;
	}
}

