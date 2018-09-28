package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[21]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n--)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int flag = 1;
			if (str.charAt(0) == '_' || str.charAt(0) >= 'a' && str.charAt(0) <= 'z' || str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
			{
			flag = 1;
			}
			else
			{
			flag = 0;
			}
			for (int i = 1;str.charAt(i) != '\0';i++)
			{
					if (str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) == '_')
					{
					continue;
					}
					else
					{
					   flag = 0;
					   break;
					}
			}
			if (flag == 0)
			{
			System.out.print("no");
			System.out.print("\n");
			}
			else
			{
			System.out.print("yes");
			System.out.print("\n");
			}
		}
		return 0;
	}

}

