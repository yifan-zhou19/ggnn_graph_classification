package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int q;
		int s = 0;
	int m;
	int n;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (q = 0;q < k;q++)
	{
		s = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

	for (i = 0;i < m;i++)
	{
		for (j = 0;j < n;j++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			*(a + i) + j = tempVar4;
		}
		}
	}

	for (i = 0;i < n;i++)
	{
	s = s + *(*(a + 0) + i);
	}
	for (i = 1;i < m;i++)
	{
	s = s + *(*(a + i) + n - 1);
	}
	for (i = 1;i < m;i++)
	{
	s = s + *(*(a + i) + 0);
	}
	for (i = 1;i < n - 1;i++)
	{
	s = s + *(*(a + m - 1) + i);
	}
	System.out.printf("%d\n",s);
	}
	}
}

