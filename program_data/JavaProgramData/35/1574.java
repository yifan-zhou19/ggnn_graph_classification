package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int m;
	 int n;
	 int j;
	 int i;
	 int p;
	 int[][] a = new int[9][9];
	 int hang;
	 int lie;
	 int k;
	 int t;
	 int max;
	 int min;
	 int truth = 0;
	 char c;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar2 != null)
	 {
		 c = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 n = Integer.parseInt(tempVar3);
	 }
	   for (j = 0;j < m;j++)
	   {
	   for (i = 0;i < n;i++)
	   {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   a[j][i] = Integer.parseInt(tempVar4);
	   }
	   }
	   }

	   for (j = 0;j < m;j++)
	   {
		max = a[j][0];
			 lie = 0;
			for (i = 0;i < n;i++)
			{

				 if (a[j][i] > max)
				 {
					 max = a[j][i];
					   k = i;
					lie = k;
				 }
			}

		  min = a[j][lie];
		  hang = j;
				for (p = 0;p < m;p++)
				{

				   if (a[p][lie] < min)
				   {
					   min = a[p][lie];
					   t = p;
					 hang = t;
				   }
				}


		  if (max == min)
		  {
			  truth = 1;
		   System.out.printf("%d+%d\n",hang,lie);
		   break;
		  }
	   }
	   if (truth == 0)
	   {
	   System.out.print("No\n");
	   }
	}
}

