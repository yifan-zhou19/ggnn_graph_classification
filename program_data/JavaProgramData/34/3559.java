package <missing>;

public class GlobalMembers
{
	public static int Is_OddNumber(int x)
	{
		int f;
		if (x % 2 == 0)
		{
			f = 0;
		}
		else
		{
			f = 1;
		}
		return f;
	}

	public static int Main()
	{
		int number;
		int result;
		int mark;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		result = number; // ??????
		if (number == 1)
		{
			System.out.print("End");
		}
		else
		{
		do
		{
			int Is_OddNumber = int x;
			int f = Is_OddNumber(result);
			if (f == 0) // ??f?0???number???
			{
				mark = result;
				result = result / 2;
				if (result != 1)
				{
					System.out.print(result * 2);
					System.out.print("/2=");
					System.out.print(result);
					System.out.print("\n");
				}
			}
			else
			{
				mark = result;
				result = result * 3 + 1;
				if (result != 1)
				{
					System.out.print((result - 1) / 3);
					System.out.print("*3+1=");
					System.out.print(result);
					System.out.print("\n");
				}

			}
		} while (result != 1);
		if (mark == 2)
		{
			System.out.print("2/2=1");
			System.out.print("\n");
		}
		else
		{
			System.out.print("0*3+1=1");
			System.out.print("\n");
		}
		if (result == 1)
		{
			System.out.print("End");
		}
		}
		return 0;
	}
}

