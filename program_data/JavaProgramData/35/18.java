package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int j;
		int temp;
		int l;
		int num = 0;
		int k;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			{
				for (j = 0,temp = a[i][0],l = 0;j < n;j++)
				{
		   if (temp < a[i][j])
		   {
		   temp = a[i][j];
		   l = j;
		   }
				}
		}
			 for (k = 0;k < m && temp <= a[k][l];k++)
			 {
				 ;
			 }
		   if (k == m)
		   {
			   System.out.printf("%d+%d\n",i,l);
			   num = 1;
		   }
		}
		if (num == 0)
		{
			System.out.print("No");
		}
	}
}

