package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[][] s = new int[1500][1500];
	int inside = 0;
	int total = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if ((s[i][j] == 0) && (s[i][j + 1] == 0))
	{
	do
	{
	j++;
	}while ((j < n) && (s[i][j] == 0));
	}
	else if ((s[i][j] == 0) && (s[i][j + 1] != 0))
	{
	do
	{
	j++;
	if (s[i][j] > 0)
	{
	inside++;
	}
	}while ((j < n) && (s[i][j] != 0));
	}
	}
	}
	System.out.print(inside);
	System.out.print("\n");

	return 0;
	}


}

