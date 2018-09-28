package <missing>;

public class GlobalMembers
{
	public static int[][] j = new int[5][5];
	public static int change()
	{
		 int i;
		 int m;
		 int n;
		 int k;
		 int l;
		 int[] z = new int[5];
			for (k = 0;k < 5;k++)
			{
		   for (l = 0;l < 5;l++)
		   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   j[k][l] = Integer.parseInt(tempVar);
			   }
		   }
			}
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   n = Integer.parseInt(tempVar3);
	   }
		 if (m < 0 || m>4 || n < 0 || n>4)
		 {
			 return 0;
		 }
		 else
		 {
			 for (i = 0;i < 5;i++)
			 {
				 z[i] = j[m][i];
			 }
			 for (i = 0;i < 5;i++)
			 {
				 j[m][i] = j[n][i];
			 }
			 for (i = 0;i < 5;i++)
			 {
				 j[n][i] = z[i];
			 }
			 return 1;
		 }

	}
	public static void Main()
	{
	   int fh;
	   int k;
	   int l;
	   fh = change();
	   if (fh == 0)
	   {
		   System.out.print("error");
	   }
	   else
	   {
		for (k = 0;k < 5;k++)
		{
			System.out.printf("%d",j[k][0]);
			for (l = 1;l < 5;l++)
			{
				System.out.printf(" %d",j[k][l]);
			}
		   System.out.print("\n");
		}
	   }
	}


}

