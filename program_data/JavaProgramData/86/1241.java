package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int x;
	   int[] a = new int[100];
	   int[][] b = new int[100][100];
	   int i;
	   int j;
	   int[] m = new int[100];
	   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < x;i++)
	   {
	   m[i] = 60;
	   }
	   for (i = 0;i < x;i++)
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   for (j = 0;j < a[i];j++)
		   {
			   b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   for (i = 0;i < x;i++)
	   {
	   for (j = 0;j < a[i];j++)
	   {
		   if (b[i][j] <= 57 - 3 * j)
		   {
			   m[i] = m[i] - 3;
		   }
		   else if (b[i][j] == 58 - 3 * j)
		   {
			   m[i] = m[i] - 2;
		   }
		   else if (b[i][j] == 59 - 3 * j)
		   {
			   m[i] = m[i] - 1;
		   }
		   else if (b[i][j] == 60 - 3 * j)
		   {
			   m[i] = m[i];
		   }
	   }
	   }
	   for (i = 0;i < x;i++)
	   {
		   System.out.print(m[i]);
		   System.out.print("\n");
	   }
	}
}

