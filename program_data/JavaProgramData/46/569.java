package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int i;
	   int j;
	   int k;
	   int[][] s = new int[100][100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   b = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < a;i++)
	   {
		   for (j = 0;j < b;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   s[i][j] = Integer.parseInt(tempVar3);
			   }
		   }
	   }
	   for (k = 0;k < a * 1.0 / 2 && k < b * 1.0 / 2;k++)
	   {
		   if (b <= a != 0 && k * 2 == b - 1)
		   {
				for (i = k;i <= a - k - 1;i++)
				{
					 System.out.printf("%d\n",s[i][k]);
				}
		   }
		   else if (a < b && k * 2 == a - 1)
		   {
				for (j = k;j <= b - k - 1;j++)
				{
					 System.out.printf("%d\n",s[k][j]);
				}
		   }
		   else
		   {
				for (j = k;j <= b - k - 1;j++)
				{
					 System.out.printf("%d\n",s[k][j]);
				}
				for (i = k + 1;i <= a - k - 1;i++)
				{
					 System.out.printf("%d\n",s[i][b - k - 1]);
				}
				for (j = b - k - 2;j >= k;j--)
				{
					 System.out.printf("%d\n",s[a - k - 1][j]);
				}
				for (i = a - k - 2;i >= k + 1;i--)
				{
					 System.out.printf("%d\n",s[i][k]);
				}
		   }
	   }
	   return 0;
	}
}

