package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		if (n != 1)
		{
			while (n != 1)
			{
				if (n % 2 == 0)
				{
				  m = n / 2;
				  System.out.printf("%d/2=%d\n",n,m);
				}
				if (n % 2 != 0)
				{
				  m = n * 3 + 1;
				  System.out.printf("%d*3+1=%d\n",n,m);
				}
				n = m;
			}
			System.out.print("End");
		}
	}
}

