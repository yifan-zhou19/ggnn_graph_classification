package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int i3;
		int i5;
		int i7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		i3 = 0;
		i5 = 0;
		i7 = 0;
		if (a % 3 == 0)
		{
			i3 = 1;
		}
		if (a % 5 == 0)
		{
			i5 = 1;
		}
		if (a % 7 == 0)
		{
			i7 = 1;
		}
		if (i3 == 1)
		{
			System.out.print("3");
			if (i5 == 1)
			{
				System.out.print(" 5");
				if (i7 == 1)
				{
					System.out.print(" 7");
				}
			}
			else if (i7 == 1)
			{
				System.out.print(" 7");
			}
		}
		else if (i5)
		{
			System.out.print("5");
			if (i7 != 0)
			{
				System.out.print(" 7");
			}
		}
		else if (i7)
		{
			System.out.print("7");
		}
		else
		{
			System.out.print("n");
		}
	}
}

