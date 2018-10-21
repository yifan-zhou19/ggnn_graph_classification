package <missing>;

public class GlobalMembers
{
	//*********************************************************************************
	//????
	/*?????? (5*5)??????????????????????? 
	?????????????????????????????????�not found�? 
	??????????????????????????????????? */
	//*********************************************************************************
	public static int max(int a,int b,int c,int d,int e) //?????????
	{
	   int p;
	   if (a > b)
	   {
		   p = a;
	   }
	   else
	   {
		   p = b;
	   }
	   if (p < c)
	   {
		   p = c;
	   }
	   if (p < d)
	   {
		   p = d;
	   }
	   if (p < e)
	   {
		   p = e;
	   }
	   return p;
	}
	public static int min(int a,int b,int c,int d,int e) //?????????
	{
	   int p;
	   if (a < b)
	   {
		   p = a;
	   }
	   else
	   {
		   p = b;
	   }
	   if (p > c)
	   {
		   p = c;
	   }
	   if (p > d)
	   {
		   p = d;
	   }
	   if (p > e)
	   {
		   p = e;
	   }
	   return p;
	}
	public static int Main()
	{
	   int[][] a = new int[5][5];
	   int i;
	   int j;
	   for (i = 0;i < 5;i++)
	   {
		   for (j = 0;j < 5;j++)
		   {
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   int k = 0;
	   for (i = 0;i < 5;i++)
	   {
		   for (j = 0;j < 5;j++)
		   {
			  if (max(a[i][0], a[i][1], a[i][2], a[i][3], a[i][4]) == min(a[0][j], a[1][j], a[2][j], a[3][j], a[4][j])) //????
			  {

				 k++;
				 int m;
				 int n;
				 m = i + 1;
				 n = j + 1; //?????????1
				 System.out.print(m);
				 System.out.print(' ');
				 System.out.print(n);
				 System.out.print(' ');
				 System.out.print(max(a[i][0], a[i][1], a[i][2], a[i][3], a[i][4]));
				 break;
			  }
		   }
	   }
		   if (k == 0)
		   {
				System.out.print("not found");
		   }
				return 0;

	}

}

