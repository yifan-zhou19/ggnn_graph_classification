package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int j;
	int i;
	int m = 0;
	int n = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	int[][] x = new int[a][2];
	int c = 0;
	for (i = 0;i < a;i++)
	{
		  for (j = 0;j < 2;j++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x[i][j] = Integer.parseInt(tempVar2);
		  }
		  }
		  if (x[i][0] >= 90 && x[i][0] <= 140 && x[i][1] >= 60 && x[i][1] <= 90)
		  {
			 m++;
			 if (m > c && i == a - 1)
			 {
							 c = m;
							 break;
			 }
		  }
		  else
		  {
				   if (c < m)
				   {
					 c = m;
				   }
				 m = 0;
		  }
	}
	System.out.printf("%d",c);
	return 0;
	}


}

