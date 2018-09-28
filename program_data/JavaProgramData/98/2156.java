package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		int p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String str = new String(new char[40]);
		for (i = 0; i < n; i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = str.length();
			if (p + len < 80)
			{
				if (p != 0)
				{
					System.out.print(" ");
					p++;
				}
				p = p + len;
			}
			else
			{
				p = len;
				System.out.print("\n");
			}
			System.out.print(str);
		}
		return 0;
	}

}

