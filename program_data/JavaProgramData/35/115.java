package <missing>;

public class GlobalMembers
{
	/*???*/
	public static void Main()
	{
		int[][] a = new int[8][8];
		int[] b = new int[8];
		int m;
		int n;
		int i;
		int j;
		int max;
		int min;
		int flag = 0;
		int h;
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
			max = a[i][0];
			for (j = 1;j < n;j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
				}
			}
			b[i] = max;
		}
		for (j = 0;j < n;j++)
		{
			min = a[0][j];
			h = 0;
			for (i = 1;i < m;i++)
			{
				if (min > a[i][j])
				{
					min = a[i][j];
					h = i;
				}
			}
			if (min == b[h])
			{
				System.out.printf("%d+%d",h,j);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}

}

