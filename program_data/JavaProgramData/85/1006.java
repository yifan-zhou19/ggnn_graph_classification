package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			String str = new String(new char[30]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int i;
			int flag = 1;
			if (str.charAt(0) == '_' || (str.charAt(0) >= 65 && str.charAt(0) <= 90) || (str.charAt(0) >= 97 && str.charAt(0) <= 122))
			{
				for (i = 1;i < str.length();i++)
				{
					if (str.charAt(i) == '_' || str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122 || str.charAt(i) >= 48 && str.charAt(i) <= 57)
					{
						continue;
					}
					else
					{
						System.out.print("no");
						System.out.print("\n");
						flag = 0;
						break;
					}
				}
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
				flag = 0;
			}
			if (flag == 1)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			n--;
		}
		return 0;
	}



}

