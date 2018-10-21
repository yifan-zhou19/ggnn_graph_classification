package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int flag = 0;
		int f = 0;
		String str = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= t; i++)
		{
			f = 0;
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int t0 = str.length();
			for (int i = 0; i < t0;i++)
			{
				flag = 0;
				for (int j = i + 1;j < t0;j++)
				{
					if (str.charAt(i) == str.charAt(j))
					{
						flag = 1;
						str = tangible.StringFunctions.changeCharacter(str, j, '1');
					}
				}
				if (flag == 1)
				{
					continue;
				}
				if (flag == 0 && str.charAt(i) != '1')
				{
					System.out.print(str.charAt(i));
					System.out.print("\n");
					f = 1;
					break;
				}
			}
			if (f == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

