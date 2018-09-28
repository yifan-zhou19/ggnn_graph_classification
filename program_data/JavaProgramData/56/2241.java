package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i = 10;
		int m;
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
			n = k;
			for (;;)
			{
				m = n % i;
				n = n / i;
				System.out.printf("%d",m);
				if (n == 0)
				{
					break;
				}
			}
	}
}

