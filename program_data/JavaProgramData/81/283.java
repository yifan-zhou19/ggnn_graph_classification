package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int x[][5],int m,int n);
		int[][] a = new int[5][5];
		int i;
		int m;
		int n;
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
			m = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			n = Integer.parseInt(tempVar7);
		}
		if (f(a, m, n) != 0)
		{
			for (i = 0;i < 5;i++)
			{
		System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
	}
	public static int f(int[][] x, int m, int n)
	{
		int t;
		int i;
		if (m < 5 && n < 5)
		{
			for (i = 0;i < 5;i++)
			{
				t = x[m][i];
				x[m][i] = x[n][i];
				x[n][i] = t;
			}
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

