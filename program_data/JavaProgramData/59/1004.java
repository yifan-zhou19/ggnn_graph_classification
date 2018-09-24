package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int m = 0;
		final String a = "";
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < m - 1;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(i)[j] == '@')
					{
						if (i - 1 >= 0 && a.charAt(i - 1)[j] == '.')
						{
							a.charAt(i - 1)[j] = '%';
						}
						if (i + 1 < n && a.charAt(i + 1)[j] == '.')
						{
							a.charAt(i + 1)[j] = '%';
						}
						if (j - 1 >= 0 && a.charAt(i)[j - 1] == '.')
						{
							a.charAt(i)[j - 1] = '%';
						}
						if (j + 1 < n && a.charAt(i)[j + 1] == '.')
						{
							a.charAt(i)[j + 1] = '%';
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(i)[j] == '%')
					{
						a.charAt(i)[j] = '@';
					}
				}
			}
		}
		int num = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a.charAt(i)[j] == '@')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

