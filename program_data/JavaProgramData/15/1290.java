package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[][] shu = new int[1000][1000];
	int i;
	int j;
	int sth;
	int stl;
	int enh;
	int enl;
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			shu[i][j] = Integer.parseInt(tempVar2);
		}
		}
	}
	int b = -1;
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (shu[i][j] == 0 && b == -1)
			{
			sth = i;
			stl = j;
			b = 1;
			}
		}
	}
	int a = -1;
	for (i = n - 1;i >= 0;i--)
	{
		for (j = n - 1;j >= 0;j--)
		{
			if (shu[i][j] == 0 && a == -1)
			{
			enh = i;
			enl = j;
			a = 1;
			}
		}
	}
	int s;
	s = (enh - sth - 1) * (enl - stl - 1);
	System.out.printf("%d",s);
	return 0;
	}
}

