package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[6][6];
	int[] b = new int[6];
	int[] c = new int[6];
	int temp = 0;
	for (int i = 1;i < 6;i++)
	{
	  for (int j = 1;j < 6;j++)
	  {
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	}
	for (int i = 1;i < 6;i++)
	{
	   a[i][0] = -999999999;
	   for (int j = 1;j < 6;j++)
	   {
		  if (a[i][j] > a[i][0])
		  {
			 a[i][0] = a[i][j];
			 b[i] = j;
		  }
	   }
	}
	for (int i = 1;i < 6;i++)
	{
	   a[0][i] = 999999999;
	   for (int j = 1;j < 6;j++)
	   {
		  if (a[j][i] < a[0][i])
		  {
			 a[0][i] = a[j][i];
			 c[i] = j;
		  }
	   }
	}
	for (int i = 1;i < 6;i++)
	{
	   if (a[0][b[i]] == a[i][0])
	   {
		  System.out.print(i);
		  System.out.print(' ');
		  System.out.print(b[i]);
		  System.out.print(' ');
		  System.out.print(a[i][0]);
		  temp = 1;
	   }
	}
	if (temp == 0)
	{
		System.out.print("not found");
	}
	System.in.read();
	System.in.read();
	return 0;
	}
}

