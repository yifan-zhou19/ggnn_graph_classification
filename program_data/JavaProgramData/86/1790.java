package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[20];
		int m;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < m;i++)
			{
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < m;i++)
			{
				if ((num[i] + 3 * (i + 1)) > 63)
				{
					sum = num[i - 1] + 60 - num[i - 1] - 3 * i;
					break;
				}
				else if ((num[i] + 3 * (i + 1)) >= 60)
				{
					sum = num[i];
					break;
				}
			}
			if (sum == 0)
			{
				sum = 60 - m * 3;
			}
			if (m == 0)
			{
			System.out.print(60);
			System.out.print("\n");
			}
			else
			{
			System.out.print(sum);
			System.out.print("\n");
			}
			n--;
		}

		return 0;
	}

}

