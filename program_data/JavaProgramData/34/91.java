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
		while (n != 1)
		{
			if (n % 2 == 0)
			{
		   n = n / 2;
		System.out.printf("%d/2=%d\n",2 * n,n);
		if (n == 1)
		{
		break;
		}
			}
		if (n % 2 != 0)
		{
		   System.out.printf("%d*3+1=%d\n",n,3 * n + 1);
		n = n * 3 + 1;
		if (n == 1)
		{
		break;
		}
		}
		}
	System.out.print("End");
	System.in.read();
	System.in.read();
	return 0;
	}

}

