package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
	 int n;
	 int m;
	 int i;
	 int j;
	 int f;
	 int[][] zf = new int[5][5];
	 for (i = 0;i < 5;i++)
	 {
		 for (j = 0;j < 5;j++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 zf[i][j] = Integer.parseInt(tempVar);
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
	 if ((n >= 5 || n < 0) || (m >= 5 || m < 0))
	 {
		 System.out.print("error");
	 }
	 else
	 {
	  for (i = 0;i < 5;i++)
	  {
		  if (i == n)
		  {
			  f = m;
		  }
		  else if (i == m)
		  {
		  f = n;
		  }
		  else
		  {
		  f = i;
		  }
		  for (j = 0;j < 5;j++)
		  {
			  if (j == 0)
			  {
			  System.out.printf("%d",zf[f][j]);
			  }
			  else if (j == 4)
			  {
			  System.out.printf(" %d\n", zf[f][j]);
			  }
			  else
			  {
			  System.out.printf(" %d", zf[f][j]);
			  }
		  }
	  }
	 }
	}
}

