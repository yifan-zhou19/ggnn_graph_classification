package <missing>;

public class GlobalMembers
{
	public static int compare(Object p1, Object p2)
	{
		return *(int)p1 - (int)p2;
	}

	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];

		while (scanf("%d", n) && n != 0)
		{
			int res = 0;
			int a1 = 0;
			int a2 = n - 1;
			int b1 = 0;
			int b2 = n - 1;

			for (i = 0; i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}

			qsort(a, n, (Integer.SIZE / Byte.SIZE), compare);
			qsort(b, n, (Integer.SIZE / Byte.SIZE), compare);

			for (i = 0; i < n; i++)
			{
				if (a[a1] > b[b1])
				{
					res++;
					a1++;
					b1++;
				}
				else if (a[a2] > b[b2])
				{
					res++;
					a2--;
					b2--;
				}
				else
				{
					if (a[a1] > b[b2])
					{
						res++;
					}
					else if (a[a1] < b[b2])
					{
						res--;
					}
					else
					{
						;
					}
					a1++;
					b2--;

				}
			}

			System.out.printf("%d\n", res * 200);
		}
	}
}

