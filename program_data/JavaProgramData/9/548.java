package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[100];
	public static int[] t = new int[100];
	public static int n;
	public static int i;
	public static int j;
	public static int m = 0;
	public static char[][] ss = new char[100][100];
	public static int cmp(Object a, Object b)
	{
		return ((int)b - (int)a);
	}
	public static int Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		ss[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		s[i] = Integer.parseInt(tempVar3);
	}
	}
	for (j = 0;j < n;j++)
	{
		m = 0;
		for (i = 0;i < n;i++)
		{
				m = m > s[i] != 0?m:s[i];
		}
		if (m < 60)
		{
			break;
		}

		for (i = 0;i < n;i++)
		{
			if (s[i] == m)
			{
				System.out.printf("%s\n",ss[i]);
			s[i] = -1;
			}

		}

	}
		for (i = 0;i < n;i++)
		{
			if (s[i] != -1)
			{
			System.out.printf("%s\n",ss[i]);
			}
		}
	}
}

