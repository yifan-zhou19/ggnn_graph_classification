package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		char[][] a = new char[50][33];
		char[][] b = new char[50][33];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		   k = String.valueOf(a[i]).length();
		   if (a[i][k - 1] == 'r' || a[i][k - 1] == 'y')
		   {
			 for (m = 0;m < k - 2;m++)
			 {
			 b[i][m] = a[i][m];
			 }
			 b[i][k - 2] = '\0';
		   }
		   else if (a[i][k - 1] == 'g')
		   {
			   for (m = 0;m < k - 3;m++)
			   {
				   b[i][m] = a[i][m];
			   }
			   b[i][k - 3] = '\0';
		   }
		   System.out.printf("%s\n",b[i]);
		}
		return 0;
	}

}

