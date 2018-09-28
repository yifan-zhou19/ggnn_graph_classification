package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			   char[][] ID = new char[N][L];
			   char[][] IDup60 = new char[N][L];
			   char[][] IDunder60 = new char[N][L];
			   String s = new String(new char[L]);
			   int b;
			   int h;
			   int i;
			   int j;
			   int k;
			   int l;
			   int m;
			   int max = 0;
			   int n;
			   int o;
			   int p;
			   int q;
			   int t = 0;
			   int u = 0;
			   int[] YearOld = new int[N];
			   int[] YearOldup60 = new int[N];
			   int[] id = new int[N];
			   int[] idup60 = new int[N];
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   n = Integer.parseInt(tempVar);
			   }
			   for (h = 0;h < n;h++)
			   {
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 ID[h] = tempVar2.charAt(0);
					 }
					 String tempVar3 = ConsoleInput.scanfRead(" ");
					 if (tempVar3 != null)
					 {
						 YearOld[h] = Integer.parseInt(tempVar3);
					 }
					 id[h] = 0;
			   }
			   for (i = 0;i < n;i++)
			   {
					 for (j = 0;ID[i][j] != '\0';j++)
					 {
							id[i] = 10 * id[i];
							id[i] = id[i] + (ID[i][j] - '0');
					 }
			   }
			   for (m = 0;m < n;m++)
			   {
					 if (YearOld[m] > max)
					 {
					 max = YearOld[m];
					 }
			   }
			   for (k = 0;k <= max;k++)
			   {
					 for (l = 0;l < n;l++)
					 {
							if (YearOld[l] == max - k && max - k >= 60)
							{
								   YearOldup60[t] = YearOld[l];
								   idup60[t] = id[l];
								   IDup60[t] = ID[l];
								   t++;
							}
					 }
			   }
			  for (b = 0;b < n;b++)
			  {
					if (YearOld[b] < 60)
					{
						   IDunder60[u] = ID[b];
						   u++;
					}
			  }
			  for (p = 0;p < t;p++)
			  {
					System.out.printf("%s\n",IDup60[p]);
			  }
			  for (q = 0;q < u;q++)
			  {
					System.out.printf("%s\n",IDunder60[q]);
			  }
	}
}

