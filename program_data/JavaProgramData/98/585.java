package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q;
		char[][] word = new char[500][40];
		final String str = "\0";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			str += word[i];
			p = str.length();
			q = p + String.valueOf(word[i + 1]).length() + 1;
			if (p <= 80 && q>80)
			{
				System.out.printf("%s\n",str);
				str = "\0";
			}
			else
			{
				if (i == n - 1)
				{
				System.out.printf("%s",str);
				}
				else
				{
					str += " ";
				}
			}
		}
	}
}

