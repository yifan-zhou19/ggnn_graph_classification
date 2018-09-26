package <missing>;

public class GlobalMembers
{
	public static char[][] s = new char[MLEN][MAX];
	public static int i;
	public static int j;
	public static int n;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			int a = 1;
			for (j = 0;s[i][j] != '\0';j++)
			{
				if (!((s[i][j] == '_') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= '0' && s[i][j] <= '9' && j>0)))
				{
					a = 0;
					break;
				}
			}
			if (a == 1)
			{
				System.out.print("yes\n");
			}
			else if (a == 0)
			{
				System.out.print("no\n");
			}
		}
	}
}

