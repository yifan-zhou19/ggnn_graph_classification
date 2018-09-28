package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int cow;
		int col;
		int i;
		int j;
		int k;
		int t;
		int max;
		int min;
		int m = 0;
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (cow = 0;cow < h;cow++)
		{
			for (col = 0;col < l;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[cow][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (cow = 0;cow < h;cow++)
		{
			max = a[cow][0];
			for (i = 0;i < l;i++)
			{
				if (a[cow][i] >= max)
				{
					max = a[cow][i];
					t = i;
				} //a[cow][t]??????????????i????}
			}
		  k = 0;
		  min = a[cow][t]; //???????
		for (j = 0;j < h;j++)
		{
			if (a[j][t] <= min != 0 && j != cow) //??????? K=1
			{
				k = 1;
			}
		}
		if (k == 0)
		{
		m = 1;
		System.out.printf("%d+%d",cow,t);
		}
		}
		if (m == 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}

