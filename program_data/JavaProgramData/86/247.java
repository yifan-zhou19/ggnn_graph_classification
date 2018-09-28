package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] a = new int[100];
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[][] times = new int[100][20];
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead("\n");
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  for (j = 0;j < a[i];j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  times[i][j] = Integer.parseInt(tempVar3);
			  }
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (a[i] == 0)
		  {
			  System.out.printf("\n%d",60);
		  }
		  else
		  {
			  for (j = 0;j < a[i];j++)
			  {
				  int b;
				  int c;
				  int d;
				  b = times[i][j] + 3 * (j + 1);
				  if (b >= 63)
				  {
					  c = 60 - (times[i][j - 1] + 3 * j);
					  d = times[i][j - 1] + c;
					  System.out.printf("\n%d",d);
							   break;
				  }
				  else if (b >= 60)
				  {
					  System.out.printf("\n%d",times[i][j]);
					  break;
				  }
			  }
			  if ((times[i][a[i] - 1] + 3 * a[i]) < 60)
			  {
				  k = 60 - a[i] * 3;
				  System.out.printf("\n%d",k);
			  }
		  }
	  }
	  return 0;
	}
}

