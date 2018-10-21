package <missing>;

public class GlobalMembers
{
	public static char[][] S = new char[1000][100];
	public static int Size = 0;
	public static int Main()
	{
		//freopen ("a.txt", "r", stdin);
		while (!feof(stdin))
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				S[Size++] = tempVar.charAt(0);
			}
		}
		//while (scanf ("%s", S[Size ++]));
		Size--;
		for (int i = 0; i < Size - 3; i++)
		{
			if (strcmp(S[i], S[Size - 2]) == 0)
			{
				System.out.printf("%s ", S[Size - 1]);
			}
			else
			{
				System.out.printf("%s ", S[i]);
			}
		}
		if (strcmp(S[Size - 3], S[Size - 2]) == 0)
		{
			System.out.printf("%s\n", S[Size - 1]);
		}
		else
		{
			System.out.printf("%s\n", S[Size - 3]);
		}
		return 0;
	}

}

