package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i = 0;
		int j = 0;
		int[][] pp;
		pp = new int[(m + 2)];
		for (i = 0;i < m + 2;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pp[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * (n + 2));
		}
		for (i = 0;i < m + 2;i++)
		{
		for (j = 0;j < n + 2;j++)
		{
			if ((i * j) != 0 && i != (m + 1) && j != (n + 1))
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pp[i][j] = Integer.parseInt(tempVar3);
			}
			}
			else
			{
			pp[i][j] = 0;
			}
		}
		}
		int k = 0;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (pp[i][j] >= pp[i - 1][j])
				{
				k = k + 1;
				}
				if (pp[i][j] >= pp[i + 1][j])
				{
				k = k + 1;
				}
				if (pp[i][j] >= pp[i][j - 1])
				{
				k = k + 1;
				}
				if (pp[i][j] >= pp[i][j + 1])
				{
				k = k + 1;
				}
				if (k == 4)
				{
				System.out.printf("%d %d\n",i - 1,j - 1);
				}
				k = 0;
			}
		}
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp);
		return 0;
	}


}

