package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[][] a = new int[100][21];
	 int i;
	 int j;
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
		   a[i][0] = Integer.parseInt(tempVar2);
	   }
	   for (j = 1;j <= a[i][0];j++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][j] = Integer.parseInt(tempVar3);
		}
	   }
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j <= a[i][0];j++)
	  {
		if (a[i][0] == 0)
		{
			 System.out.print("60\n");
			 break;
		}
		 else if (a[i][j] + 3 * (j - 1) >= 60)
		 {
			   System.out.printf("%d\n",60 - 3 * (j - 1));
			   break;
		 }
		   else if (a[i][j] + 3 * j >= 60)
		   {
				System.out.printf("%d\n",a[i][j]);
				break;
		   }
			else if (a[i][j] + 3 * j < 60 && j == a[i][0])
			{
				 System.out.printf("%d\n",60 - 3 * j);
				 break;
			}
	  }
	 }
	 return 0;
	}
}

