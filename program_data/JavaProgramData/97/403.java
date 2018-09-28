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
	System.out.printf("%d",n / 100);
	if ((n % 100) / 10 == 9)
	{
		System.out.print("\n1\n2\n0");
	}
		else if ((n % 100) / 10 == 8)
		{
			System.out.print("\n1\n1\n1");
		}
			else if ((n % 100) / 10 == 7)
			{
			System.out.print("\n1\n1\n0");
			}
			else if ((n % 100) / 10 == 6)
			{
		   System.out.print("\n1\n0\n1");
			}
			else if ((n % 100) / 10 == 5)
			{
	System.out.print("\n1\n0\n0");
			}
			else if ((n % 100) / 10 == 4)
			{
	System.out.print("\n0\n2\n0");
			}
			else if ((n % 100) / 10 == 3)
			{
	System.out.print("\n0\n1\n1");
			}
			else if ((n % 100) / 10 == 2)
			{
	System.out.print("\n0\n1\n0");
			}
	else if ((n % 100) / 10 == 1)
	{
	System.out.print("\n0\n0\n1");
	}
	else
	{
	System.out.print("\n0\n0\n0");
	}
	if ((n % 10) >= 5)
	{
		System.out.printf("\n1\n%d",(n % 10) - 5);
	}
		else
		{
			System.out.printf("\n0\n%d",(n % 10));
		}
		return 0;
	}

}

