package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			if (n % 2 != 0)
			{
				System.out.printf("%d*3+1=%d\n",n,3 * n + 1);
				n = 3 * n + 1;
			}
			else
			{
				System.out.printf("%d/2=%d\n",n,n / 2);
				n /= 2;
			}
		}
	}


}

