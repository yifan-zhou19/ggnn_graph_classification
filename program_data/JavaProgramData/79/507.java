package <missing>;

public class GlobalMembers
{
	public static int ysf(int n,int m)
	{
	 int i;
	 int s = 0;
	 for (i = 2;i <= n;i++)
	 {
	  s = (s + m) % i;
	 }
	 return (s + 1);
	}
	public static int Main()
	{
	 int[][] a = new int[300][2];
	 int i;
	 int x = 0;
	 do
	 {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[x][0] = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   a[x][1] = Integer.parseInt(tempVar2);
	   }
	   x++;
	 } while (a[x - 1][0] != 0 || a[x - 1][1] != 0);
	 for (i = 0;i < x - 1;i++)
	 {
	  System.out.printf("%d\n",ysf(a[i][0], a[i][1]));
	 }
	}



}

