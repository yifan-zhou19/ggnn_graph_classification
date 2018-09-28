package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                            **
	//*????? 1100013004                     **
	//*???2010.10.28                          **
	//****************************************
	public static int Main()
	{
		int[][] a = new int[6][6]; //*l[6],h[6]??????????? **
		int[] l = new int[6];
		int[] h = new int[6];
		int i;
		int j;
		int flag = 1;
		for (i = 0;i < 5;i++)
		{
		   for (j = 0; j < 5;j++)
		   {
			  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}
		for (i = 0;i < 5;i++)
		{
			   l[i] = 0;
			   for (int j = 0;j < 5;j++)
			   {
				   if (a[i][j] > l[i])
				   {
					   l[i] = a[i][j];
				   }
			   }
			   h[i] = 100000000;
			   for (int j = 0;j < 5;j++)
			   {
				   if (a[j][i] < h[i])
				   {
					   h[i] = a[j][i];
				   }
			   }
		}
		for (i = 0;i < 5;i++)
		{
		   for (j = 0; j < 5;j++)
		   {
				 if (a[i][j] == l[i] && a[i][j] == h[j])
				 {
					 System.out.print(i + 1);
					 System.out.print(' ');
					 System.out.print(j + 1);
					 System.out.print(' ');
					 System.out.print(a[i][j]);
					 System.out.print("\n");
				 flag = 0;
				 }
		   }
		}
		if (flag != 0)
		{
		   System.out.print("not found");
		   System.out.print("\n");
		}

		return 0;
	}

}

