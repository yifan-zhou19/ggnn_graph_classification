package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int h;
		int l;
		int i;
		int j;
		int e;
		int b;
		int c;
		int d;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (e = 0,b = 0,c = l,d = h;e<h,b<l,c >= 0,d >= 0;e++,b++,c--,d--)
		{
			for (i = e,j = b;j < c;j++)
			{
			System.out.printf("%d\n",a[i][j]);
			}
			t += c - b;
			if (t >= h * l)
			{
				break;
			}
			for (j = c - 1,i = e+1;i < d;i++)
			{
			System.out.printf("%d\n",a[i][j]);
			}
			if (t >= h * l)
			{
				break;
			}
			t += d - e-1;
			for (i = d - 1,j = c - 2;j > b - 1;j--)
			{
			System.out.printf("%d\n",a[i][j]);
			}
			if (t >= h * l)
			{
				break;
			}
			t += c - b - 1;
			for (j = b,i = d - 2;i > e;i--)
			{
			System.out.printf("%d\n",a[i][j]);
			}
			t += d - e-2;
			if (t >= h * l)
			{
				break;
			}
		}
		return 0;
	}
}

