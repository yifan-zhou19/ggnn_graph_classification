package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int i;
		int flag = 0;
		int cnt = 0;
		int k;
		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			cnt = cnt * 10 + (c - '0');
			k = cnt / 13;
			if (k == 0)
			{
					if (flag != 0)
					{
						System.out.print(k);
					}

			}
			else
			{
				System.out.print(k);
				flag = 1;
			}
			cnt = cnt - k * 13;
		}
		if (flag == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		System.out.print(cnt);
		System.out.print("\n");

		return 0;
	}

}

