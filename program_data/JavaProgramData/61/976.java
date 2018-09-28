package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zu;
		zu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= zu;i++)
		{
			int j;
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			switch (j)
			{
			case 1:
				System.out.print(1);
				System.out.print("\n");
				break;
			case 2:
				System.out.print(1);
				System.out.print("\n");
				break;
			default:
			{
				int x1 = 1;
				int x2 = 1;
				for (int k = 3;k <= j;k++)
				{
					x2 = x1 + x2;
					x1 = x2 - x1;
				}
				System.out.print(x2);
				System.out.print("\n");
			}
			}
		}
		return 0;
	}

}

