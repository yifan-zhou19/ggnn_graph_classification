package <missing>;

public class GlobalMembers
{
	public static char[][] room = new char[100][100];
	public static int sum = 0;
	public static int[] row = new int[10000];
	public static int[] col = new int[10000];
	public static void spread(int counts, String[] a)
	{
		for (int i = 0;i < sum;i++)
		{
			if (a[row[i] + 1][col[i]].equals('.'))
			{
				a[row[i] + 1][col[i]] = '@';
				row[counts] = row[i] + 1;
				col[counts] = col[i];
				counts++;
			}
			if (a[row[i] - 1][col[i]].equals('.'))
			{
				a[row[i] - 1][col[i]] = '@';
				row[counts] = row[i] - 1;
				col[counts] = col[i];
				counts++;
			}
			if (a[row[i]][col[i] + 1].equals('.'))
			{
				a[row[i]][col[i] + 1] = '@';
				col[counts] = col[i] + 1;
				row[counts] = row[i];
				counts++;
			}
			if (a[row[i]][col[i] - 1].equals('.'))
			{
				a[row[i]][col[i] - 1] = '@';
				col[counts] = col[i] - 1;
				row[counts] = row[i];
				counts++;
			}
		}
		sum = counts;
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(row,-1,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(col,-1,(Integer.SIZE / Byte.SIZE));
		int n;
		int i;
		int j;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(room,'\0',(Character.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (room[i][j] == '@')
				{
					row[sum] = i;
					col[sum] = j;
					sum++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m - 1;i++)
		{
			spread(sum, room);
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

