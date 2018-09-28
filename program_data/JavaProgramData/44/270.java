package <missing>;

public class GlobalMembers
{
	public static void fan(int a)
	{
		int j = 1;
		if (a > 0)
		{
			while (a != 0)
			{
			   if (a % 10 || (a % 10 == 0 && j != 1))
			   {
			System.out.print(a % 10,j++);
			   }
			a = a / 10;
			if (a % 10 != 0)
			{
				j++;
			}
			}
		System.out.print("\n");
		}
		if (a = 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}

	}
	public static int Main()
	{
		int i;
		int a;
		for (i = 1;i <= 6;i++) //????
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 0)
			{
				fan(a);
			}
		else
		{
			a = -a,cout << "-",fan(a);
		}
		} //????

	}
}

