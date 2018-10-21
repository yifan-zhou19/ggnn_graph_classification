package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int flag;
		int[][] h = new int[22][22];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pa;
		int pa;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (i = 1;i <= m;i++)
	 {
		 for (j = 1;j <= n;j++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 h[i][j] = Integer.parseInt(tempVar3);
			 }
		 }
	 }
	 for (i = 1;i <= m;i++)
	 {
		 for (j = 1;j <= n;j++)
		 {
			 flag = 1;
		  pa = *(h + i) + j;
		  if (pa < h[i - 1][j])
		  {
			  flag = 0;
		  }
		  if (pa < h[i + 1][j])
		  {
			  flag = 0;
		  }
		  if (pa < h[i][j + 1])
		  {
			  flag = 0;
		  }
		  if (pa < h[i][j - 1])
		  {
			  flag = 0;
		  }
		  if (flag == 1)
		  {
			  System.out.printf("%d %d\n",i - 1,j - 1);
		  }
		 }
	 }
	}
}

