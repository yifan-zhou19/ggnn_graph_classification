package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			t = n;
		}

		else if (n % 2 == 0)
		{
			t = n / 2;
			System.out.printf("%d/2=%d\n",n,t);
		}
		else if (n != 1 && n % 2 != 0)
		{
			t = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,t);
		}
		while (t != 1)
		{
			if (t % 2 == 0)
			{
				m = t / 2;
				System.out.printf("%d/2=%d\n",t,m);
				t = m;
			}
			else
			{
				m = t * 3 + 1;
				System.out.printf("%d*3+1=%d\n",t,m);
				t = m;
			}
		}
		System.out.print("End");
		return 0;
	}
}

