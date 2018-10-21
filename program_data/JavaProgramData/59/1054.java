package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int num = 0;
		final String ren = "";
		for (i = 0;i < 102;i++)
		{
			ren.charAt(i)[0] = ' ';
			ren.charAt(0)[i] = ' ';
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			   ren.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
			   if (ren.charAt(i)[j] == '@')
			   {
				   num++;
			   }
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (ren.charAt(i)[j] == '@')
					{
						if (ren.charAt(i - 1)[j] == '.')
						{
							ren.charAt(i - 1)[j] = ' ';
							num++;
						}
						if (ren.charAt(i + 1)[j] == '.')
						{
							ren.charAt(i + 1)[j] = ' ';
							num++;
						}
						if (ren.charAt(i)[j - 1] == '.')
						{
							ren.charAt(i)[j - 1] = ' ';
							num++;
						}
						if (ren.charAt(i)[j + 1] == '.')
						{
							ren.charAt(i)[j + 1] = ' ';
							num++;
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (ren.charAt(i)[j] == ' ')
					{
						ren.charAt(i)[j] = '@';
					}
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

