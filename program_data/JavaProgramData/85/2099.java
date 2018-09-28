package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[60]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (a.charAt(0) != '_' && ((a.charAt(0) <= 'Z' && a.charAt(0) >= 'A') == 0) && ((a.charAt(0) <= 'z' && a.charAt(0) >= 'a') == 0))
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				for (j = 0;a.charAt(j) != '\0';j++)
				{
					if (a.charAt(j) != '_' && (a.charAt(j) > 'Z' || a.charAt(j) < 'A') && (a.charAt(j)>'z' || a.charAt(j) < 'a') && (a.charAt(j)>'9' || a.charAt(j) < '0'))
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
				if (a.charAt(j) == '\0')
				{
					System.out.print("yes");
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

