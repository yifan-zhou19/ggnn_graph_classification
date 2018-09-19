package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][2000];
		int i;
		int j;
		int h;
		int s = 0;
		int[] l = new int[100];
		int S;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][j] = Integer.parseInt(tempVar2);
		}
		}
	}
	for (i = 0;i < n;i++)
	{
		l[i] = 0;
		for (j = 0;j < n;j++)
		{
			if (a[i][j] == 0)
			{
			l[i]++;
			}
		}
	}
	for (i = 0;i < n;i++)
	{
		if (l[i] != 0)
		{
		s++;
		}
	if (l[i] != 0 && l[i] != 2)
	{
		h = l[i];
	}
	}
	S = s * h - 2 * h - 2 * s + 4;
	System.out.printf("%d",S);

	return 0;
	}

}

