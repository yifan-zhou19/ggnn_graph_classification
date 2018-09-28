package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % 3 == 0)
		{
			System.out.printf("%d",3);
		for (i = 5;i <= 7;i = i + 2)
		{
			if (x % i == 0)
			{
				System.out.printf(" %d",i);
			}
		}
		}
		else
		{
			if (x % 5 == 0)
			{
				System.out.printf("%d",5);
			 if (x % 7 == 0)
			 {
				 System.out.printf(" %d",7);
			 }
			}
		else if (x % 7 == 0)
		{
			System.out.printf("%d",7);
		}
		}

			if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0)
			{
				System.out.print("n");
			}
			System.out.print("\n");
	}
}

