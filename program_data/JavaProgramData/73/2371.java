package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int cow;
		int col;
		int i;
		int j;
		int k;
		int t;
		int max;
		int min;
		int cow1;
		int t1;
		int m = 0;
		for (cow = 0;cow <= 4;cow++)
		{
		for (col = 0;col <= 4;col++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[cow][col] = Integer.parseInt(tempVar);
		}
		}
		}
		for (cow = 0;cow <= 4;cow++)
		{
		max = a[cow][0];
		for (i = 0;i <= 4;i++)
		{
		if (a[cow][i] >= max)
		{
		max = a[cow][i];
		t = i; //a[cow][t]??????????????i????
		}
		}
		k = 0;
		min = a[cow][t];
		for (j = 0;j <= 4;j++)
		{
		if (a[j][t] <= min != 0 && j != cow) //???????
		{
		k = 1;
		}
		}
		if (k == 0)
		{
		cow1 = cow + 1;
		t1 = t + 1;
		m = 1;
		System.out.printf("%d %d %d\n",cow1,t1,a[cow][t]);
		}
		}
		if (m == 0)
		{
		System.out.print("not found");
		}
		return 0;
	}


}

