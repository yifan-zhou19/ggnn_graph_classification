package <missing>;

public class GlobalMembers
{
	public static int jiaogu(int a)
	{
		if (a == 1)
		{
			return 1;
		}
		else if (a % 2 == 0)
		{
			System.out.print(a);
			System.out.print("/2=");
			return a / 2;
		}
		else
		{
			System.out.print(a);
			System.out.print("*3+1=");
			return a * 3 + 1;
		}
	}

	public static int Main()
	{
		int a;
		int i;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			for (i = 0; ; i++)
			{
				if (a == 1)
				{
					System.out.print("End");
					System.out.print("\n");
					break;
				}
				else
				{
					a = jiaogu(a);
					System.out.print(a);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

