package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int number;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n;i++)
		{
			number = i;
			if (number <= 10)
			{
			   if (number != 7)
			   {
				   sum += number * number;
			   }
			}
			else
			{
				if ((number % 7 != 0) && (number / 10 != 7) && (number % 10 != 7))
				{
				   sum += number * number;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}


}

