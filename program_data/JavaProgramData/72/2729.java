package <missing>;

public class GlobalMembers
{
	public static void dump()
	{
	}
	public static void seektop(int[] point, int m, int n)
	{
	 int i;
	 int j = 0;
	 for (j = 0;j < m;j++)
	 {
		 for (i = 0;i < n;i++)
		 {

	  if (i == 0 && j == 0)
	  {
	   point[i] >= point[i + 1] && point[i] >= point[i + 20]?System.out.printf("%d %d\n",j,i):dump();
	  }
	  else if (i == n - 1 && j == 0)
	  {
	   point[i] >= point[i - 1] && point[i] >= point[i + 20]?System.out.printf("%d %d\n",j,i):dump();
	  }
	  else if (j == 0)
	  {
	   point[i] >= point[i + 1] && point[i] >= point[i + 20] && point[i] >= point[i - 1]?System.out.printf("%d %d\n",j,i):dump();
	  }
	  else if (i == 0 && j != m - 1)
	  {
	   point[i] >= point[i + 1] && point[i] >= point[i + 20] && point[i] >= point[i - 20]?System.out.printf("%d %d\n",j,i):dump();
	  }
	  else if (i == n - 1 && j != m - 1)
	  {
	   (point[i] >= point[i - 1] && point[i] >= point[i + 20] && point[i] >= point[i - 20])?System.out.printf("%d %d\n",j,i):dump();
	  }
	  else if (i == 0 && j == m - 1)
	  {
	   (point[i] >= point[i + 1] && point[i] >= point[i - 20])?System.out.printf("%d %d\n",j,i):dump();
	  }
	  else if (i == n - 1 && j == m - 1)
	  {
	   point[i] >= point[i - 1] && point[i] >= point[i - 20]?System.out.printf("%d %d\n",j,i):dump();
	  }
	  else if (j == m - 1)
	  {
	   point[i] >= point[i - 1] && point[i] >= point[i - 20] && point[i] >= point[i + 1]?System.out.printf("%d %d\n",j,i):dump();
	  }
	  else
	  {
	   point[i] >= point[i - 1] && point[i] >= point[i + 20] && point[i] >= point[i - 20] && point[i] >= point[i + 1]?System.out.printf("%d %d\n",j,i):dump();
	  }
		 }
	  point = point + 20; //????????point=point+20*j?????????for??????????????????????
	 }
	}
	public static void Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
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
	 int[][] height =
	 {
		 {'\0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	 };
	 int[] point = height[0];
	 for (i = 0;i < m;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   height[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	 }
	  seektop(point, m, n);
	}

}

