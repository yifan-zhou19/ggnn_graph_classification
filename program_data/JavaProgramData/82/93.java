package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int a = 0;
	   int[][] s = new int[200][2];
	   int[] u = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
			 for (j = 0;j < 2;j++)
			 {
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						s[i][j] = Integer.parseInt(tempVar2);
					}
			 }
	   }
	   for (i = 0;i < n + 1;i++)
	   {
			  if ((s[i][0] >= 90) && (s[i][0] <= 140) && (s[i][1] >= 60) && (s[i][1] <= 90))
			  {
				 u[a]++;
			  }
			  else
			  {
				  a++;
			  }
	   }
	   int b = u[0];
	   for (i = 0;i < a;i++)
	   {
			 if (b < u[i])
			 {
			 b = u[i];
			 }
	   }
		System.out.printf("%d\n",b);
		return 0;
	}
}

