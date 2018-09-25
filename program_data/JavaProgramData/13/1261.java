package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num;
		int[] count = new int[100];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count[num]++;
		System.out.print(num);
		for (i = 2; i <= n; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count[num]++;
			if (count[num] == 1)
			{
				System.out.print(" ");
				System.out.print(num);
			}
		}
		return 0;
	}
}

