package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1024]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}

		int[] count = new int['z'-'a' + 1];
		for (int j = 0;j < 'z'-'a' + 1;j++)
		{
			count[j] = 0;
		}

		int len = str.length();
		for (int i = 0;i < len;i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				count[str.charAt(i) - 'a']++;
			}
		}

		int totle = 0;
		for (char c = 'a';c <= 'z';c++)
		{
			if (count[c - 'a'] > 0)
			{
				System.out.printf("%c=%d\n",c,count[c - 'a']);
				totle++;
			}
		}

		if (totle == 0)
		{
			System.out.print("No\n");
		}

		return 0;
	}
}

