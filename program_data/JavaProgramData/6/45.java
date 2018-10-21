package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int k;
		int i;
		int j;
		int s = 0;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100][100];
		int[][] p = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (a = 0;a < k;a++)
		{
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p[i][j] = (int)malloc(1 * (Integer.SIZE / Byte.SIZE));
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i][j] = Integer.parseInt(tempVar4);
			}
			if (j == n - 1)
			{
				scanf("\n");
			}
			}
		}
		for (j = 0;j < n;j++)
		{
			s = s + (p[0][j]) + (p[m - 1][j]);
		}
		for (i = 1;i < m - 1;i++)
		{
			s = s + (p[i][0]) + (p[i][n - 1]);
		}
		System.out.printf("%d\n",s);
		s = 0;
		}
	}



}

