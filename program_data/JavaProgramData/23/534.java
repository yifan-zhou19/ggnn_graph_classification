package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][110];
		int[] lon = new int[100];
		int n = 0;
		int i;
		int j;
		char c;
		do
		{
			cin.get(c);
			if ((c >= 'A') && (c <= 'z'))
			{
				str[n][lon[n]] = c;
				lon[n]++;
			}
			if (c == ' ')
			{
				n++;
			}
		} while (c != '\n');
		for (i = n;i >= 0;i--)
		{
			for (j = 0;j < lon[i];j++)
			{
				System.out.print(str[i][j]);
			}
			if (i > 0)
			{
				System.out.print(' ');
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
