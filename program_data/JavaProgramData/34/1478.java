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
			if (n % 2 != 0)
			{
				System.out.printf("%d*3+1=",n);
				n = n * 3 + 1;
				System.out.printf("%d\n",n);
			}
			else
			{
				System.out.printf("%d/2=",n);
				n /= 2;
				System.out.printf("%d\n",n);
			}
		}
		System.out.print("End");
		return 0;
	}
}

