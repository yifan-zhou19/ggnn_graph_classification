package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int h;
	 int[][] a = new int[5][5];
	 int c;
	 int d;
	 int e = 0;
	 for (i = 0;i <= 4;i++)
	 {
		 for (j = 0;j <= 4;j++)
		 {
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	 }
	 for (i = 0;i <= 4;i++)
	 {
		 for (j = 0;j <= 4;j++)
		 {
		  c = 0;
	   d = 0;
	   for (k = 0;k <= 4;k++)
	   {
		   if (a[i][j] < a[i][k])
		   {
			c = c + 1;
		   }
	   }
	   for (h = 0;h <= 4;h++)
	   {
		   if (a[i][j] > a[h][j])
		   {
			d = d + 1;
		   }
	   }
	   if (c == 0 && d == 0)
	   {
		   System.out.print(i + 1);
		   System.out.print(" ");
		   System.out.print(j + 1);
		   System.out.print(" ");
		   System.out.print(a[i][j]);
		   System.out.print("\n");
		e = e + 1;
	   }
		 }
	 }
	  if (e == 0)
	  {
		  System.out.print("not found");
		  System.out.print("\n");
	  }
	 return 0;
	}

}

