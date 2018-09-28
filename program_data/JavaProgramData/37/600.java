package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000000 + 10]);
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int n = 1; n <= t; n++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len = str.length();
			int i;
			int j;
			int k;
			int sole;
			for (i = 0; i < len; i++)
			{
				sole = 1;
				for (j = 0; j < len; j++)
				{
					if (i == j)
					{
						continue;
					}
					if (str.charAt(i) == str.charAt(j))
					{
						sole = 0;
					}
				}
				if (sole != 0)
				{
					System.out.print(str.charAt(i));
					System.out.print("\n");
					break;
				}
			}
			if (i == len && sole == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

