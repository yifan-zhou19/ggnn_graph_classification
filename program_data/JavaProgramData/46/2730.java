package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[288][288];
	   int n;
	   int m;
	   int i;
	   int j;
	   int t;
	   int x;
	   int y;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   for (i = 1;i <= n;i++)
	   {
	   for (j = 1;j <= m;j++)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
	   }
	   }
	   x = n,y = m;
	   i = 1;
	   j = 1;
	   do
	   {
	   for (t = j;t <= y;t++)
	   {
	   System.out.printf("%d\n",a[i][t]);
	   }
	   i = i + 1;
	   if (i > x)
	   {
	   break;
	   }
	   for (t = i;t <= x;t++)
	   {
	   System.out.printf("%d\n",a[t][y]);
	   }
	   y = y - 1;
	   if (y < j)
	   {
	   break;
	   }
	   for (t = y;t >= j;t--)
	   {
	   System.out.printf("%d\n",a[x][t]);
	   }
	   x = x - 1;
	   if (i > x)
	   {
		   break;
	   }
	   for (t = x;t >= i;t--)
	   {
	   System.out.printf("%d\n",a[t][j]);
	   }
	   j = j + 1;
	   if (y < j)
	   {
		   break;
	   }
	   } while ((i <= x) && (j <= y));
	}

}

