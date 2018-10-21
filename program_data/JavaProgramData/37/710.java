package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int flag = 1;
		String[] z = {"0"};
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < t; i++)
		{
			z[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (int i = 0; i < t; i++)
		{
			flag = 1;
			int j = 0;
			for (; j < String.valueOf(z[i]).length() && flag != 0; j++)
			{
				int s = 0;
				for (int k = 0; k < String.valueOf(z[i]).length(); k++)
				{
					if ((z[i][j] - 'a') == (z[i][k] - 'a'))
					{
						s++;
					}
				}
				if (s == 1)
				{
					System.out.print(z[i][j]);
					System.out.print("\n");
					flag = 0;
				}
			}
			if (j == String.valueOf(z[i]).length() && flag != 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

