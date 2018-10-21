package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k = 0;
		int i;
		int j = 0;

		double[] ch = new double[100000];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			ch[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			if (ch[i] == m)
			{
				ch[i] = 1.5;

				j++;
			}
		}

		for (i = 0; i < n; i++)
		{
			if (ch[i] != 1.5)
			{
				if (k != (n - j) - 1)
				{
					System.out.print(ch[i]);
					System.out.print(" ");

					k++;
				}
				else
				{
					System.out.print(ch[i]);
					System.out.print("\n");
				}
			}

			else
			{
				continue;
			}
		}

		return 0;
	}

}

