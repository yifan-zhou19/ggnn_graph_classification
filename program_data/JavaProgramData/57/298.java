package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] length = new int[SIZE];
		char[][] word = new char[SIZE][SIZE2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			word[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			length[i] = String.valueOf(word[i]).length();
			if (word[i][length[i] - 1] == 'r' || word[i][length[i] - 1] == 'y')
			{
				for (j = 0;j < length[i] - 2;j++)
				{
					System.out.printf("%c",word[i][j]);
				}
				System.out.print("\n");
			}
			else if (word[i][length[i] - 1] == 'g')
			{
				for (j = 0;j < length[i] - 3;j++)
				{
					System.out.printf("%c",word[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

