package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			String str = new String(new char[100]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (str.length() > 20)
			{
				System.out.print("no");
				System.out.print("\n");
				continue;
			}
			int j;
			if (str.charAt(0) >= '0' && str.charAt(0) <= '9')
			{
				System.out.print("no");
				System.out.print("\n");
				continue;
			}
			for (j = 0; j < str.length(); j++)
			{
				if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z' || str.charAt(j) >= 'a' && str.charAt(j) <= 'z' || str.charAt(j) >= '0' && str.charAt(j) <= '9' || str.charAt(j) == '_')
				{
					continue;
				}
				else
				{
					System.out.print("no");
					System.out.print("\n");
					break;
				}
			}
			if (j == str.length())
			{
				System.out.print("yes");
				System.out.print("\n");
			}
		}


		return 0;
	}
}

