package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int t;
		int m;
		for (;;)
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

			t = 0;
			for (i = 0;i < n - 1;i++)
			{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] < a[j + 1])
				{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
				}
			}
			}
			t = 0;
			for (i = 0;i < n - 1;i++)
			{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (b[j] < b[j + 1])
				{
				t = b[j];
				b[j] = b[j + 1];
				b[j + 1] = t;
				}
			}
			}

			m = 0;
			for (;n > 0;n--)
			{
				//1 
				if (a[0] > b[0])
				{
					m++;
					for (i = 0;i < n - 1;i++)
					{
						a[i] = a[i + 1];
						b[i] = b[i + 1];
					}
				}
				//2
				else if (a[0] < b[0])
				{
					m--;
					for (i = 0;i < n - 1;i++)
					{
						b[i] = b[i + 1];
					}
				}
				//3
				else if (a[0] == b[0] && a[n - 1] > b[n - 1])
				{
					m++;
				}
				//4
				else if (a[0] == b[0] && a[n - 1] <= b[n - 1])
				{
					if (a[n - 1] < b[0])
					{
						m--;
					}
					for (i = 0;i < n - 1;i++)
					{
						b[i] = b[i + 1];
					}
				}

			}
			System.out.printf("%d\n",200 * m);
		}

		return 0;
	}

}

