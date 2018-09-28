package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int left = 80;
		char[][] word = new char[10000][42];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0; i < n;i++)
		{
			l = String.valueOf(word[i]).length();
			if (left == 80)
			{
				System.out.printf("%s", word[i]);
				left -= l;
			}
			else if (left >= l + 1)
			{
				System.out.printf(" %s", word[i]);
				left -= l + 1;
			}
			else
			{
				System.out.printf("\n%s", word[i]);
				left = 80 - l;
			}
		}
		return 0;
	}
}

