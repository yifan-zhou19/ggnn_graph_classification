package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
	  int x;
	  x = a > b != 0 ? a:b;
	  return x;
	}
	public static int min(int a,int b)
	{
	  int x;
	  x = a < b != 0 ? a:b;
	  return x;
	}

	public static int Main()
	{
	int[][] a = new int[5][5];
	int[] b = new int[5];
	int[] c = new int[5];
	int i;
	int j;
	int r = 0;
	for (i = 0;i < 5;i++)
	{
		  for (j = 0;j < 5;j++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar);
		  }
		  }
	}

	System.out.print("\n");
	for (i = 0;i < 5;i++)
	{
	  b[i] = max(a[i][0], max(a[i][1], max(a[i][2], max(a[i][3], a[i][4]))));
	}
	for (j = 0;j < 5;j++)
	{
	  c[j] = min(a[0][j], min(a[1][j], min(a[2][j], min(a[3][j], a[4][j]))));
	}

	for (i = 0;i < 5;i++)
	{
		 for (j = 0;j < 5;j++)
		 {
			  if (b[i] == c[j])
			  {
				System.out.printf("%d %d %d",i + 1,j + 1,b[i]);
				r = 1;
			  }
		 }
	}
	if (r == 0)
	{
		System.out.print("not found");
	}
	}
}

