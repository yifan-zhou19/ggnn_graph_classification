package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		char[][] s = new char[2][51];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[1] = tempVar2.charAt(0);
		}
		for (j = 0;s[1][j + 1] != '\0';j++)
		{
				if ((s[0][0] == s[1][j]) && (s[0][1] == s[1][j + 1]))
				{
					 System.out.printf("%d",j);
					 return 0;
				}
		}
		return 0;
	}
}

