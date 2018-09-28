package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[][] Main_a = new int[105][105];
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int a[105][105];
			 int i;
			 int j;
			 int k;
			 int n;
			 int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < m;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				Main_a[i][j] = Integer.parseInt(tempVar3);
			}
		}
		}


			 for (i = 0,j = 0;i < n;)
			 {
				for (k = i;k < n && i + j - k >= 0;k++)
				{
						System.out.printf("%d\n",Main_a[k][i + j - k]);
				}
				   if (j != m - 1)
				   {
					   j++;
				   }
				   else if (j == m - 1)
				   {
					   i++;
				   }
			 }
	}
}

