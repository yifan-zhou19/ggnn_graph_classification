package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int max1;
		int max2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		max1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (max1 < a)
		{
			max2 = max1;
			max1 = a;
		}
		else
		{
			max2 = a;
		}
		for (int i = 2;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a > max1)
			{
				max2 = max1;
				max1 = a;
			}
			else if (a > max2)
			{
				max2 = a;
			}
		}
		System.out.print(max1);
		System.out.print("\n");
		System.out.print(max2);
		System.out.print("\n");
		return 0;
	}

}

