package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int fen(int m)
	{
	int fen = int m;
	int i = 0;
	for (i = 0;i < n;i++)
	{
		if (((m - k) % n == 0) && ((m - k) / n != 0))
		{
	 m = m - k - (m - k) / n;
	 fen(m);
		}
	else
	{
		i = 0;
		return (0);
	}
	}
	if (i == n)
	{
		return (1);
	}
	}

	public static void Main()
	{
	int fen = int m;
	int m = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (m = 1;;m++)
	{
	if (fen(m) == 1)
	{
		break;
	}
	}
	System.out.printf("%d",m);
	}
}

