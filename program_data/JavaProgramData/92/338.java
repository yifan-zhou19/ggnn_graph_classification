package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int t;
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] < a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}


	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int k;
		int x;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int[] d = new int[1000];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			sum = 0;
			k = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n;i++)
			{
				c[i] = 1;
				d[i] = 1;
			}

			x = a[0];
			for (i = 0;i < n;i++) //????????????
			{
				if (a[i] != x || b[i] != x)
				{
					break;
				}
			}
			if (i == n)
			{

				System.out.printf("%d\n",sum);
				continue;


			}
			sort(a, n); //???a?b??
			sort(b, n);

			for (i = n - 1;i >= 0;i--)
			{
				for (j = 0;j < n;j++)
				{
					if ((a[i] > b[j]) && (c[j] != 0))
					{
						sum += 200;
					k++;
					c[j] = 0;
					d[i] = 0;
					break;
					}
				}
			}
			sum = sum - (n - k) * 200;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i] == b[j] && c[j] != 0 && d[i] != 0)
					{
						sum += 200;
					c[j] = 0;
					d[i] = 0;
					}
				}
			}
			System.out.printf("%d\n",sum);
		}

			return 0;
	}

}

