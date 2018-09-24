package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[101][101];
	public static int[][] mem = new int[101][101];
	public static int[][] sx = new int[2][10001];
	public static int[][] sy = new int[2][10001];
	public static int sum = 0;
	public static int p = 0;
	public static void fuck(int x,int y)
	{
		int e;
		int f;
		int i;
		int j;
		e = sx[(x + 1) % 2][y];
		f = sy[(x + 1) % 2][y];
		if (a[e-1][f] == 1 && mem[e-1][f] == 0)
		{
			sum++;
			sx[x % 2][sum] = e-1;
			sy[x % 2][sum] = f;
			mem[e-1][f] = 1;
			//cout<<e-1<<' '<<f<<endl;
			p++;
		}
		if (a[e+1][f] == 1 && mem[e+1][f] == 0)
		{
			sum++;
			sx[x % 2][sum] = e+1;
			sy[x % 2][sum] = f;
			mem[e+1][f] = 1;
			//cout<<e+1<<' '<<f<<endl;
			p++;
		}
		if (a[e][f - 1] == 1 && mem[e][f - 1] == 0)
		{
			sum++;
			sx[x % 2][sum] = e;
			sy[x % 2][sum] = f - 1;
			mem[e][f - 1] = 1;
			//cout<<e<<' '<<f-1<<endl;
			p++;
		}
		if (a[e][f + 1] == 1 && mem[e][f + 1] == 0)
		{
			sum++;
			sx[x % 2][sum] = e;
			sy[x % 2][sum] = f + 1;
			mem[e][f + 1] = 1;
			//cout<<e<<' '<<f+1<<endl;
			p++;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int t;
		char c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				cin.get(c);
				if (c == '.' || c == '@')
				{
					a[i][j] = 1;
				}
				if (c == '@')
				{
					mem[i][j] = 1;
					sum++;
					sx[0][sum] = i;
					sy[0][sum] = j;
					p++;
				}
			}
			System.in.read();
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m - 1;i++)
		{
			t = sum;
			sum = 0;
			for (j = 1;j <= t;j++)
			{
				fuck(i, j);
			}
		}
		System.out.print(p);
		return 0;
	}
}

