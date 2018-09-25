package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] w = new int[150][150];
	public static int[] m = new int[150];
	public static int Main()
	{
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int _n = 0;_n < n;_n++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(w,0,(Integer.SIZE / Byte.SIZE));
	int s = 0;
	for (int i = 0;i < n;i++)
	{
	for (int j = 0;j < n;j++)
	{
	w[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	for (int t = 1;t < n;t++)
	{

	for (int i = 0;i < n;i++)
	{
	if ((i < t) && i != 0)
	{
		continue;
	}
	m[i] = w[i][0];
	for (int j = t;j < n;j++)
	{
		if (w[i][j] < m[i])
		{
			m[i] = w[i][j];
		}
	}
	w[i][0] -= m[i];
	for (int j = t;j < n;j++)
	{
		w[i][j] -= m[i];
	}
	}
	for (int j = 0;j < n;j++)
	{
	if ((j < t) && j != 0)
	{
		continue;
	}
	m[j] = w[0][j];
	for (int i = t;i < n;i++)
	{
		if (w[i][j] < m[j])
		{
			m[j] = w[i][j];
		}
	}
	w[0][j] -= m[j];
	for (int i = t;i < n;i++)
	{
		w[i][j] -= m[j];
	}
	}
	s += w[t][t];
	}

	System.out.print(s);
	System.out.print("\n");
	}
	return 0;
	}

}

