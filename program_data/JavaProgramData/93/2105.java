package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if ((n % 3 == 0) && (n % 5 == 0) && (n % 7 == 0))
		{
			System.out.printf("%d %d %d\n",3,5,7);
		}
		else if ((n % 3 == 0) && (n % 5 == 0) && (n % 7 != 0))
		{
			System.out.printf("%d %d\n",3,5);
		}
		else if ((n % 3 == 0) && (n % 5 != 0) && (n % 7 == 0))
		{
			System.out.printf("%d %d\n",3,7);
		}
		else if ((n % 3 != 0) && (n % 5 == 0) && (n % 7 == 0))
		{
			System.out.printf("%d %d\n",5,7);
		}
		else if ((n % 3 == 0) && (n % 5 != 0) && (n % 7 != 0))
		{
			System.out.printf("%d\n",3);
		}
		else if ((n % 3 != 0) && (n % 5 == 0) && (n % 7 != 0))
		{
			System.out.printf("%d\n",5);
		}
		else if ((n % 3 != 0) && (n % 5 != 0) && (n % 7 == 0))
		{
			System.out.printf("%d\n",7);
		}
		else if ((n % 3 != 0) && (n % 5 != 0) && (n % 7 != 0))
		{
			System.out.print("n\n");
		}
	}
}

