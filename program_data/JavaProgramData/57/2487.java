package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[N][len];
		int n;
		int i;
		int l;
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
				words[i] = tempVar2.charAt(0);
			}
			l = String.valueOf(words[i]).length();
			if (words[i][l - 1] == 'r' || words[i][l - 1] == 'y')
			{
				words[i][l - 2] = 0;
				System.out.printf("%s\n",words[i]);
			}
			else
			{
				words[i][l - 3] = 0;
				System.out.printf("%s\n",words[i]);
			}
		}
		return 0;
	}
}

