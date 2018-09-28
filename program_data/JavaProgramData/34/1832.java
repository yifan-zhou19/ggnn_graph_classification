package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
			return 0;
		}
		s = n;
		for (r = 1;s != 1;r++)
		{
			if (n % 2 != 0)
			{
				s = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,s);
				n = s;
			}
			else if (n % 2 == 0)
			{
				s = n / 2;
				System.out.printf("%d/2=%d\n",n,s);
				n = s;
			}
		}
		System.out.print("End");
		return 0;
	}
}

