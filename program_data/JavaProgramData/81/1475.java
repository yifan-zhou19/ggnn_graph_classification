package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] array = new int[5][5];
	int i;
	int j;
	int n;
	int m;
	int exchange = new int(int array[5][5],int n,int m);
	for (i = 0;i < 5;i++)
	{
	   for (j = 0;j < 5;j++)
	   {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  array[i][j] = Integer.parseInt(tempVar);
		  }
	   }
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	if (exchange(array, n, m) != 0)
	{
				 for (i = 0;i < 5;i++)
				 {
					for (j = 0;j < 4;j++)
					{
					   System.out.printf("%d ",array[i][j]);
					}
					   System.out.printf("%d",array[i][4]);
					System.out.print("\n");
				 }
	}
				 else
				 {
					   System.out.print("error");
				 }
	return 0;
	}

	public static int exchange(int[][] array, int n, int m)
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int i;
		if ((n < 5 && n >= 0) && (m < 5 && m >= 0))
		{
		  for (i = 0;i < 5;i++)
		  {
			 a[i] = array[n][i];
		  }
		  for (i = 0;i < 5;i++)
		  {
			 b[i] = array[m][i];
		  }
		  for (i = 0;i < 5;i++)
		  {
			 array[m][i] = a[i];
		  }
		  for (i = 0;i < 5;i++)
		  {
			 array[n][i] = b[i];
		  }
		  return 1;
		}
		  else
		  {
				return 0;
		  }
	}

}

