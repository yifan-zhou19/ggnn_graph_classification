package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int cmp(Object a, Object b)
	{
		return ((int)a) - ((int)b);
	}
	public static int Main()
	{
		int n;
		while (true)
		{
			int sum = 0;
			int i;
			int j;
			int end1;
			int end2;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(b, n, (Integer.SIZE / Byte.SIZE), cmp);
			j = 0;
			for (i = j = n - 1, end1 = end2 = 0;j >= end2 != 0 && i >= end1;j--)
			{
				if (a[i] > b[j])
				{
					sum++;
					i--;
				}
				else if (a[i] < b[j])
				{
					sum--;
					end1++;
				}
				else
				{
					if (a[end1] > b[end2]) //a??????b????
					{
						sum++;
						end1++;
						end2++;
						j++;
					}
					else if (a[end1] < b[end2])
					{
						sum--;
						end1++;
					}
					else
					{
						if (a[end1] == b[j])
						{
							end1++;
						}
						else
						{
							sum--;
							end1++;

						}

					}
				}
			}
			System.out.print(sum * 200);
			System.out.print("\n");
		}
		return 0;
	}

}

