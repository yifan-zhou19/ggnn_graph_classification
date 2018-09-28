package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int num = 0;
		for (i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (i == 0)
			{
			num = num + a.length();
			}
			else
			{
				num = num + 1 + a.length();
			}
			if (num <= 80)
			{
				if (i == 0)
				{
					System.out.print(a);
				}
				else
				{
					System.out.print(" ");
					System.out.print(a);
				}
			}
			else
			{
				System.out.print("\n");
				System.out.print(a);
				num = a.length();
			}
		}
			return 0;
	}

}

