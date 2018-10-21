package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int num;
		int[] count = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{

			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count[num]++;
			if (i == 1)
			{
				System.out.print(num);
			}
			if (count[num] == 1 && i >= 2)
			{
				System.out.print(" ");
				System.out.print(num);
			}

		}

		return 0;
	}

}

