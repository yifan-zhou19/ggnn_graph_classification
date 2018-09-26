package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int l;
		int i;
		String a = new String(new char[100]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		while (N-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			if (strcmp(a.Substring(l) - 2, "ly") == 0)
			{
				l -= 2;
			}
			if (strcmp(a.Substring(l) - 2, "er") == 0)
			{
				l -= 2;
			}
			if (strcmp(a.Substring(l) - 3, "ing") == 0)
			{
				l -= 3;
			}
			for (i = 0;i < l;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}

		return 0;
	}
}

