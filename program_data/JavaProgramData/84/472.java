package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int max = 0;
		int max2 = 0;
		int a;
		for (int i = 1;i <= k;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= max)
			{
				int temp;
				temp = max;
				max = a;
				max2 = temp;
			}

			else if (a > max2)
			{
				max2 = a;
			}

			//i++;
		}
		System.out.print(max);
		System.out.print("\n");
		System.out.print(max2);
		System.out.print("\n");

		return 0;
	}


}

