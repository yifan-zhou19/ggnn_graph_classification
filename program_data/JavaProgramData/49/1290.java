package <missing>;

public class GlobalMembers
{
	public static int panduan(tangible.RefObject<String> a, int n)
	{
		int i;
		int j;
		int k = 0;
		for (i = 0;i < n / 2;i++)
		{
			if (*(a.argValue.Substring(i)) != *(a.argValue.Substring(n) - 1 - i))
			{
				k = 1;
			}
		}
		if (k == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		final String c = "";
		final String a = "";
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		for (i = 2;i < c.length();i++)
		{
			l = c.length() - i + 1;
			for (j = 0;j < l;j++)
			{
				for (k = 0;k < i;k++)
				{
					*(*(a.Substring(j)) + k) = *(c.Substring(j) + k);
				}
			if (panduan(*(a.Substring(j)), String.valueOf(*(a.Substring(j))).length()) == 1)
			{
				System.out.printf("%s\n",*(a.Substring(j)));
			}
			}

		}
			return 0;
	}

}

