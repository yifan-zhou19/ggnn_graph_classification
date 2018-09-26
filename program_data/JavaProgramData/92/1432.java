package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c = (int *)a;
		int c = (int)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *d = (int *)b;
		int d = (int)b;
		return c - d;
	}

	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				return 0;
			}
			int[] a = new int[1005];
			int[] b = new int[1005];
			int i;
			for (i = 0; i < n; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; i < n; i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(a, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(b, n, (Integer.SIZE / Byte.SIZE), cmp);

			int pi;
			int pj;
			int qi;
			int qj;
			pi = qi = 0;
			pj = qj = n - 1;

			int sum = 0;
			while (n-- != 0)
			{
				if (a[pi] > b[qi])
				{
					sum += 200;
					pi++;
					qi++;
				}
				else if (a[pj] > b[qj])
				{
					sum += 200;
					pj--;
					qj--;
				}
				else
				{
					if (a[pi] < b[qj])
					{
						sum -= 200;
					}
					pi++;
					qj--;
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

