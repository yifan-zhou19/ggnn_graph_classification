package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else if (n > 1)
		{
		while (true)
		{
			if (n % 2 == 0)
			{
				a = n;
				n = a / 2;
				System.out.printf("%d/2=%d\n",a,n);
				if (n == 1)
				{
					System.out.print("End\n");
					return 0;
				}
			}
			else
			{
				a = n;
				n = a * 3 + 1;
				System.out.printf("%d*3+1=%d\n",a,n);
				if (n == 1)
				{
					System.out.print("End");
					return 0;
				}
			}
		}
		}
		return 0;
	}


}

