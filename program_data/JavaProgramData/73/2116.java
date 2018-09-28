package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a = new int[5][5];
	  int[] b = new int[5];
	  int[] c = new int[5];
	  int i;
	  int j;
	  int t;
	  t = 0;
	  for (i = 0;i < 5;i++)
	  {
	   for (j = 0;j < 5;j++)
	   {
		 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	  }
	  for (i = 0;i < 5;i++)
	  {
		b[i] = a[i][0];
	  }
	  for (j = 0;j < 5;j++)
	  {
		c[j] = a[0][j];
	  }
	  for (i = 0;i < 5;i++)
	  {
		for (j = 0;j < 5;j++)
		{
		  if (a[i][j] > b[i])
		  {
		   b[i] = a[i][j];
		  }
		  if (a[i][j] < c[j])
		  {
			c[j] = a[i][j];
		  }
		}
	  }
	  for (i = 0;i < 5;i++)
	  {
		for (j = 0;j < 5;j++)
		{
		  if (b[i] == c[j])
		  {
			System.out.print(i + 1);
			System.out.print(" ");
			System.out.print(j + 1);
			System.out.print(" ");
			System.out.print(b[i]);
			System.out.print("\n");
			t++;
		  }
		}
	  }
	  if (t == 0)
	  {
	   System.out.print("not found");
	   System.out.print("\n");
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}



}

