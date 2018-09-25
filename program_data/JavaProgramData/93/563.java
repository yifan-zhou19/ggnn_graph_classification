package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		double b;
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
		{
		  System.out.printf("3 5 7\n",b);
		}
		else if (a % 3 == 0 && a % 5 == 0)
		{
		  System.out.printf("3 5\n",b);
		}
		else if (a % 3 == 0 && a % 7 == 0)
		{
			 System.out.printf("3 7\n",b);
		}
		else if (a % 5 == 0 && a % 7 == 0)
		{
			 System.out.printf("5 7\n",b);
		}
		else if (a % 3 == 0)
		{
			 System.out.printf("3\n",b);
		}
		else if (a % 5 == 0)
		{
			 System.out.printf("5\n",b);
		}
		else if (a % 7 == 0)
		{
			 System.out.printf("7\n",b);
		}
		else
		{
			System.out.printf("n",d);
		}
		return 0;
	}
}

