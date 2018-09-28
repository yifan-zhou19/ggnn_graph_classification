package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0)
		{
			System.out.printf("%d %d %d\n",3,5,7);
		}
	else if (x % 3 == 0 && x % 5 == 0)
	{
			System.out.printf("%d %d\n",3,5);
	}
	else if (x % 3 == 0 && x % 7 == 0)
	{
			System.out.printf("%d %d\n",3,7);
	}
	else if (x % 5 == 0 && x % 7 == 0)
	{
			System.out.printf("%d %d",5,7);
	}
		else if (x % 3 == 0)
		{
			System.out.printf("%d",3);
		}
	else if (x % 5 == 0)
	{
			System.out.printf("%d",5);
	}

	else if (x % 7 == 0)

	{
		System.out.printf("%d",7);
	}
	else if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0)
	{
		System.out.print("n");
	}
	}



}

