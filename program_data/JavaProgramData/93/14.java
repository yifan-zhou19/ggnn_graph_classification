package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int three;
		int five;
		int seven;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		three = (a % 3 == 0);
		five = (a % 5 == 0);
		seven = (a % 7 == 0);
		sum = three + five + seven;
		if (sum == 3)
		{
			System.out.print("3 5 7");
		}
		if (sum == 2)
		{
			if (three == 1)
			{
				System.out.print("3");
				if (five == 1)
				{
					System.out.print(" 5");
				}
				else
				{
					System.out.print(" 7");
				}
			}
			else
			{
				System.out.print("5 7");
			}
		}
		if (sum == 1)
		{
			if (three == 1)
			{
				System.out.print("3");
			}
			else if (five == 1)
			{
				System.out.print("5");
			}
			else
			{
				System.out.print("7");
			}
		}
		if (sum == 0)
		{
			System.out.print("n");
		}
	}
}

