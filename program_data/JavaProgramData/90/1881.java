package <missing>;

public class GlobalMembers
{
		public static int f(int n,int a)
		{
			int j;
			int r;
			if (n == 0)
			{
				return 1;
			}
			else if (a == 1)
			{
				return 1;
			}
			if (n < a)
			{
				return f(n, n);
			}
			else
			{
				return (f(n, a - 1) + f(n - a, a));
			}
		}
		public static int Main()
		{
			int M;
			int N;
			int m;
			int i;
			int a;
			int b;
			int c;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			for (i = 0;i < m;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					M = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					N = Integer.parseInt(tempVar3);
				}
				b = f(M, N);
				System.out.printf("%d\n",b);
			}
			return 0;
		}
}

