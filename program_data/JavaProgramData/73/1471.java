package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10]; //?????i<5,j<5,a[i+1][j],a[i+2][j],a[i+3][j],a[i+4][j],a[i][j+1],a[i][j+2],a[i][j+3],a[i][j+4]??
		int b = 0;
		for (int i = 0;i < 5;i++)
		{
		  for (int j = 0;j < 5;j++)
		  {
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}
		for (int i = 0;i < 5;i++)
		{
		  for (int j = 5;j < 10;j++)
		  {
		  a[i][j] = a[i][j - 5];
		  }
		}
		for (int i = 0;i < 5;i++)
		{
		  for (int j = 5;j < 10;j++)
		  {
		  a[j][i] = a[j - 5][i];
		  }
		}
		for (int i = 0;i < 5;i++)
		{
		  for (int j = 0;j < 5;j++)
		  {
			if ((a[i][j] > a[i][j + 1]) && (a[i][j] > a[i][j + 2]) && (a[i][j] > a[i][j + 3]) && (a[i][j] > a[i][j + 4]) && (a[i][j] < a[i + 1][j]) && (a[i][j] < a[i + 2][j]) && (a[i][j] < a[i + 3][j]) && (a[i][j] < a[i + 4][j])) //?????????
			{
			  b = 1;
			  System.out.print(i + 1);
			  System.out.print(" ");
			  System.out.print(j + 1);
			  System.out.print(" ");
			  System.out.print(a[i][j]);
			  System.out.print("\n");
			}
		  }
		}
		if (b == 0)
		{
		System.out.print("not found");
		System.out.print("\n");
		}
		return 0;
	}
}

