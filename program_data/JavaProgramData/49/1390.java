package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[505]);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int len;
		len = c.length();
		for (i = 2; i < len; i++)
		{
			for (j = 0; j <= len - i; j++)
			{
				int k;
				int l;
				int flag = 1;
				for (k = j, l = j + i - 1; k < j + i - 1, l > j; k++, l--)
				{
					if (c.charAt(k) != c.charAt(l))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					for (int a = j; a < j + i; a++)
					{
						System.out.print(c.charAt(a));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

