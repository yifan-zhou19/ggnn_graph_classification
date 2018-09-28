package <missing>;

public class GlobalMembers
{
	public static void find(int[][] x, int m, int n)
	{
		int i;
		int j;
		int k;
		int num;
		int nam;
		int all = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				 num = 0;
				 nam = 0;
			 for (k = 0;k < n;k++)
			 {
				 if (x[i][k] > x[i][j])
				 {
				  num++;
				 }
			 }
			 for (k = 0;k < m;k++)
			 {
			  if (x[k][j] < x[i][j])
			  {
				  nam++;
			  }
			 }
			 if (num == 0 && nam == 0)
			 {
				 System.out.printf("%d+%d\n",i,j);
			 all++;
			 }
			}
		}
			if (all == 0)
			{
				System.out.print("No");
			}
	}
	public static void Main()
	{
	   int[][] as = new int[100][100];
	   int i;
	   int j;
	   int a;
	   int b;
	   char c;
	//void find(*x,int m,int n)
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   c = System.in.read();
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < a;i++)
	   {
		   for (j = 0;j < b;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   as[i][j] = Integer.parseInt(tempVar3);
			   }
		   }
	   }
		   find(as, a, b);
	}
}

