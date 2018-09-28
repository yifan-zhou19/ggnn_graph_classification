package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int w;
		int c;
		int[][] p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (w = 0;w < k;w++)
		{
			c = 0;
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
			p = new int[m];
			for (i = 0;i < m;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
			}
			for (i = 0;i < m;i++)
			{
			for (j = 0;j < n;j++)
			{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i] + j = Integer.parseInt(tempVar4);
			}
			}
			}
			if (m == 1)
			{
			for (i = 0;i < n;i++)
			{
			c = c + p[0][i];
			}
			}
			else
			{
				if (n == 1)
				{
				for (i = 0;i < m;i++)
				{
				c = c + p[i][0];
				}
				}
				else
				{
					for (i = 0;i < n;i++)
					{
					c = c + p[0][i] + p[m - 1][i];
					}
					for (i = 1;i < m - 1;i++)
					{
					c = c + p[i][0] + p[i][n - 1];
					}
				}
			}
			System.out.printf("%d\n",c);
			for (i = 0;i < m;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p[i]);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p);
		}
		return 0;
	}
}

