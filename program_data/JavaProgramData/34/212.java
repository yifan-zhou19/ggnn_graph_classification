package <missing>;

public class GlobalMembers
{
	//this program shows the proeess of jiaogu
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;;)
		{
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
			if (n % 2 == 0)
			{
				n /= 2;
				System.out.printf("%d/2=%d\n",2 * n,n);
				continue;
			}
			if (n % 2 != 0)
			{
				System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
				n = 3 * n + 1;
				continue;
			}

		}
		return 0;
	}
}

