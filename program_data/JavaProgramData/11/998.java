package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  int i;
		  int j;
		  int k = 0;
		  int n;
		  int y;
		  int m;
		  int d;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  y = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  d = Integer.parseInt(tempVar3);
		  }
		  if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		  {
							  for (i = 1;i < m;i++)
							  {
								  k = k + b[i];
							  }
							  k = k + d;
							  System.out.printf("%d",k);
		  }
		  k = 0;
		  if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))
		  {
					for (i = 1;i < m;i++)
					{
						k = k + a[i];
					}
					k = k + d;
					System.out.printf("%d",k);
		  }
	}
}

