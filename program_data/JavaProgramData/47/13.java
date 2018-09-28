package <missing>;

public class GlobalMembers
{
	public static int mark = 0;
	public static int Main()
	{
		int sum;
		void print(int);
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		print(sum - 1);
		return 0;
	}
	public static void print(int num)
	{
		int temp;
		temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num == 0)
		{
			mark = 1;
			System.out.print(temp);
			return;
		}
		else
		{
			print(num - 1);
		}
		if (mark != 0)
		{
			System.out.print(" ");
			System.out.print(temp);
		}

	}
}

