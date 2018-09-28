package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] word = new char[100][1000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			int c;
		c = String.valueOf(word[i]).length();
		if ((word[i][c - 1] == 'y' && word[i][c - 2] == 'l') || (word[i][c - 1] == 'r' && word[i][c - 2] == 'e'))
		{
			for (j = 0;j <= c - 3;j++)
			{
			System.out.printf("%c",word[i][j]);
			}
		System.out.print("\n");
		}
		if (word[i][c - 1] == 'g' && word[i][c - 2] == 'n' && word[i][c - 3] == 'i')
		{
			for (j = 0;j <= c - 4;j++)
			{
			System.out.printf("%c",word[i][j]);
			}
		System.out.print("\n");
		}
		}
	System.in.read();
	System.in.read();
	}


}

