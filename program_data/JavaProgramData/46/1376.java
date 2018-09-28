package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
	int hang;
	int lie;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		hang = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		lie = Integer.parseInt(tempVar2);
	}
	for (int a = 0;a < hang;a++)
	{
		for (int b = 0;b < lie;b++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  sz[a][b] = Integer.parseInt(tempVar3);
		  }
		}
	}
	int c;
	int d;
	int e;
	int f;
	int hs = 0;
	int ls = 0;
	int hz = hang - 1;
	int lz = lie-1;
	while (hs <= hz != 0 && ls <= lz)
	{
		if (hs != hz && lz != ls)
		{
			for (c = ls;c <= lz - 1;c++)
			{
		  System.out.printf("%d\n",sz[hs][c]);
			}
		for (d = hs;d <= hz - 1;d++)
		{
		  System.out.printf("%d\n",sz[d][lz]);
		}
		for (e = lz;e >= ls + 1;e--)
		{
		  System.out.printf("%d\n",sz[hz][e]);
		}
		for (f = hz;f >= hs + 1;f--)
		{
		  System.out.printf("%d\n",sz[f][ls]);
		}
		}

	else
	{
		for (int m = hs;m <= hz;m++)
		{
		  for (int n = ls;n <= lz;n++)
		  {
			System.out.printf("%d\n",sz[m][n]);
		  }
		}
	}
		hs++;
		ls++;
		hz--;
		lz--;
	}

	return 0;
	}
}

