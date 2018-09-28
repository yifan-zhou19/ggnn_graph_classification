package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
	int i;
	int j;
	int max;
	int k;
	int q;
	int r = 0;
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	for (i = 0;i < 5;i++)
	{
		max = a[i][0];
		q = 0;
	for (j = 1;j < 5;j++)
	{
		if (a[i][j] > max)
		{
			max = a[i][j];
			q = j;
		}
	}
	 for (k = 0;k < 5;k++)
	 {
			 if (k == i)
			 {
			 continue;
			 }
		  if (a[k][q] <= a[i][q])
		  {
			  break;
		  }
			   if (a[k][q] > a[i][q])
			   {
					continue;
			   }
	 }
	  if (k == 5)
	  {
		  System.out.print(i + 1);
		  System.out.print(" ");
		  System.out.print(q + 1);
		  System.out.print(" ");
		  System.out.print(a[i][q]);
		  System.out.print("\n");
		  r++;
	  }
	}
	if (r == 0)
	{
		System.out.print("not found");
		System.out.print("\n");
	}
	return 0;
	}

}

