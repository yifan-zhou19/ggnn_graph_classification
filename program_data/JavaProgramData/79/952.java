package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   int j;
	   int i;
	   int l;
	   int m;
	   int n;
	  int[][] a = new int[20][2];
	  int p = 0;
	  for (j = 0;;j++)
	  {
	  for (l = 0;l <= 1;l++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[j][l] = Integer.parseInt(tempVar);
	  }
	  }
	  System.out.print("\n");
	  p++;
	  if ((a[j][0] == 0) || a[j][1] == 0)
	  {
	   break;
	  }
	  }
	  for (j = 0;j <= p;j++)
	  {
	  if ((0 < a[j][0] && a[j][0] <= 300) && (0 < a[j][1] && a[j][1] <= 300))
	  {
		  k = 0;
		for (i = 2;i <= a[j][0];i++)
		{
		 k = ((a[j][1] % i) + k) % i;
		}
				System.out.printf("%d\n",k + 1);
	  }
	  }
	}

}

