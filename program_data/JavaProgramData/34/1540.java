package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			do
			{
				if (a % 2 == 0)
				{
					System.out.print(a);
					System.out.print("/2=");
					a = a / 2;
					System.out.print(a);
					System.out.print("\n");
				}
				else
				{
					System.out.print(a);
					System.out.print("*3+1=");
					a = a * 3 + 1;
					System.out.print(a);
					System.out.print("\n");
				}
			}while (a > 1);
			System.out.print("End");
			System.out.print("\n");
		}
	return 0;
	}
}

