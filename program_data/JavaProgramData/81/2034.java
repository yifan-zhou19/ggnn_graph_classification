package <missing>;

public class GlobalMembers
{
	public static int f(int n,int m)
	{
		int a;
		if (n >= 0 && n <= 4 && m <= 4 && m >= 0)
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		return (a);
	}

	public static void Main()
	{
		int[][] a = new int[5][5];
		int n;
		int i;
		int j;
		int m;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2,*p3;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p3;
		int p3;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		p1 = n;
		p2 = m;
		if (f(n, m) == 0)
		{
			System.out.print("error");
		}
		if (f(n, m) == 1)
		{
			for (i = 0,t = 0;t < 5;i++,t++)
			{
				if (i == p1)
				{
					i = p2;
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",a[i][j]);
					}
					System.out.printf("%d\n",a[i][4]);
					i = t;
				}
			else if (i == p2)
			{
				i = p1;
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
				i = t;
			}
			else
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
			System.out.printf("%d\n",a[i][4]);
			}
			System.out.print("\n");
			}
		}
	}
}

