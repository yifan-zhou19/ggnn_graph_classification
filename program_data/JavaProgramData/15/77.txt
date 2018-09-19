package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int num;
	  int l;
	  int k;
	  int p;
	  int q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int a1;
	  int b1;
	  int a2;
	  int b2;
	  int[][] square = new int[chang][kuan];
	  for (i = 0;i < n;i++)
	  {
		 for (j = 0;j < n;j++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				square[i][j] = Integer.parseInt(tempVar2);
			}
		 }
	  }
	  for (l = 0;l < n;l++)
	  {
		 for (k = 0;k < n;k++)
		 {
			if (square[l][k] == 0)
			{
			a1 = l;
			b1 = k;
			}
		 }
	  }
	  for (p = (n - 1);p >= 0;p--)
	  {
		 for (q = (n - 1);q >= 0;q--)
		 {
			if (square[p][q] == 0)
			{
			a2 = p;
			b2 = q;
			}
		 }
	  }
	   num = (a1 - a2 - 1) * (b1 - b2 - 1);
	  System.out.printf("%d",num);
	return 0;
	}

}

