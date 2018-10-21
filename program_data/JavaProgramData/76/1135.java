package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[][] a = new int[M][2];
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (int j = 0;j < 2;j++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i][j]) = Integer.parseInt(tempVar2);
			}
		  }
	  }
	  int k;
	  int l;
	  int e;
	  for (k = 1;k <= n;k++)
	  {
		  for (l = 0;l < (n - k);l++)
		  {
			  if (a[l][0] > a[l + 1][0])
			  {
				e = a[l][0];
				a[l][0] = a[l + 1][0];
				a[l + 1][0] = e;
				e = a[l][1];
				a[l][1] = a[l + 1][1];
				a[l + 1][1] = e;
			  }
		  }
	  }
	  int[] qj = new int[2];
	  qj[0] = a[0][0];
	  qj[1] = a[0][1];
	  for (k = 1;k < n;k++)
	  {
		  if (a[k][0] > qj[1])
		  {
			System.out.print("no");
			break;
		  }
		  else if (a[k][0] == qj[1])
		  {
			qj[1] = a[k][1];
		  }
		  else if (a[k][0] < qj[1])
		  {
			  if (a[k][1] > qj[1])
			  {
				qj[1] = a[k][1];
			  }
		  }
		  if (k == (n - 1) && (a[k][0] <= qj[1]))
		  {
			System.out.printf("%d %d",qj[0],qj[1]);
		  }
	  }

	return 0;
	}
}

