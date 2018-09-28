package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int k;
		int n;
		int m;
		int[][] a = new int[100][100];
		(int)(*p)[100] = a;
		int t = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (l = 1;l <= k;l++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= m - 1;j++)
			{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			*(p + i) + j = tempVar4;
		}
			}
		}

		for (j = 0;j <= m - 1;j++)
		{
			if (n != 1)
			{
			t += *(*(p) + j);
		t += *(*(p + n - 1) + j);
			}
		else
		{
		 t += *(*(p) + j);
		}
		}
		for (i = 1;i <= n - 2;i++)
		{
			if (m != 1)
			{
			t += *(*(p + i));
			t += *(*(p + i) + m - 1);
			}
		else
		{
			t += *(*(p + i));
		}
		}
			System.out.printf("%d\n",t);
			t = 0;
	}
	}
}

