package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int pos;
		final int MAX = 200;
		int[] an = new int[MAX];
		an[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(an[0]);
		}
		else
		{
			while (n-- != 0)
			{
				for (i = 0;i < MAX;i++)
				{
					an[i] = an[i] * 2;
				}
				for (i = 0;i < MAX;i++)
				{
					if (an[i] > 9)
					{
						an[i + 1] += an[i] / 10;
						an[i] = an[i] % 10;
					}
				}
			}
			for (i = MAX - 1;an[i] == 0;i--)
			{
				;
			}
			for (;i >= 0;i--)
			{
				System.out.print(an[i]);
			}
		}
		return 0;

	}
}

