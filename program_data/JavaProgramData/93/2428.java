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
		if ((n % 3 == 0) && (n % 5 == 0) && (n % 7 == 0))
		{
			System.out.printf("%d %d %d", 3, 5, 7);
		}
		else if ((n % 3 == 0) && (n % 5 == 0) && (n % 7 != 0))
		{
			System.out.printf("%d %d", 3, 5);
		}
		else if ((n % 3 != 0) && (n % 5 == 0) && (n % 7 == 0))
		{
			System.out.printf("%d %d", 5, 7);
		}
		else if ((n % 3 == 0) && (n % 5 != 0) && (n % 7 == 0))
		{
			System.out.printf("%d %d", 3, 7);
		}
		else if ((n % 3 == 0) && (n % 5 != 0) && (n % 7 != 0))
		{
			System.out.printf("%d", 3);
		}
		else if ((n % 3 != 0) && (n % 5 == 0) && (n % 7 != 0))
		{
			System.out.printf("%d", 5);
		}
		else if ((n % 3 != 0) && (n % 5 != 0) && (n % 7 == 0))
		{
			System.out.printf("%d", 7);
		}
		else
		{
			System.out.print("n");
		}
		return 0;
	}

}

