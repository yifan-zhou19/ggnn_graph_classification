package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		if (num % 3 == 0)
		{
			System.out.print("3");
			i = 1;
		}
		if (num % 5 == 0)
		{
			if (i == 1)
			{
			System.out.print(" ");
		System.out.print("5");
			}
		else if (i == 0)
		{
			System.out.print("5");
		}
		j = 1;
		}
		if (num % 7 == 0)
		{
			if (i == 1 || j == 1)
			{
			System.out.print(" ");
		System.out.print("7");
			}
		else
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

