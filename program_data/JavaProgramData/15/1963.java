package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] h = new int[100];
	  int w = 0;
	  int q;
	  int[][] a = new int[100][100];
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 1;i <= n;i++)
	  {
		   h[i] = 0;
		   for (int j = 1;j <= n;j++)
		   {
		   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (a[i][j] == 0)
		   {
		   h[i]++;
		   }
		   }
	  }
	   for (int i = 1;i <= n;i++)
	   {
		   if (h[i] != 0)
		   {
		   q = h[i];
		   break;
		   }
	   }
	   for (int i = 1;i <= n;i++)
	   {
		   if (h[i] != 0)
		   {
			  w++;
		   }
		  else
		  {
			  continue;
		  }
	   }


	   int m = (q - 2) * (w - 2);
	   System.out.print(m);
	}
}

