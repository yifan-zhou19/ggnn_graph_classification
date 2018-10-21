package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] danci = new char[300][40];
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			danci[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = j;i < n;i++)
		{
			int a = 0;
			for (j = i;j < n;j++)
			{
				a = a + String.valueOf(danci[j]).length() + 1;
				if (a > 81)
				{
					break;
				}
			}
			if (a <= 81)
			{
				for (int h = i;h < n;h++)
				{
					if (h == i)
					{
						System.out.print(danci[h]);
					}
					else
					{
						System.out.print(" ");
						System.out.print(danci[h]);
					}
				}
			}
			else
			{
				for (int h = i;h < j;h++)
				{
					if (h == i)
					{
						System.out.print(danci[h]);
					}
					else
					{
						System.out.print(" ");
						System.out.print(danci[h]);
					}
				}
				System.out.print("\n");
			}
			i = j - 1;

		}
		return 0;



	}
}

