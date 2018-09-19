package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int[][] s = new int[100][100];
			 int n;
			 int i;
			 int j;
			 int result;
			 int a = -1;
			 int b = -1;
			 int c = -1;
			 int d = -1;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
			 for (i = 0;i < n;i++)
			 {
					   for (j = 0;j < n;j++)
					   {
								String tempVar2 = ConsoleInput.scanfRead();
								if (tempVar2 != null)
								{
									s[i][j] = Integer.parseInt(tempVar2);
								}
					   }
			 }

			 for (i = 0;i < n;i++)
			 {
					   for (j = 0;j < n;j++)
					   {
								if (s[i][j] == 0)
								{
										 a = i;
										 b = j;
										 break;
								}
					   }
					   if (a >= 0)
					   {
						   break;
					   }
			 }
			 for (i = n - 1;i >= 0;i--)
			 {
					   for (j = n - 1;j >= 0;j--)
					   {
								if (s[i][j] == 0)
								{
										 c = i;
										 d = j;
										 break;
								}
					   }
					   if (c >= 0)
					   {
						   break;
					   }
			 }
			 result = (c - a - 1) * (d - b - 1);
			 System.out.printf("%d",result);
			 return 0;
	}
}

