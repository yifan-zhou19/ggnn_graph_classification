package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int sum;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 12;i++)
		{
			sum = 0;
			for (j = 0;j < i - 1;j++)
			{
				sum += d[j];
			}
			if ((sum + 13 + n - 1) % 7 == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

