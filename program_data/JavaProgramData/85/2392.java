package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int flag;
		String str = new String(new char[21]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			//cin.getline(str,21); 
			len = str.length();
			for (int j = 0;j < len;j++)
			{
				if (j == 0)
				{
				if (str.charAt(0) == '_' || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'))
				{
					flag = 0;
				}
				else
				{
					flag = 1;
				}
				}
				else if (str.charAt(j) == '_' || (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') || (str.charAt(j) >= '0' && str.charAt(j) <= '9'))
				{
					flag = flag;
				}
				else
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
					System.out.print("yes");
					System.out.print("\n");
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

