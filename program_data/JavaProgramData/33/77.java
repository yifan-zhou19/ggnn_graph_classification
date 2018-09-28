package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		int j;
		char[][] s = new char[1000][255];
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
				s[i] = tempVar2.charAt(0);
			}
			len = String.valueOf(s[i]).length();
			for (j = 0;j < len - 1;j++)
			{
				if (s[i][j] == 'A')
				{
					System.out.print("T");
				}
				else if (s[i][j] == 'T')
				{
					System.out.print("A");
				}
				else if (s[i][j] == 'G')
				{
					System.out.print("C");
				}
				else if (s[i][j] == 'C')
				{
					System.out.print("G");
				}
			}
				if (s[i][len - 1] == 'A')
				{
					System.out.print("T\n");
				}
				else if (s[i][len - 1] == 'T')
				{
					System.out.print("A\n");
				}
				else if (s[i][len - 1] == 'G')
				{
					System.out.print("C\n");
				}
				else if (s[i][len - 1] == 'C')
				{
					System.out.print("G\n");
				}

		}
		return 0;
	}

}

