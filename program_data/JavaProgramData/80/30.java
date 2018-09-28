package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int j;
	  int i;
	  int[] f = new int[3];
	  int[] l = new int[3];
	  int[] leap = {0, 0};
	  int[] mth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  int n = 0;
	  int inter = 0;
	  int df = 0;
	  int df2 = 0;
	  int dl = 0;
	  int dn = 0;
	  int lp = int y;
	  for (i = 0;i <= 2;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  f[i] = Integer.parseInt(tempVar);
		  }
	  }
	  for (i = 0;i <= 2;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  l[i] = Integer.parseInt(tempVar2);
		  }
	  }
	  leap[0] = lp(f[Y]);
	  leap[1] = lp(l[Y]);
	  i = f[Y] + 1;


		 if (i < l[Y])
		 {
			 for (;i < l[Y];i++)
			 {
				 inter += (lp(i) + 365);
			 }
		 }
		 j = 0;
		 while (j < l[M] - 1)
		 {
			 dl += mth[j];
			 j++;
		 }
		 dl += l[D];
		 if (leap[1] == 1 && l[M] > 2)
		 {
			 dl++;
		 }
		 j = 0;
		 while (j < f[M] - 1)
		 {
			 df += mth[j];
			 j++;
		 }
		 df += f[D];
		 if (leap[0] == 1 && l[M] > 2)
		 {
			 df++;
		 }
	   if (f[Y] <= l[Y])
	   {
		df2 = 365 + leap[0] - df;
		 dn = df2 + dl + inter;
	   }


	  if (l[Y] == f[Y])
	  {
		  dn = dl - df;
	  }

	  System.out.printf("%d",dn);
	}
	public static int lp(int y)
	{
	  return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
	}
}

