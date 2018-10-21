package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		char[][] s = new char[1000][MAX + 1];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0; s[i][j]; j++)
			{
				if (!((s[i][j] == '_') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= '0' && s[i][j] <= '9' && j > 0)))
				{

					break;
				}
			}
			System.out.print(s[i][j] ? "no\n":"yes\n");
		}
		return 0;
	}
}

