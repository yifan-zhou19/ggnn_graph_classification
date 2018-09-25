package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int l;
	int m = 0;
	int[][] c = new int[100][100];
	int[] f = new int[100];
	for (j = 1;;j++)
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  c[j][1] = Integer.parseInt(tempVar);
	  }
	  if (c[j][1] == -1)
	  {
		  break;
	  }
	  for (i = 2;;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c[j][i] = Integer.parseInt(tempVar2);
		}
	   if (c[j][i] == 0)
	   {
		   break;
	   }
	   for (l = i;l >= 1;l--)
	   {
	   if (c[j][l] == 2 * c[j][i] || c[j][i] == 2 * c[j][l])
	   {
		   f[j]++;
	   }
	   }
	  }
	 m++;
	}
	for (j = 1;j <= m;j++)
	{
	System.out.printf("%d\n",f[j]);
	}
	}
}

