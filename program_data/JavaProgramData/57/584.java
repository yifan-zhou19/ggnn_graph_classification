package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] lenth = new int[50];
		char[][] word = new char[50][35];
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
				word[i] = tempVar2.charAt(0);
			}
		}

		for (i = 0;i < n;i++)
		{
			lenth[i] = String.valueOf(word[i]).length();

		if (word[i][lenth[i] - 1] == 'g')
		{
		for (j = 0;j < lenth[i] - 3;j++)
		{
			System.out.printf("%c",word[i][j]);
		}
		System.out.print("\n");
		}

		else if (word[i][lenth[i] - 1] == 'y')
		{
			for (j = 0;j < lenth[i] - 2;j++)
			{
				System.out.printf("%c",word[i][j]);
			}
			System.out.print("\n");
		}
		else if ("%c",word[i][lenth[i] - 1] == 'r')
		{
			for (j = 0;j < lenth[i] - 2;j++)
			{
				System.out.printf("%c",word[i][j]);
			}
			System.out.print("\n");
		}
		}

			return 0;
	}
}

