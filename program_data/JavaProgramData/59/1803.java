package <missing>;

public class GlobalMembers
{
	public static int n;
	public static char[][] w = new char[150][150];
	public static char[][] q = new char[150][150];
	public static int k;
	public static void c(int i,int j)
	{
		if (w[i][j] == '.')
		{
			w[i][j] = '@';
		}
	}
	public static int Main()
	{
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= n;i++)
	{
	w[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	for (int j = n;j > 0;j--)
	{
		w[i][j] = w[i][j - 1];
	}
	}
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (k > 1)
	{
	k--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
	memcpy(q,w,(Character.SIZE / Byte.SIZE));
	for (int i = 1;i <= n;i++)
	{
	for (int j = 1;j <= n;j++)
	{
	if (q[i][j] == '@')
	{
	c(i, j - 1);
	c(i, j + 1);
	c(i - 1, j);
	c(i + 1, j);
	}
	}
	}
	}
	int s = 0;
	for (int i = 1;i <= n;i++)
	{
	for (int j = 1;j <= n;j++)
	{
	if (w[i][j] == '@')
	{
		s++;
	}
	}
	}
	System.out.print(s);
	System.out.print("\n");
	return 0;
	}

}

