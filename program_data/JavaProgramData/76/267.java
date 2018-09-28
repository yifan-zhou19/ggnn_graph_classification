package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int a;
		int c;
		int e;
		int b;
		int d;
		int h;
		int t;
		int min;
		int max;
		int k;
		int n;
		int[][] x = new int[10000][3];
		int[] z = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   x[i][1] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   x[i][2] = Integer.parseInt(tempVar3);
		   }
		}
		min = x[1][1];
		max = x[1][2];
		for (i = 1;i <= n;i++)
		{
				if (min > x[i][1])
				{
					min = x[i][1];
				}
		}
		for (i = 1;i <= n;i++)
		{
				if (max < x[i][2])
				{
					max = x[i][2];
				}
		}
		t = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = x[i][1] + 1;j <= x[i][2];j++)
			{
				z[t] = j;
				t++;
			}
		}
		h = 0;
		k = 0;
		for (i = min + 1;i <= max;i++)
		{
			h = 0;
			for (t = 0;t <= 10000;t++)
			{
				if (z[t] == i)
				{
					h = 1;
					break;
				}
			}
			if (h == 0)
			{
				k = 1;
			}
		}
		if (k == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

