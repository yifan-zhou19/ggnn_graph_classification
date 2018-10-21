package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100001]);
		int i;
		int j;
		int t;
		int k;
		int flag;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= t; k++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int l = str.length();
			for (i = 0; i < l; i++)
			{
				flag = 0;
				for (j = 0; j < l; j++)
				{
					if (j != i)
					{
						if (str.charAt(j) == str.charAt(i))
						{
							flag = 1;
						}
					}
				}
				if (flag == 0)
				{
					System.out.print(str.charAt(i));
					System.out.print("\n");
					break;
				}
			}
			if (flag == 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}

	return 0;
	}
}

