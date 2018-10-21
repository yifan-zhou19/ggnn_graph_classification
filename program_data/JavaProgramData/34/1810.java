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
		for (;n != 1;)
		{
		if (n % 2 == 0)
		{
		System.out.printf("%d/%d=%d\n",n,2,n / 2);
		n = n / 2;
		}
		else
		{
		System.out.printf("%d*%d+%d=%d\n",n,3,1,n * 3 + 1);
		n = n * 3 + 1;
		}
		}
		if (n == 1)
		{
		System.out.print("End");
		}
	  return 0;
	}

}

