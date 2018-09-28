package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int e;
	   int[][] s = new int[50000][2];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (int i = 0;i <= n - 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s[i][0] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   s[i][1] = Integer.parseInt(tempVar3);
		   }
	   }
	   for (int k = 1;k <= n;k++)
	   {
		   for (int i = 0;i <= n - k;i++)
		   {
			   if (s[i + 1][0] >= s[i][0])
			   {
				   e = s[i + 1][0];
				   s[i + 1][0] = s[i][0];
				   s[i][0] = e;
				   e = s[i + 1][1];
				   s[i + 1][1] = s[i][1];
				   s[i][1] = e;
			   }
		   }
	   }
	   for (int a = n - 1;a >= 1;a--)
	   {
		   if (s[a - 1][0] > s[a][1])
		   {
			   System.out.print("no");
			   break;
		   }
		   else
		   {
			   s[a - 1][0] = s[a][0];
			   if (s[a][1] > s[a - 1][1])
			   {
				   s[a - 1][1] = s[a][1];
			   }


		   }
		   if (a == 1)
		   {
			   System.out.printf("%d %d",s[0][0],s[0][1]);
		   }
	   }

	 return 0;
	}
}

