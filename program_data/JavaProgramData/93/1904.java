package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (num % 3 == 0)
		{
			System.out.print("3");
			if (num % 5 == 0)
			{
				System.out.printf(" %d",5);
				if (num % 7 == 0)
				{
					System.out.printf(" %d",7);
				}
			}
			else if (num % 7 == 0)
			{
				System.out.printf(" %d",7);
			}
		}
		else if (num % 5 == 0)
		{
				System.out.printf("%d",5);
				if (num % 7 == 0)
				{
					System.out.printf(" %d",7);
				}
		}
		else if (num % 7 == 0)
		{
				System.out.printf("%d",7);
		}
		else
		{
			System.out.print("n");
		}
		return 0;
	}

}

