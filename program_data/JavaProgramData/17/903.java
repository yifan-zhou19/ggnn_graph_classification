package <missing>;

public class GlobalMembers
{
	public static int process()
	{
		String str = new String(new char[105]);
		char[] tstr = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++)
		{
			if (str.charAt(i) == '(')
			{
				count++;
			}
			else if (str.charAt(i) == ')')
			{
				if (count > 0)
				{
					count--;
				}
				else
				{
					tstr[i] = '?';
				}
			}
		}
		count = 0;
		for (int i = len - 1; i >= 0; i--)
		{
			if (str.charAt(i) == ')')
			{
				count++;
			}
			else if (str.charAt(i) == '(')
			{
				if (count > 0)
				{
					count--;
				}
				else
				{
					tstr[i] = '$';
				}
			}
		}
		System.out.print(str);
		System.out.print("\n");
		for (int i = 0; i < len; i++)
		{
			if (tstr[i] != null)
			{
				System.out.print(tstr[i]);
			}
			else
			{
				System.out.print(' ');
			}
		}
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			process();
		}
		return 0;
	}

}

