package <missing>;

public class GlobalMembers
{
	public static int f(int n,int m)
	{
		int i;
		int sushu;
		int j;
		sushu = 0;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				sushu = -1;
			}

		}
		if (sushu == 0)
		{
			for (j = 2;j <= Math.sqrt(m - n);j++)
			{
				if ((m - n) % j == 0)
				{
					sushu = -1;
				}
			}
		}
		if (sushu == 0)
		{
			System.out.printf("%d %d\n",n,m - n);
		}
	}


	public static int Main()

	{
		int exp;
		int c;
		int b;
		int[] a = new int[100];
		int days;
		int w;
		int m;
		int i;
		int t;
		int T;
		int n;
		int s;
		int t2;
		int j;
		int k;
		int len;
		int x;
		int y;
		int ip;
		int u;

		int e;
		int p;
		int q;
		int r;
		int sp;
		int sq;
		int sr;

		double d;
		double h;
		double[] g = new double[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
			f(i, m);
		}
		return 0;
	}

}

