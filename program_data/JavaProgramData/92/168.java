package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}

	public static int Main()
	{
		int[] na = new int[1010];
		int[] nb = new int[1010];
		int n;
		while ((n,n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int i;
			int j;
			int r;
			int head = 0;
			int t_tail = n - 1;
			int q_tail = n - 1;
			int result = 0;

			for (i = 0;i < n;i++)
			{
				na[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				nb[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(na,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(nb,n,(Integer.SIZE / Byte.SIZE),cmp);
			for (i = 0;i < n;i++)
			{
				if (na[head] > nb[i])
				{
					head++;
					result++;
				}
				else if (na[head] < nb[i])
				{
					result--;
					t_tail--;
				}
				else
				{
					while (t_tail >= head)
					{
						if (na[t_tail] > nb[q_tail])
						{
							result++;
							t_tail--;
							q_tail--;
						}
						else
						{
							if (na[t_tail] < nb[i])
							{
								result--;
							}
							t_tail--;

							break;
						}
					}
				}
				if (head > t_tail)
				{
					break;
				}
			}
			System.out.print(200 * result);
			System.out.print("\n");
		}
		return 0;
	}
}

