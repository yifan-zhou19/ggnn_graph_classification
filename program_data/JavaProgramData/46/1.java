package <missing>;

public class GlobalMembers
{
	///#define main xmain


	public static int[][] a = new int[MAX][MAX];


	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		int rs = 0;
		int re = m - 1;
		int cs = 0;
		int ce = n - 1;
		while (re >= rs != 0 && ce >= cs)
		{
			if (re > rs)
			{
				if (ce > cs)
				{
					for (j = cs; j <= ce; j++)
					{
						System.out.printf("%d\n", a[rs][j]);
					}
					for (i = rs + 1; i <= re; i++)
					{
						System.out.printf("%d\n", a[i][ce]);
					}
					for (j = ce-1; j >= cs; j--)
					{
						System.out.printf("%d\n", a[re][j]);
					}
					for (i = re-1; i > rs; i--)
					{
						System.out.printf("%d\n", a[i][cs]);
					}
				}
				else if (ce == cs)
				{
					for (i = rs; i <= re; i++)
					{
						System.out.printf("%d\n", a[i][cs]);
					}
				}
			}
			else if (re == rs)
			{
				for (j = cs; j <= ce; j++)
				{
					System.out.printf("%d\n", a[rs][j]);
				}
			}
			re--;
			rs++;
			ce--;
			cs++;
		}
		return 0;
	}




	public static int[][] mn =
	{
		{23, 23},
		{44, 44},
		{23, 44},
		{44, 23},
		{3, 4},
		{4, 3},
		{1, 1},
		{1, 99},
		{99, 1},
		{99, 99}
	};

	public static int xn = 0;

//C++ TO JAVA CONVERTER WARNING: This 'sizeof' ratio was replaced with a direct reference to the array length:
//ORIGINAL LINE: int max_files = sizeof(mn) / sizeof(mn[0]);
	public static int max_files = mn.length;

	public static String output_dir = "data";

	public static int rnd(int min, int max)
	{
		return min + ((tangible.RandomNumbers.nextNumber() << 15) | tangible.RandomNumbers.nextNumber()) % (max - min + 1);
	}

	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		int t;
		t = a.argValue;
		a.argValue = b.argValue;
		b.argValue = t;
	}

	public static void fill(int[][] a, int m, int n)
	{
		int i;
		int j;
		int count = rnd(1, 10);
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = count++;
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				int i1 = rnd(0, m - 1);
				int j1 = rnd(0, n - 1);
				int i2 = rnd(0, m - 1);
				int j2 = rnd(0, n - 1);
				swap(a[i1][j1], a[i2][j2]);
			}
		}
	}

	public static void print(int[][] a, int m, int n)
	{
		int count = 0;
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.printf("%d", a[i][j]);
				if (j == n - 1)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
	}

	public static void xbuild()
	{
		System.out.printf("%d %d\n", mn[xn][0], mn[xn][1]);
		fill(a, mn[xn][0], mn[xn][1]);
		print(a, mn[xn][0], mn[xn][1]);
		xn++;
	}

}

