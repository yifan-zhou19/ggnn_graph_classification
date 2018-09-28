package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[41]);
		int n;
		int cnt;
		int len;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		cnt = 0;
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			len = word.length();
			if (cnt == 0)
			{
				System.out.printf("%s", word);
				cnt = len;
			}
			else if (cnt + len < 80)
			{
				System.out.printf(" %s", word);
				cnt += len + 1;
			}
			else
			{
				System.out.printf("\n%s", word);
				cnt = len;
			}
		}

		return 0;
	}
}

