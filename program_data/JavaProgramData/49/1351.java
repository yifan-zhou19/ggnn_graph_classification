package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[505]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		int l;
		int s;
		for (l = 2;l <= len;l++)
		{
			for (s = 0;s <= len - l;s++)
			{
				int flag = 1;
				for (int p = s,q = s + l - 1;p < q;p++,q--)
				{
					if (str.charAt(p) != str.charAt(q))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					for (int k = s;k <= s + l - 1;k++)
					{
						System.out.print(str.charAt(k));
					}
						System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

