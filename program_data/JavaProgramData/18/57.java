package <missing>;

public class GlobalMembers
{
	public static int find_min(int x, int side)
	{
		int i;
		int temp = 10001;
	   for (i = 0;i <= side-1;i++)
	   {
		 if (temp > a[x][i])
		 {
			 temp = a[x][i];
		 }
	   }
	  return temp;
	}
	public static int find_miny(int y, int side)
	{
	int i;
	int temp = 10001;
	   for (i = 0;i <= side-1;i++)
	   {
		 if (temp > a[i][y])
		 {
			 temp = a[i][y];
		 }
	   }
	  return temp;
	}
	public static int[][] a = new int[120][120]; //??,a[1][1]??
	public static int sum;
	public static void caozuo(int side)
	{
	  int i;
	  int j;
	  int t;
	  if (side == 1) //????==1
	  {
		  System.out.print(sum);
		  System.out.print("\n");
	  }
	  else
	  {
		 for (i = 0;i <= side-1;i++)
		 {
			 t = find_min(i, side);
			 for (j = 0;j <= side-1;j++)
			 {
			   a[i][j] -= t; //?
			 }
		 }
	for (i = 0;i <= side-1;i++)
	{
			 t = find_miny(i, side);
			 for (j = 0;j <= side-1;j++)
			 {
			   a[j][i] -= t; //??
			 }
	}

		 sum = sum + a[1][1]; //??
		if (side > 2) //??>2,??
		{
		  for (i = 2;i <= side-1;i++)
		  {
			 a[i - 1][0] = a[i][0];
			 a[0][i - 1] = a[0][i];
		  }
		  for (i = 2;i <= side-1;i++)
		  {
			 for (j = 2;j <= side-1;j++)
			 {
			   a[i - 1][j - 1] = a[i][j];
			 }
		  }
		}
		caozuo(side-1); //??
	  }

	}
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int k;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (k = 1;k <= n;k++)
	   {
		   sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		   memset(a,0,(Integer.SIZE / Byte.SIZE)); //??
		   for (i = 0;i <= n - 1;i++)
		   {
			   for (j = 0;j <= n - 1;j++)
			   {
				   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
		   }
			   caozuo(n); //??
	   }

	return 0;
	}

}

