package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] c = new int[100][100];
	 int t;
	 int n = 0;
	 int m;
	 int[] d = new int[100];
	 int[] q = new int[100];
	 int i;
	 int z = 0;
	 int x = 0;

	 t = 0;
	 do
	 {
	  i = 0;
	  do
	  {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   c[t][i] = Integer.parseInt(tempVar);
	   }
	   if (c[t][0] == -1)
	   {
		   break;
	   }
	   if (c[t][i] == 0)
	   {
		   break;
	   }
	   i++;
	   d[t]++;
	  }while (i <= 100);
	  if (c[t][0] == -1)
	  {
		  break;
	  }
	  t++;
	  n++;
	 }while (t <= 100);
		do
		{
	  i = 0;
	  do
	  {
	   m = 0;
	   do
	   {
		if ((c[z][i] * 2) == c[z][m])
		{
			q[z]++;
		}
		m++;
	   }while (m <= d[z] - 1);
	   i++;
	  }while (i <= d[z] - 1);
	  z++;
		}while (z <= n - 1);
	 while (x <= n - 1)
	 {
	  System.out.printf("%d\n",q[x]);
	  x++;
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 t = Integer.parseInt(tempVar2);
	 }
	 return 0;
	}


}

