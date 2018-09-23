package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int a; //a????
		int[][] s = new int[26][1000];
		int m;
		int i;
		int j;
		int author;
		int max = 0;
		char[][] b = new char[1000][28]; //???
		for (i = 0;i < 26;i++)
		{
			s[i][0] = 0;
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[a] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;b[a][j] != '\0';j++)
			{
				s[b[a][j] - 'A'][0]++; //??????+1
				s[b[a][j] - 'A'][s[b[a][j] - 'A'][0]] = a; //??????
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (s[i][0] > max)
			{
				max = s[i][0];
				author = i;
			}
		}
		System.out.print((char)(author + 'A'));
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (j = 1;j <= max;j++)
		{
			System.out.print(s[author][j]);
			System.out.print("\n");
		}
		return 0;
	}
}

