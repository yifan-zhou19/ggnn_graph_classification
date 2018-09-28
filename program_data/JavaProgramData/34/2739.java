package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
		if (n % 2 == 0 && n != 1)
		{
			m = n / 2;
			System.out.printf("%d/2=%d\n",n,m);
			n = m;
		}
		if (n % 2 != 0 && n != 1)
		{
			m = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,m);
			n = m;
		}
		if (n == 1)
		{
			System.out.print("End");
				  break;
		}
		}
	}

}

