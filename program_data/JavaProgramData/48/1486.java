package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int h;
	  int l;
	  int i;
	  int m;
	  int n;
	  int j;
	  int y;
	  int[][] a = new int[11][11];
	  int[][] b = new int[11][11];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (h = 0;h < 11;h++)
	  {
		for (l = 0;l < 11;l++)
		{
		   a[h][l] = 0;
		   b[h][l] = 0;

		}
	  }
	 a[5][5] = m;
	   b[5][5] = m;
	  // printf("%d %d\n",a[4][4],b[4][4]);
	for (i = 0;i < n;i++)
	{
	  for (y = 0;y <= n;y++)
	  {
		for (j = 0;j <= n;j++)
		{
		   {
		  /// if((4-y==4-n)&&(4-j==4-n))
			   a[5 - y][5 - j] = 2 * b[5 - y][5 - j] + b[4 - y][4 - j] + b[4 - y][5 - j] + b[4 - y][6 - j] + b[5 - y][4 - j] + b[5 - y][6 - j] + b[6 - y][4 - j] + b[6 - y][5 - j] + b[6 - y][6 - j];

		  // b[h][l]=a[h][l];
		  // printf("%d %d\n",y,j);
		  //printf("a=%d+%d+%d+%d+%d+%d+%d+%d+%d\n",2*b[4-y][4-j],b[3-y][3-j],b[3-y][4-j],b[3-y][5-j],b[4-y][3-j],b[4-y][5-j],b[5-y][3-j],b[5-y][4-j],b[5-y][5-j]);

		}
		  a[5 + y][5 + j] = a[5 - y][5 - j];
		   a[5 - y][5 + j] = a[5 - y][5 - j];
		   a[5 + y][5 - j] = a[5 - y][5 - j];

		 /* else
		  { if(j==0&&y==0)  
		   { a[4][4]=2*b[4][4]+8*b[3][3] ;
		    //b[4][4]= a[4][4];
		    }
		   else
		   {
		     a[4-y][4-j]=2*b[4-y][4-j]+2*b[4-y][4]+b[4][4]+b[4-y][4-j];  
		   } 
		  // break;
		  } */         
		}
	  }
	  for (h = 0;h < 11;h++)
	  {
		for (l = 0;l < 11;l++)
		{

		   b[h][l] = a[h][l];
		   ;

		}
	  }
	}

	for (h = 1;h < 10;h++)
	{
		for (l = 1;l < 10;l++)
		{
			if (l != 9)
			{
				System.out.printf("%d ",b[h][l]);
			}
			else
			{
				System.out.printf("%d",b[h][l]);
			}
		}
		 System.out.print("\n");
	}
	 System.in.read();
	System.in.read();
	System.in.read();
	}
}

