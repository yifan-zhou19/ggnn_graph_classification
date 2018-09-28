package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String w = new String(new char[51]);
		String[] c = {"er", "ly", "ing"};
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w = tempVar2.charAt(0);
			}
			for (int j = 0;j < 3;j++)
			{
				int len = w.length();
				int slen = String.valueOf(c[j]).length();
				if (strcmp(c[j],w.Substring(len) - slen) == 0)
				{
					w = w.substring(0, len - slen);
					System.out.printf("%s\n",w);
					break;
				}
			}
		}
	}
}

