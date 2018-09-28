package <missing>;

public class GlobalMembers
{
	public static void swapInt(tangible.RefObject<Integer> p, tangible.RefObject<Integer> q)
	{
		int t = p.argValue;
		p.argValue = q.argValue;
		q.argValue = t;
	}

	public static int inside(int n,int m)
	{
		return n >= 0 && m >= 0 && n < N && m < N;
	}

	public static void read(int[][] a, tangible.RefObject<Integer> p, tangible.RefObject<Integer> q)
	{
		int i;
		int j;
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(a + i) + j = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p.argValue = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q.argValue = Integer.parseInt(tempVar3);
		}
	}

	public static int swapMatrixRow(int[] a, int n, int m)
	{
		int i;
		if (inside(n, m) == 0)
		{
			return 0;
		}
		for (i = 0;i < N;i++)
		{
			swapInt(a[n] + i, a[m] + i);
		}
		return 1;
	}

	public static void out(int[][] a)
	{
		int i;
		int j;
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N;j++)
			{
				System.out.printf("%d%s",*(*(a + i) + j),j == N - 1?"\n":" ");
			}
		}
	}

	public static int Main()
	{
		int[][] a = new int[N][N];
		int n;
		int m;
	tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
	tangible.RefObject<Integer> tempRef_m = new tangible.RefObject<Integer>(m);
		read(a, tempRef_n, tempRef_m);
		m = tempRef_m.argValue;
		n = tempRef_n.argValue;
		if (swapMatrixRow(a, n, m) != 0)
		{
			out(a);
		}
		else
		{
			System.out.print("error");
		}
		return 0;

	}
}

