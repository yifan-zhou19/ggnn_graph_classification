package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			if (n == 1)
			{
				break;
			}
			if (n % 2 == 0)
			{
				n = n / 2;
				System.out.printf("%d/2=%d\n",2 * n,n);
			}
			else
			{
				n = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",(n - 1) / 3,n);
			}
		}
		System.out.print("End\n");
		return 0;
	}

}

