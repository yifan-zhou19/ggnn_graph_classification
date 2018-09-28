package <missing>;

public class GlobalMembers
{
	public static int mycompare(Object e1, Object e2)
	{
		if ((int)e1 < (int)e2)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			int[] a = new int[1000];
			int[] b = new int[1000];
			for (int i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(a,n,(Integer.SIZE / Byte.SIZE),mycompare);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),mycompare);

			int begin_a = 0;
			int begin_b = 0;
			int end_a = n - 1;
			int end_b = n - 1;
			int win = 0;

			while (begin_a <= end_a)
			{
				if (a[end_a] > b[end_b])
				{
					win++;
					end_a--;
					end_b--;
				}
				else if (a[end_a] < b[end_b])
				{
					win--;
					end_a--;
					begin_b++;
				}
				else
				{
					if (a[begin_a] > b[begin_b])
					{
						win++;
						begin_a++;
						begin_b++;
					}
					else
					{
						if (a[end_a] < b[begin_b])
						{
							win--;
						}
						end_a--;
						begin_b++;
					}

				}
			}
			System.out.print(win * 200);
			System.out.print("\n");
		}
	}
}

