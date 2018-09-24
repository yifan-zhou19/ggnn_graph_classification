package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int m;
		int n;
		int p;
		int q;
		int[] max1 = new int[10];
		int[] max2 = new int[10];
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
		for (p = 0;p < m;p++)
		{
			for (q = 0;q < n;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[p][q] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (p = 0;p < m;p++)
		{
			max1[p] = a[p][0];
			for (q = 1;q < n;q++)
			{
			   if (a[p][q] > max1[p])
			   {
			   max1[p] = a[p][q];
			   }
			}
		}
		for (q = 0;q < n;q++)
		{
			max2[q] = a[0][q];
			for (p = 1;p < m;p++)
			{
			   if (a[p][q] < max2[q])
			   {
			   max2[q] = a[p][q];
			   }
			}
		}
		for (p = 0;p < m;p++)
		{
			for (q = 0;q < n;q++)
			{
				if (max1[p] == a[p][q] && max2[q] == a[p][q])
				{
				System.out.printf("%d+%d",p,q);
				return 0;
				}
			}
		}
	  System.out.print("No");
	  return 0;
	}

}

