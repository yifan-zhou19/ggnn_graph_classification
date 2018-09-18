package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[102][102];
		int i;
		int k;
		int j;
		int l;
		int n;
		int s;
		(int)(*p)[102];
		(int)(*q)[102];
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1 ; k <= n ; k++)
		{
		for (i = 0, s = 0, p = a[0] ; i < n ; i++)
		{
			for (j = 0 ; j < n ; j++)
			{
				*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0, p = a[0], q = a[n] ; i < n ; i++)
		{
			*(*q + i) = *(*p + i);
		}
		for (i = 0, p = a[1] ; i < n ; i++)
		{
			*(*(p + i) + n) = **(p + i);
		}
		for (l = 1 ; l < n ; l++)
		{
			for (i = l, p = a[0] ; i <= n ; i++)
			{
				for (j = l + 1, min = (*(p + i) + l) ; j <= n ; j++)
				{
					if (*(*(p + i) + j) < min)
					{
						min = (*(p + i) + j);
					}
				}
				for (j = l; j <= n ; j++)
				{
					*(*(p + i) + j) -= min;
				}
			}
			for (i = l, p = a[0] ; i <= n ; i++)
			{
				for (j = l + 1, min = (*(p + l) + i) ; j <= n ; j++)
				{
					if (*(*(p + j) + i) < min)
					{
						min = (*(p + j) + i);
					}
				}
				for (j = l ; j <= n ; j++)
				{
					*(*(p + j) + i) -= min;
				}
			}
			s += *(*(p + l) + l);
		}
		System.out.print(s);
		System.out.print("\n");
		}
		return 0;
	}

}

