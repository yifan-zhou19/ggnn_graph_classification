package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		int n;
		int flag;
		int i;
		int j;
		int bonus;
		int mmax;
		int draw;
		int[] b = new int[1001];
		int[] a = new int[1001];


		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}

			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			mmax = -n;

			qsort(a, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(b, n, (Integer.SIZE / Byte.SIZE), cmp);

			for (i = 0;i < n;i++)
			{
				flag = 0;
				draw = 0;

				for (j = 0;j <= i;j++)
				{
					if (b[j] < a[n - i - 1 + j])
					{
						flag = 1;
					}
					else if (b[j] == a[n - i - 1 + j])
					{
						draw++;
					}
				}
				if (flag == 1)
				{
					continue;
				}

				bonus = i + 1 - draw - (n - i - 1);

				if (bonus > mmax)
				{
					mmax = bonus;
				}
			}

			System.out.print(mmax * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

