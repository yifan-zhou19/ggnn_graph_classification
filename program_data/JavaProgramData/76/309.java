package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[49998][2];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < 2;j++)
		   {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar2);
			  }
		   }
		}
		for (j = 0;j < n;j++)
		{
		   for (i = 1;i < n;i++)
		   {
			  if ((a[0][0] <= a[i][1] != 0 && a[0][1] >= a[i][0]) || (a[0][0] >= a[i][1] != 0 && a[0][1] <= a[i][0]))
			  {
						a[0][0] = (a[0][0] > a[i][0])?a[i][0]:a[0][0];
						a[0][1] = (a[0][1] > a[i][1])?a[0][1]:a[i][1];
			  }
		   }
		}
		for (i = 1;i < n;i++)
		{
			  if ((a[0][0] > a[i][0]) || (a[0][1]) < a[i][1])
			  {
						System.out.print("no");
						break;
			  }
		}
		if (i == n)
		{
			  System.out.printf("%d %d",a[0][0],a[0][1]);
		}
		return 0;
	}

}

