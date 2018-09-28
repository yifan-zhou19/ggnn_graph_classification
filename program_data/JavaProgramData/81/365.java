package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int y;
		void move(int a[5][5],int n,int m);
		int judge = new int(int n,int m);

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
		int n;
		int m;
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

		y = judge(n, m);
		if (y == 0)
		{
			System.out.print("error");
		}
		else if (y == 1)
		{
			move(a, n, m);
		   for (i = 0;i < 5;i++)
		   {
			System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
		   }
		}
	}
	public static int judge(int n,int m)
	{
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void move(int[][] a, int n, int m)
	{
		int t;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
				p = a[0][0];


				for (j = 0;j < 5;j++)
				{
				t = (p + 5 * n + j);
				*(p + 5 * n + j) = *(p + 5 * m + j);
				*(p + 5 * m + j) = t;
				}
	}


}

