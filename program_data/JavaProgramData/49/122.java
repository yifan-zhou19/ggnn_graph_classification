package <missing>;

public class GlobalMembers
{
	public static void same(int i, String x)
	{
		int j;
		int k;
		int flag = 1;
		for (j = 0; !x[j].equals('\0'); j++)
		{
			flag = 1;
			for (k = 0; k < + i / 2; k++)
			{
				if (!x[k + j].equals(x[j + i - 1 - k]))
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				for (k = j; k < j + i; k++)
				{
					System.out.print(x[k]);
				}
				System.out.print("\n");
			}

		}
	}
	public static int Main()
	{
		String x = new String(new char[501]);
		int i;
		int len;
		x = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = x.length();

		for (i = 2; i <= len; i++)
		{
			same(i, x);
		}
		return 0;
	}
}

