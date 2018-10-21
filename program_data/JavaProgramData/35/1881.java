package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a = new int[20][20];
	  int i;
	  int j;
	  int m;
	  int n;
	  int flag1;
	  int flag2;
	  int flag = 0;
	  int h;
	  int l;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  h = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(",");
	  if (tempVar2 != null)
	  {
		  l = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < h;i++)
	  {
		for (j = 0;j < l;j++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i][j] = Integer.parseInt(tempVar3);
		 }

		}

	  }
	  for (i = 0;i < h;i++)
	  {
	   for (j = 0;j < l;j++)
	   {
		   flag1 = 1;
		   flag2 = 1;
		for (m = 0;m < l;m++)
		{
		  if (a[i][j] < a[i][m])
		  {
			  flag1 = 0;
		  }
		}
		for (n = 0;n < h;n++)
		{
		  if (a[i][j] > a[n][j])
		  {
			  flag2 = 0;
		  }

		}
		if ((flag1 * flag2) != 0)
		{
			System.out.printf("%d+%d",i,j);
			flag = 1;
		}
	   }

	  }
	if (flag == 0)
	{
		System.out.print("No");
	}


	}

}

