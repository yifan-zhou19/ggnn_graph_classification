package <missing>;

public class GlobalMembers
{
	public static int comp(Object p, Object q)
	{
		return ((int)q - (int)p);
	}
	public static int Main()
	{
	 int[] n = new int[50];
	 int[][] tianji = new int[50][1000];
	 int[][] qiwang = new int[50][1000];
	 int[] result = new int[50];
	 int i;
	 int j;
	 int ii;
	 int jj;
	 int max;
	 int max0;
	 int nmax;
	 int cmax;
	 int cnmax;
	 int tb;
	 int tm;
	 int qb;
	 int qm;
	 i = 0;
	 while (true)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n[i] = Integer.parseInt(tempVar);
		 }
	 if (n[i] == 0)
	 {
		 break;
	 }
	 for (j = 0;j < n[i];j++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			tianji[i][j] = Integer.parseInt(tempVar2);
		}
	 }

	 for (j = 0;j < n[i];j++)
	 {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			qiwang[i][j] = Integer.parseInt(tempVar3);
		}
	 }
	  qsort(tianji[i], n[i], (Integer.SIZE / Byte.SIZE), comp);
	  qsort(qiwang[i], n[i], (Integer.SIZE / Byte.SIZE), comp);
	  i++;
	 }

	 for (ii = 0;ii < i;ii++)
	 {
		result[ii] = 0;
		tb = 0;
		tm = n[ii] - 1;
		qm = n[ii] - 1;
		qb = 0;
		for (j = n[ii] - 1;j >= tb;j--)
		{

			if (tianji[ii][j] > qiwang[ii][qm])
			{
			  tm--;
			  qm--;
			  result[ii] = result[ii] + 200;

			}
			  else if (tianji[ii][j] < qiwang[ii][qm])
			  {
					 tm--;
				 qb++;
				 result[ii] = result[ii] - 200;
			  }
				 else if (tianji[ii][j] == qiwang[ii][qm])
				 {
					while (tianji[ii][tb] > qiwang[ii][qb])
					{
						   tb++;
					   qb++;
					   result[ii] = result[ii] + 200;
					}
					  if (tianji[ii][tb] < qiwang[ii][qb])
					  {
							  tm--;
						  qb++;
						  result[ii] = result[ii] - 200;
					  }
					  else if (tianji[ii][tb] == qiwang[ii][qb] && j > tb)
					  {
						   if (tianji[ii][j] < qiwang[ii][qb])
						   {
						   result[ii] = result[ii] - 200;
						   }
							qb++;
							tm--;
					  }

				 }
		}
		  System.out.printf("%d\n",result[ii]);
	 }
	return 0;
	}


}

