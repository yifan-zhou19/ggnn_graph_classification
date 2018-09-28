package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;++i)
		{
			String a = new String(new char[30]);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || a.charAt(0) == '_')
			{
				int z = 0;
				for (int i = 1;a.charAt(i) != 0;++i)
				{
					if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || a.charAt(i) == '_' || (a.charAt(i) >= '0' && a.charAt(i) <= '9'))
					{
					}
					else
					{
					z = 1;
					System.out.print("no");
					System.out.print("\n");
					break;
					}

				}
				if (z == 0)
				{
					System.out.print("yes");
					System.out.print("\n");
				}
			}
			else
			{
			System.out.print("no");
			System.out.print("\n");
			}
		}
		return 0;
	}


}

