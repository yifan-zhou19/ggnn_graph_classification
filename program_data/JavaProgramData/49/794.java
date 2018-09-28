package <missing>;

public class GlobalMembers
{
	public static String ls = new String(new char[MAX]);
	public static int pafind(int start, int len)
	{
		int maxl = len / 2;
		int ok = 1;
		for (int i = start;i < start + maxl;i++)
		{
			if (ls.charAt(i) != ls.charAt(start + len - 1 - (i - start)))
			{
				 ok = 0;
				break;
			}
		}
		return ok;
	}


	public static int Main()
	{
		int len;
		ls = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = ls.length();
		for (int ll = 2;ll <= len;ll++)
		{
			for (int i = 0;i <= len - ll;i++)
			{
				if (pafind(i, ll) != 0)
				{
					for (int j = i;j < i + ll;j++)
					{
						System.out.print(ls.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

