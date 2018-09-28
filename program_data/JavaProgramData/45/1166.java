package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[2][100];
		int i;
		int l1;
		int l2;
		int j;
		for (i = 0;i < 2;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = tempVar.charAt(0);
			}
		}
		l1 = String.valueOf(s[0]).length();
		l2 = String.valueOf(s[1]).length();
		for (i = 0;i < l2;i++)
		{
			for (j = 0;j < l1;j++)
			{
			if (s[1][i + j] != s[0][j])
			{
				break;
			}
			}
			if (j == l1)
			{
				System.out.printf("%d",i);
			break;
			}
		}


		return 0;
	}
}

