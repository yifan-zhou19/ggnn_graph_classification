package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int t;
	int num;
	int[] b = new int[100];
	int[][] c = new int[100][61];
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
			   b[i] = Integer.parseInt(tempVar2);
		   }
		   for (j = 0;j < b[i];j++)
		   {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
			c[i][t - 1] = 1;
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
	   j = 0;
	   num = 0;
	   while (j < 60)
	   {
	   j++;
	   num++;
	   if (c[i][num] == 1)
	   {
	   j += 3;
	   if (j >= 60)
	   {
		   num += 1;
	   }
	   }
	   }
	  System.out.printf("%d\n",num);
	   }
	 return 0;
	}
}

