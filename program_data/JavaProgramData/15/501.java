package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[500][500];
		int x = 0;
		int y = 0;
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
		   a[i][j] = Integer.parseInt(tempVar2);
	   }
	  }
	 }

	for (i = 0;i < n;i++)
	{
	  for (j = 0;j < n;j++)
	  {
	   if (a[i][j] == 0)
	   {
		x++;
	   }
	  }
	  if (x != 0)
	  {
	   break;
	  }
	}
		for (j = 0;j < n;j++)
		{
	  for (i = 0;i < n;i++)
	  {
	   if (a[i][j] == 0)
	   {
		y++;
	   }
	  }
	  if (y != 0)
	  {
	   break;
	  }
		}
	 System.out.printf("%d\n",(x - 2) * (y - 2));


	return 0;


	}
}

