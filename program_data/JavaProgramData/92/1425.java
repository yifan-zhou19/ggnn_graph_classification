package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int[] q = new int[1000];
	public static int[] t = new int[1000];
	public static int res;
	public static int sum = 1;

	public static int mycmp(Object a, Object b)
	{
		return *((int)b) - (int)a;
	}
	public static int Main()
	{
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (int i = 0;i < n;i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(t,n,(Integer.SIZE / Byte.SIZE),mycmp);
			qsort(q,n,(Integer.SIZE / Byte.SIZE),mycmp);
			int x = 0;
			int xx = n - 1;
			int yy = n - 1;
			int y = 0;
			int p = 0;
			int sum = 0;
			while (p < n)
			{
				if (t[x] < q[y])
				{
					sum -= 200;
					y++;
					xx--;
				}
				else if (t[x] == q[y])
				{
					if (t[xx] > q[yy])
					{
						xx--;
						yy--;
						sum += 200;
					}
					else if (t[xx] < q[yy])
					{
						xx--;
						y++;
						sum -= 200;
					}
					else if (t[xx] == q[yy])
					{
						if (t[xx] == q[y])
						{
							xx--;
							y++;
						}
						else
						{
							sum -= 200;
							xx--;
							y++;
						}
					}
				}
				else if (t[x] > q[y])
				{
					x++;
					y++;
					sum += 200;
				}
				p++;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
	}

}

