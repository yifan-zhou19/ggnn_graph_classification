package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			int num;
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num == 1 || num == 2)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				int f1;
				int f2;
				int result;
				f1 = 1;
				f2 = 1;
				while (num > 2)
				{
					result = f1 + f2;
					f1 = f2;
					f2 = result;
					num--;
				}
				System.out.print(result);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

