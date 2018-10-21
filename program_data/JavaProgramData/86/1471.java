package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int n;
	 int j;
	 int k;
	 int f;
	 int[] sz = new int[100];
	 int[][] sz2 = new int[100][100];

	 for (i = 0;i < 100;i++)
	 {
		 for (j = 0;j < 100;j++)
		 {
		 sz2[i][j] = 1;
		 }
	 }
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
	 for (k = 0;k < n;k++)
	 {
		 int t = 0;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 f = Integer.parseInt(tempVar2);
		 }
		 for (i = 0;i < f;i++)
		 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 sz[i] = Integer.parseInt(tempVar3);
		 }
		 }
	   for (j = 0;j < f;j++)
	   {
			   sz2[k][sz[j] + t * 3] = 0;
			   sz2[k][sz[j] + 1 + t * 3] = 0;
			  sz2[k][sz[j] + 2 + t * 3] = 0;
			  t++;
	   }
	 }

	for (k = 0;k < n;k++)
	{
		int p = 60;
	 for (i = 0;i < 60;i++)
	 {
	if (sz2[k][i] == 0)
	{
		p--;
	}
	 }
	System.out.printf("%d\n",p);
	}
	return 0;
	}
}

