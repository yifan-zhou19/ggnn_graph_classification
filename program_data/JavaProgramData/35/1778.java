package <missing>;

public class GlobalMembers
{
	public static void andian(tangible.RefObject<Integer> p, int m, int n)
	{
		int i;
		int j;
		int k;
		int note = 0;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *max;
		int max;
		for (i = 0;i < m;i++)
		{
			max = p.argValue + i;
			for (j = 0;j < n;j++)
			{
				if (*(p.argValue+8 * i + j) >= max)
				{
					max = p.argValue+8 * i + j;
					k = j;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (j != i)
				{
				if (*(p.argValue+8 * j + k) <= max)
				{
					note = 1;
					break;
				}
				}
			}
			if (note == 1)
			{
				continue;
			}
			if (note == 0)
			{
				System.out.printf("%d+%d\n",i,k);
				sum = sum + 1;
			}
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
	}
	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(a + i) + j = tempVar3;
				}
			}
		}
		p = a[0][0];
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		andian(tempRef_p, m, n);
		p = tempRef_p.argValue;
	}
}

