package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //counter
		int m;
		int i;
		int j;
		int k;
		int sum;
		int time;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = m;
			k = 0;
			while (j > 0)
			{
				k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				j--;
				if ((k + (m - j) * 3) > 60)
				{
				break;
				}
			}
			if ((k + (m - j) * 3) <= 60)
			{
			System.out.print(60 - (m - j) * 3);
			System.out.print("\n");
			}
			else
			{
				if (k + m * 3 - j * 3 - 60 > 3)
				{
				System.out.print(60 - (m - j) * 3 + 3);
				System.out.print("\n");
				}
				else
				{
				System.out.print(k);
				System.out.print("\n");
				}
			}
			for (;j > 0;j--)
			{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		return 0;
	}

}

