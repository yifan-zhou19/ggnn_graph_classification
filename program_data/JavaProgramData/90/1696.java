package <missing>;

public class GlobalMembers
{
	public static int make(int m,int n,int x)
	{
		int i;
		int s;
		if (m == 0)
		{
			if (n == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			s = 0;
			for (i = x;i <= n;i++)
			{
				s = s + make(m - 1, n - i, i);
			}
			return s;
		}
	}
	public static int Main()
	{
		int i;
		int k;
		int j;
		int p;
		int n;
		int t;
		int[][] a = new int[100][100];
		int m;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (p = 1;p <= t;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			x = make(n, m, 0);
			System.out.printf("%d\n",x);
			/*a[0][0]=1;
			for (i=1;i<=m;i++)
			for (j=0;j<=n;j++)
			{
				a[i][j]=0;
				for (k=0;k<=j;k++)
				a[i][j]+=a[i-1][k];
			}
			printf("%d\n",a[m][n]);*/
		}
	}
}

