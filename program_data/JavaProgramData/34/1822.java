package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;)
		{
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			if (n % 2 != 0)
			{
				m = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,m);
				i = n;
				n = m;
				m = i;
			}
			if (n % 2 == 0)
			{
				m = n / 2;
				System.out.printf("%d/2=%d\n",n,m);
				i = n;
				n = m;
				m = i;
			}
		}
		return 0;
	}
}

