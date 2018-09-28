package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int h;
		int l;
		int i;
		int j;
		int k;
		int count = 0;
		int count2 = 0;
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
		int[][] a = new int[8][8];
		int[] max = new int[8];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 a[i][j] = Integer.parseInt(tempVar3);
				 }
			}
		}
		 for (i = 0;i < m;i++)
		 {
			 max[i] = a[i][0];
			 for (j = 0;j < n;j++)
			 {
				  if (a[i][j] >= max[i])
				  {
					   max[i] = a[i][j];
					   h = i;
					   l = j;
				  }
			 }
			  for (k = 0;k < m;k++)
			  {
				   if (a[k][l] < max[i])
				   {
						count++;
				   }
			  }
			   if (count == 0)
			   {
					System.out.printf("%d+%d",h,l);
					break;
			   }
			   else
			   {
					count2++;
			   }
		 }
		 if (count2 == m)
		 {
			 System.out.print("No");
		 }
		return 0;
	}
}

