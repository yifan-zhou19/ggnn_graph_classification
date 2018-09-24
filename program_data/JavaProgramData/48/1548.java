package <missing>;

public class GlobalMembers
{
	public static void prop(int[][] num1, int[][] num2, int n)
	{
		 int i;
		 int j;
		 if (n != 0)
		 {
		 for (i = 1;i < 10;i++)
		 {
			 for (j = 1;j < 10;j++)
			 {
			 num2[i][j] = num1[i - 1][j - 1] + num1[i - 1][j] + num1[i - 1][j + 1] + num1[i][j - 1] + num1[i][j] * 2 + num1[i][j + 1] + num1[i + 1][j - 1] + num1[i + 1][j] + num1[i + 1][j + 1];
			 }
		 }
		 prop(num2, num1, n - 1);
		 }
	}

	public static int Main()
	{
		  int m;
		  int n;
		  int[][] num1 = new int[11][11];
		  int[][] num2 = new int[11][11];
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  num1[5][5] = m;
		  prop(num1, num2, n);
		  if (n % 2 == 0)
		  {
		  for (i = 1;i < 10;i++)
		  {
			  for (j = 1;j < 9;j++)
			  {
				  System.out.printf("%d ",num1[i][j]);
			  }
			  System.out.printf("%d\n",num1[i][9]);
		  }
		  }
		  else
		  {
		  for (i = 1;i < 10;i++)
		  {
			  for (j = 1;j < 9;j++)
			  {
				  System.out.printf("%d ",num2[i][j]);
			  }
			  System.out.printf("%d\n",num2[i][9]);
		  }
		  }

	}

}

