package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int n;
		int q;
		int w;
		int e;
		int r;
		int C;
		int K;
		int T;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		  for (i = 0,j = 0;j < n,i < n;j++,i++)
		  {
				if (a[i][j] == 0)
				{
			break;
				}
		  }
			q = i;
			w = j;
		  for (i = q,j = w;j < n;j++)
		  {
			  if (a[i][j] == 255)
			  {
			 break;
			  }
		  }
		   e = j;
		  for (i = q,j = w;i < n;i++)
		  {
			  if (a[i][j] == 255)
			  {
			 break;
			  }
		  }
			  r = i;
		  C = e - w;
		  K = r - q;
		  T = (C - 2) * (K - 2);
		  System.out.printf("%d\n",T);
		  return 0;
	}
}

