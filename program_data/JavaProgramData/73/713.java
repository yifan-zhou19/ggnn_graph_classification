package <missing>;

public class GlobalMembers
{
	public static int check(int[][] a, int h, int l)
	{
		int i;
		int j;
		for (i = 0;i < 5;i++) //???
		{
		  if (a[h][i] > a[h][l])
		  {
			  return 0; //?????number
		  }
		}
		for (i = 0;i < 5;i++) //scan hang
		{
		  if (a[i][l] < a[h][l])
		  {
			  return 0;
		  }
		}
		return 1;
	}
	public static int Main()
	{
	   int[][] a = new int[5][5];
	   int que = 30302;
	   int n = 0;
	   int posh;
	   int posl;
	   int i;
	   int j;
	   for (i = 0;i < 5;i++)
	   {
		 for (j = 0;j < 5;j++)
		 {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar);
		   }
		 }
	   }
	   for (i = 0;i < 5;i++)
	   {
		 for (j = 0;j < 5;j++)
		 {
		   if (check(a, i, j) != 0)
		   {
				 que = a[i][j];
				 posh = i + 1;
				 posl = j + 1;
		   }
		 }
	   }

		if (que != 30302)
		{
		  System.out.printf("%d %d %d",posh,posl,que);
		}
		else
		{
			System.out.print("not found");
		}
	  return 0;

	}

}

