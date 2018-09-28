package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (num % 3 == 0)
		{
			if (num % 5 == 0)
			{
			if (num % 7 == 0)
			{
		System.out.printf("%d %d %d",3,5,7);
			}
		else
		{
			System.out.printf("%d %d",3,5);
		}
			}
		else if (num % 7 == 0)
		{
			System.out.printf("%d %d",3,7);
		}
		else
		{
			System.out.printf("%d",3);
		}
		}
		else
		{
			if (num % 5 == 0)
			{
				if (num % 7 == 0)
				{
			System.out.printf("%d %d",5,7);
				}
			else
			{
				System.out.printf("%d",5);
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
		}
	}





}

