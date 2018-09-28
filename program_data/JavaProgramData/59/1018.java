package <missing>;

public class GlobalMembers
{
	/*1200012866 ???*/
	public static int Main()
	{
		int n;
		int m;
		final String p = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				p.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int z = 0;z < m - 1;z++)
		{
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (p.charAt(i)[j] == '@')
					{ //????
						if (p.charAt(i + 1)[j] == '.') //?????-1???????
						{
							p.charAt(i + 1)[j] = '$';
						}
						if (p.charAt(i)[j + 1] == '.')
						{
							p.charAt(i)[j + 1] = '$';
						}
						if (i != 0 && p.charAt(i - 1)[j] == '.')
						{
							p.charAt(i - 1)[j] = '$';
						}
						if (j != 0 && p.charAt(i)[j - 1] == '.')
						{
							p.charAt(i)[j - 1] = '$';
						}
					}
				}
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (p.charAt(i)[j] == '$')
					{
						p.charAt(i)[j] = '@';
					}
				}
			}
		}
		int count = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (p.charAt(i)[j] == '@') //???????
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");

		return 0;
	}
}

