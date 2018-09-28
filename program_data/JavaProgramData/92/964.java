package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void paixu(tangible.RefObject<Integer> p)
	{
		int k;
		for (int i = n - 1;i >= 0;i--)
		{
			for (int j = 0;j < i;j++)
			{
				if (*(p.argValue + j) < *(p.argValue + j + 1))
				{
					k = (p.argValue + j);
					*(p.argValue + j) = *(p.argValue + j + 1);
					*(p.argValue + j + 1) = k;
				}
			}
		}
	}
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int m;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			m = 0;
			for (int i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (int i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
		tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
			paixu(tempRef_a);
			a = tempRef_a.argValue;
		tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
			paixu(tempRef_b);
			b = tempRef_b.argValue;
			for (int i1 = 0,i2 = 0,j1 = n - 1,j2 = n - 1;;)
			{
				for (;a[i1] > b[i2];)
				{
					m++;
					i1++;
					i2++;
					if (i1 > j1)
					{
						break;
					}
				}
				if (i1 > j1)
				{
					break;
				}
				for (;a[j1] > b[j2];)
				{
					m++;
					j1--;
					j2--;
					if (i1 > j1)
					{
						break;
					}
				}
				if (i1 > j1)
				{
					break;
				}
				if (a[j1] < b[i2])
				{
					m--;
				}
				j1--;
				i2++;
				if (i1 > j1)
				{
					break;
				}
			}
			System.out.printf("%d\n",200 * m);
		}
		return 0;
	}

}

