package <missing>;

public class GlobalMembers
{
	//********************************
	//* ???12.7??�????   **
	//* ??:?? ???1000012888  **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int b;
		int k;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100000][2];
		i = 0;
		a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a[i][0] + a[i][1]) != 0)
		{
			  i = i + 1;
			  a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		t = i - 1;
		for (j = 0; j <= n - 1; j++)
		{
			  b = 0;
			  for (i = 0; i <= t; i++)
			  {
					if (a[i][0] == j)
					{
								b = 1;
								break;

					}
			  }
			  if (b == 0)
			  {
				   k = j;
				   break;
			  }
		}
	   c = 0;
	   for (i = 0; i <= t; i++)
	   {
		   if (a[i][1] == k)
		   {
		   c = c + 1;
		   }
	   }
	   if (c == n - 1)
	   {
	   System.out.print(k);
	   System.out.print("\n");
	   }
	   else
	   {
	   System.out.print("NOT FOUND");
	   System.out.print("\n");
	   }
	   return 0;
	}

}

