package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int i;
		int j;
		int l;
		int h;
		int m;
		int n;
		int[][] sz = new int[50][50];
		int flaga = 0;
		int flagb = 0;
		int flagc = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		 for (i = 0;i < m;i++)
		 {
		   for (j = 0;j < n;j++)
		   {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 sz[i][j] = Integer.parseInt(tempVar3);
			 }
		   }
		 }

		for (i = 0;i < m;i++)
		{
		 for (j = 0;j < n;j++)
		 {
			{
				for (l = 0;l < n;l++)
				{
			  if (sz[i][j] < sz[i][l])
			  {
				  flaga++;
			  }
				}
			for (h = 0;h < m;h++)
			{
			  if (sz[i][j] > sz[h][j])
			  {
				  flagb++;
			  }
			}
		}
			if (flaga == 0 && flagb == 0)
			{
				   System.out.printf("%d+%d",i,j);
				   flagc = 1;
				   break;
			}
			  flaga = 0;
			  flagb = 0;
		 }
		}
		if (flagc == 0)
		{
			System.out.print("No");
		}

		return 0;

	 }


}

