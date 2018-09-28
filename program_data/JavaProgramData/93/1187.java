package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int k = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num % 3 == 0)
		{
			System.out.print("3");
		}
		else
		{
			k++;
		}
		if (num % 5 == 0)
		{
			if (k == 1)
			{
				System.out.print("5");
			}
			else
			{
				System.out.print(" 5");
			}
		}
		else
		{
			k++;
		}
		if (num % 7 == 0)
		{
			if (k == 2)
			{
				System.out.print("7");
			}
			else
			{
				System.out.print(" 7");
			}
		}
		else
		{
			k++;
		}
		if (k == 3)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		else
		{
			System.out.print("\n");
		}
		return 0;
	}
}

