package <missing>;

public class GlobalMembers
{
	/*?????
	 *??? 2010-11-13
	 *?????
	 */
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int t = 0;
		int m;
		int n;
	double[][] a = new double[1000][100]; //?????????
	a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	 while (a[i][j] != -1)
	 {
		 while (a[i][j] != 0)
		 {
			 a[i][j + 1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 j++;
		 }
		 j++;
			 for (m = 0;m < j - 1;m++)
			 {
				 for (n = m + 1;n < j - 1;n++)
				 {
					 if (a[i][m] / a[i][n] == 2.0 || a[i][m] / a[i][n] == 0.5)
					 {
						 t++;
					 }
				 }
			 }
		 i++;
		 j = 0;
		 a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		 System.out.print(t);
		 System.out.print("\n");
		 t = 0; //??
	 }
	 return 0;
	}

}

