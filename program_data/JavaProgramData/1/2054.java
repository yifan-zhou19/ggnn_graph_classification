package <missing>;

public class GlobalMembers
{
	public static int number(int m,int x)
	{
		int a;
		int b;
		int c;
		int n;
		int l;
		int k;
		int r;
		k = (int)Math.sqrt(m);
		if (x > m)
		{
			return 0;
		}
		else if (x > k)
		{
			return 1;
		}
		else
		{
			l = 1;
			for (a = x;a <= k;a++)
			{
			if (m % a == 0)
			{
			l = l + number(m / a, a);
			}
			else
			{
				;
			}
			}
			return l;
		}
	}

	public static int Main()
	{
		 int n;
		 int a;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (a = 1;a <= n;a++)
		 {
				int m;
				int b;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
				b = number(m, 2);
				System.out.printf("%d\n",b);
		 }
	}
}

