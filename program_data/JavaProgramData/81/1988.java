package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[5];
		int[] p = new int[5];
		int m;
		int n;
		int i;
		int j;
		int k;
		int f = new int(int * q[4],int x,int y);
		for (i = 0;i < 5;i++)
		{
			p[i] = (a + i);
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p[i] + j = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		k = f(p, n, m);

		if (k == 0)
		{
			System.out.print("error");
		}
		else
		{
	for (i = 0;i < 5;i++)
	{
			for (j = 0;j < 5;j++)
			{
				if (j < 4)
				{
				System.out.printf("%d ",*(p[i] + j));
				}
				else
				{
					System.out.printf("%d\n",*(p[i] + 4));
				}
			}
	}
		}


	}
	public static int f(int[][] q, int x, int y)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *t,z;
		int t;
		int z;
		if (x < 5 && y < 5)
		{
			z = 1;
			t = q[x];
			q[x] = q[y];
			q[y] = t;
		}
		else
		{
			z = 0;
		}
		return (z);
	}
}

