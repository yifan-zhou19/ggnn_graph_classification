package <missing>;

public class GlobalMembers
{
	public static int cmp(void a, void b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int sum = 0;
			if (n == 0)
			{
				break;
			}
			int i;
			int[] a = new int[1005];
			int[] b = new int[1005];
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
			int p;
			int q;
			int c;
			int d;
			p = 0;
			c = 0;
			q = n - 1;
			d = n - 1;
			while (n-- != 0)
			{
				if (a[p] > b[c])
				{

					sum = sum + 200;
					p++;
					c++;

				}
				else if (a[q] > b[d])
				{

					sum = sum + 200;
					q--;
					d--;

				}
				else
				{

					if (a[p] < b[d])
					{
					sum = sum - 200;

					}

					if (a[p] > b[d])
					{
						sum = sum + 200;
					}
					p++;
					d--;

				}
			}


			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

