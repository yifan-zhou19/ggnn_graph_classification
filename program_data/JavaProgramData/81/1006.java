package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		(int)(*p)[5];
		int i;
		int f = new int(int p[5],int m,int n);
		for (p = a;p < a + 5;p++)
		{
			for (i = 0;i < 5;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*p + i = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (f(a, m, n) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (p = a;p < a + 5;p++)
			{
				for (i = 0;i < 4;i++)
				{
					System.out.printf("%d ",*(*p + i));
				}
				System.out.printf("%d\n",*(*p + i));
			}
		}
		return 0;
	}
	public static int f(int[] p, int m, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt,i,t;
		int pt;
		int i;
		int t;
		if (m < 5 && n < 5)
		{
			for (i = 0;i < 5;i++)
			{
				t = (p[m] + i);
				*(p[m] + i) = *(p[n] + i);
				*(p[n] + i) = t;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}








}

