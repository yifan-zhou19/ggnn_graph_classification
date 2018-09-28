package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int z;
		if ((x <= 4) && (y <= 4))
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return (z);
	}

	public static void Main()
	{
		int i;
		int m;
		int n;
		int z;
		int[][] a = new int[5][5];
		int s1;
		int s2;
		int s3;
		int s4;
		int s0;
		for (i = 0;i <= 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0][i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i <= 4;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[1][i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= 4;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[2][i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= 4;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[3][i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i <= 4;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[4][i] = Integer.parseInt(tempVar5);
			}
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			n = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			m = Integer.parseInt(tempVar7);
		}
		z = f(n, m);
		if (z == 0)
		{
			System.out.print("error");
		}
		if (z == 1)
		{
			s0 = a[m][0];
			s1 = a[m][1];
			s2 = a[m][2];
			s3 = a[m][3];
			s4 = a[m][4];
			a[m][0] = a[n][0];
			a[m][1] = a[n][1];
			a[m][2] = a[n][2];
			a[m][3] = a[n][3];
			a[m][4] = a[n][4];
			a[n][0] = s0;
			a[n][1] = s1;
			a[n][2] = s2;
			a[n][3] = s3;
			a[n][4] = s4;
			for (i = 0;i <= 3;i++)
			{
			System.out.printf("%d ",a[0][i]);
			}
			System.out.printf("%d\n",a[0][4]);
			for (i = 0;i <= 3;i++)
			{
			System.out.printf("%d ",a[1][i]);
			}
			System.out.printf("%d\n",a[1][4]);
			for (i = 0;i <= 3;i++)
			{
			System.out.printf("%d ",a[2][i]);
			}
			System.out.printf("%d\n",a[2][4]);
			for (i = 0;i <= 3;i++)
			{
			System.out.printf("%d ",a[3][i]);
			}
			System.out.printf("%d\n",a[3][4]);
			for (i = 0;i <= 3;i++)
			{
			System.out.printf("%d ",a[4][i]);
			}
			System.out.printf("%d",a[4][4]);
		}
	}







}

