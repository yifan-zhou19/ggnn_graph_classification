package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		char[][] s = new char[50][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			a = String.valueOf(s[i]).length();
			if ((s[i][a - 1] == 'r' && s[i][a - 2] == 'e') || (s[i][a - 1] == 'y' && s[i][a - 2] == 'l'))
			{
				s[i][a - 2] = '\0';
			}
			else
			{
				s[i][a - 3] = '\0';
			}
			System.out.println(s[i]);
		}
		return 0;
	}
}

