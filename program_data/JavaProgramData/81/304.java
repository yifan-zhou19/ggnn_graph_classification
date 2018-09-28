package <missing>;

public class GlobalMembers
{
	public static int pand(int y, int z)
	{
		 int x;
		 x = (y <= 4 && z <= 4)? 1:0;
		 return x;
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int l;
		int t;
		for (i = 0;i < 5;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i][0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a[i][1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i][2] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a[i][3] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			a[i][4] = Integer.parseInt(tempVar5);
		}
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			n = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			m = Integer.parseInt(tempVar7);
		}
		l = pand(n, m);
		if (l == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				t = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = t;
			}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			}
		}
	}
}

