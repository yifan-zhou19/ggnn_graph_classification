package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int n,int k,int x,int i);
		int n;
		int k;
		int m;
		int p;
		int x;
		int i;
		int h;
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
		if (n == 1)
		{
			p = 1;
		}
		else
		{
			for (x = k;;x++)
			{
				h = 0;
				p = f(n, k, x, n);
				m = p;
				 for (i = 0;i < n;i++)
				 {
				  if (m % n == k)
				  {
					m = (m - k) * (n - 1) / n;
					h = h + 1;
				  }
				 }
					 if (h == n)
					 {
						break;
					 }


			}
		}
		System.out.printf("%d",p);
		return 0;
	}
	public static int f(int i,int k,int x,int n)
	{
		int m;
		m = 0;
		if (i == 1)
		{
			m = k + n * x;
		}
		else
		{

			m = k + f(i - 1, k, x, n) * n / (n - 1);
		}

		return (m);
	}
}

