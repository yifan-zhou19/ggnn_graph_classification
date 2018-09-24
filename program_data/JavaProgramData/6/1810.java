package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int l;
		int m;
		int n;
		int i;
		int j;
		int s1;
		int s2;
		int s3;
		int s4;
		int s;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int[] sf = (int)malloc(((Integer.SIZE / Byte.SIZE) * k));
		for (l = 0;l < k;l++)
		{
			s1 = 0;
			s2 = 0;
			s3 = 0;
			s4 = 0;
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
						sz[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				s1 += sz[i][0];
				s2 += sz[i][n - 1];
			}
			for (j = 0;j < n;j++)
			{
				s3 += sz[0][j];
				s4 += sz[m - 1][j];
			}
			s += s1 + s2 + s3 + s4 - sz[0][0] - sz[0][n - 1] - sz[m - 1][0] - sz[m - 1][n - 1];
			sf[l] = s;
		}
		for (l = 0;l < k;l++)
		{
			System.out.printf("%d\n",sf[l]);
		}
		return 0;
	}
}

