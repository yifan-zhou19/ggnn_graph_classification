package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[100][100];
		  int[][] b = new int[100][100];
		  int x1;
		  int y1;
		  int x2;
		  int y2;
		  int x3;
		  int y3;
		  int c;
		  int d;
		  int[][] e = new int[100][100];
		  char i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x1 = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  y1 = Integer.parseInt(tempVar2);
		  }

		  for (c = 0;c <= x1 - 1;c++)
		  {
			  for (d = 0;d <= y1 - 1;d++)
			  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[c][d] = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(null, 1);
			  if (tempVar4 != null)
			  {
				  i = tempVar4.charAt(0);
			  }
			  if (i != ' ')
			  {
			  break;
			  }
			  else
			  {
				  ;
			  }
			  }

		  }
		   String tempVar5 = ConsoleInput.scanfRead();
		   if (tempVar5 != null)
		   {
			   x2 = Integer.parseInt(tempVar5);
		   }
		   String tempVar6 = ConsoleInput.scanfRead(" ");
		   if (tempVar6 != null)
		   {
			   y2 = Integer.parseInt(tempVar6);
		   }
		  for (c = 0;c <= x2 - 1;c++)
		  {
			  for (d = 0;d <= y2 - 1;d++)
			  {
			  String tempVar7 = ConsoleInput.scanfRead();
			  if (tempVar7 != null)
			  {
				  b[c][d] = Integer.parseInt(tempVar7);
			  }
			  String tempVar8 = ConsoleInput.scanfRead(null, 1);
			  if (tempVar8 != null)
			  {
				  i = tempVar8.charAt(0);
			  }
			  if (i != ' ')
			  {
			  break;
			  }
			  else
			  {
				  ;
			  }
			  }

		  }
		  x3 = x1;
		  y3 = y2;
		 // printf("%d\n",a[0][4]);
		  for (c = 0;c <= x3 - 1;c++)
		  {
			  for (d = 0;d <= y3 - 1;d++)
			  {
			  e[c][d] = 0;
			  for (i = 0;i <= x2 - 1;i++)
			  {
				  e[c][d] = e[c][d] + a[c][i] * b[i][d];
			  //printf("%d %d %d\n",i,c,d);
			  //printf("%d %d %d\n",a[c][i],b[i][d],e[c][d]);
			  }
			  }

		  }
		  for (c = 0;c <= x3 - 1;c++)
		  {
			  for (d = 0;d <= y3 - 2;d++)
			  {
			  System.out.printf("%d ",e[c][d]);
			  }
		  System.out.printf("%d\n",e[c][y3 - 1]);
		  }
		  //printf("%d",e[0][1]);

	}
}

