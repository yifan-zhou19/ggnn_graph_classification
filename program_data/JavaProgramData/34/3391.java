package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m != 1)
		{
		do
		{
			r = m % 2;
			n = m;
			if (r != 0)
			{
				m = m * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,m);
			}
			if (r == 0)
			{
				m = m / 2;
				System.out.printf("%d/2=%d\n",n,m);
			}
		}while (m != 1);
		}
		System.out.print("End");
	}
}

