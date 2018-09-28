package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int len;
		String str = new String(new char[100000]);
		int flag = 1;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= t; i++)
		{
			flag = 1;
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = str.length();
			for (j = 0; j <= len - 1; j++) // ?0?????????????
			{
				for (k = 0; k <= len - 1 ; k++)
				{
					if (k != j && str.charAt(k) == str.charAt(j))
					{
						break;
					}
				}
				if (k == len || (j == len - 1 && k == j))
				{
					System.out.print(str.charAt(j));
					System.out.print("\n");
					flag = 0;
					break;
				}
			}

			if (flag != 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}



}

