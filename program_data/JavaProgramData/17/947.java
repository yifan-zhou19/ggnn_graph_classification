package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(a);
			System.out.print("\n");
			int l = a.length();
			for (int i = 0;i < l;i++)
			{
				switch (a[i])
				{
					case '(':
						a[i] = '$';
						break;
					case ')':
						a[i] = '?';
						break;
					default:
						a[i] = ' ';
				}
				if (i > l)
				{
					break;
				}
			}
			for (int i = 0;i < l;i++)
			{
				if (a[i] == '$')
				{
					for (int j = i + 1;j < l;j++)
					{
						if (a[j] == '?')
						{
							a[i] = a[j] = ' ';
							break;
						}
						if (a[j] == '$')
						{
							break;
						}
					}
				}
				if (a[i] == '?')
				{
					for (int j = i - 1;j >= 0;j--)
					{
						if (a[j] == '$')
						{
							a[i] = a[j] = ' ';
							break;
						}
						if (a[j] == '?')
						{
							break;
						}
					}
				}
			}
			for (int i = 0;i < l;i++)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
			for (int i = 0;i < 100;i++)
			{
				a[i] = 0;
			}
		}
	}

}

