package <missing>;

public class GlobalMembers
{
	public static void reverse(int a)
	{
		System.out.print(a % 10);
		if (a / 10 != 0)
		{
		reverse(a / 10);
		}
	}
	public static int Main()
	{
		int a;
		int i;
		int j;
		for (i = 1;i <= 6;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 0)
			{
				for (j = 0;;j++)
				{
					if (a % 10 == 0)
					{
						a = a / 10;
					}
					else
					{
						break;
					}
				}
				reverse(a);
				System.out.print("\n");
			}
			else
			{
				a = -a;
				for (j = 0;;j++)
				{
					if (a % 10 == 0)
					{
						a = a / 10;
					}
					else
					{
						break;
					}
				}
				System.out.print("-");
				reverse(a);
				System.out.print("\n");
			}
		}
		return 0;
	}





}

