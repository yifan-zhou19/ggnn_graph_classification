package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
			int n;
			int k;
			int m;
			int apple = new int(int n,int k);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			m = apple(n, k);
			System.out.printf("%d",m);
	}

			public static int apple(int n,int k)
			{

				int m;
				int rest;
				int i;

				for (rest = 1,i = 1;i <= n;i++)
				{
				if (i == 1)
				{
					m = rest * n + k;
				}
				else if (m % (n - 1) == 0)
				{
				m = m * n / (n - 1) + k;
				}
				else
				{
					rest++;
					i = 0;
				}
				}
				return m;
			}
}

