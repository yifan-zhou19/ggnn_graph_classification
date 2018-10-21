package <missing>;

public class GlobalMembers
{
	public static int[][] data = new int[2][1000];
	public static int cmp(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p1 = (int *)e1;
		int p1 = (int)e1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p2 = (int *)e2;
		int p2 = (int)e2;
		return p2 - p1;
	}
	public static int Main()
	{
		int n;
		int ans;
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			ans = 0;
			for (int i = 0;i < n;i++)
			{
				data[0][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
				data[1][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(data[0],n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(data[1],n,(Integer.SIZE / Byte.SIZE),cmp);
			int[] b = new int[2];
			int[] e = new int[2];
			b[0] = b[1] = 0;
			e[0] = e[1] = n - 1;
			while (b[0] <= e[0])
			{
				if (data[0][b[0]] > data[1][b[1]])
				{
					b[0]++;
					b[1]++;
					ans += 200;
				}
				else
				{
					for (;data[0][e[0]] > data[1][e[1]];e[0]--,e[1]--,ans += 200)
					{
						;
					}
					if (data[0][e[0]] < data[1][b[1]])
					{
						ans -= 200;
					}
					b[1]++;
					e[0]--;
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

