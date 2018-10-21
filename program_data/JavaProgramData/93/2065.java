package <missing>;

public class GlobalMembers
{
	public static void Main()
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
		}
		if (num % 5 == 0)
		{
			if (num % 3 == 0)
			{
				System.out.print(" 5");
			}
			if (num % 3 != 0)
			{
				System.out.print("5");
			}
		}
		if (num % 7 == 0)
		{
			if (num % 3 == 0 || num % 5 == 0)
			{
				System.out.print(" 7");
			}
			if (num % 3 != 0 && num % 5 != 0)
			{
				System.out.print("7");
			}
		}
		if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
		{
			System.out.print("n");
		}
	}
}

