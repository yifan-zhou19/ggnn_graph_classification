import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static final String s = "";
	public static int n;
	public static void lg(String[] a, int m)
	{
		int[][] record = new int[105][105];
		int i;
		int j;
		if (m == 1) //???????????
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (s.charAt(i)[j] == '@')
					{
						record[i][j] = 1; //????????????????????????????
					}
				}
			}
				for (i = 0;i < n;i++)
				{
					for (j = 0;j < n;j++)
					{
							if (record[i][j] == 1)
							{
						if (s.charAt(i)[j + 1] != '#' && j + 1 != n)
						{
							s.charAt(i)[j + 1] = '@';
						}
						if (s.charAt(i)[j - 1] != '#' && j - 1 != -1)
						{
							s.charAt(i)[j - 1] = '@';
						}
						if (s.charAt(i + 1)[j] != '#' && i + 1 != n)
						{
							s.charAt(i + 1)[j] = '@';
						}
						if (s.charAt(i - 1)[j] != '#' && i - 1 != -1)
						{
							s.charAt(i - 1)[j] = '@';
						}
							}
					}
				}
		}
		if (m > 1)
		{
			lg(s, m - 1); //????
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (s.charAt(i)[j] == '@')
					{
						record[i][j] = 1;
					}
				}
			}
				for (i = 0;i < n;i++)
				{
					for (j = 0;j < n;j++)
					{
							if (record[i][j] == 1)
							{
						if (s.charAt(i)[j + 1] != '#' && j + 1 != n)
						{
							s.charAt(i)[j + 1] = '@';
						}
						if (s.charAt(i)[j - 1] != '#' && j - 1 != -1)
						{
							s.charAt(i)[j - 1] = '@';
						}
						if (s.charAt(i + 1)[j] != '#' && i + 1 != n)
						{
							s.charAt(i + 1)[j] = '@';
						}
						if (s.charAt(i - 1)[j] != '#' && i - 1 != -1)
						{
							s.charAt(i - 1)[j] = '@';
						}
							}
					}
				}
		}

	}

	public static int Main()
	{
		int i;
		int m;
		int sum;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, new Scanner(System.in).nextLine());
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lg(s, m - 1);
		sum = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s.charAt(i)[j] == '@')
				{
					sum += 1; //??????
				}
			}
		}
		System.out.print(sum);



		return 0;
	}
}

