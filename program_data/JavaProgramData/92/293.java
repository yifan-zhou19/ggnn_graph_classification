package <missing>;

public class GlobalMembers
{
	public static int cmp(Object e1, Object e2)
	{
		return *((int)e2) - (int)e1;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int k;
		int s;
		int t;
		int result;
		while (scanf("%d", n) && n != 0)
		{
			for (i = 0;i < n;++i)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[i] = Integer.parseInt(tempVar);
				}
			}
			qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
			for (i = 0;i < n;++i)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
			i = k = 0;
			j = s = n - 1;
			result = 0;
			for (t = 0;t < n;++t)
			{
				if (b[i] > a[k])
				{
					result += 200;
					++i;
					++k;
				}
				else if (b[j] > a[s])
				{
					result += 200;
					--j;
					--s;
				}
				else
				{
					if (b[j] > a[k])
					{
						result += 200;
					}
					else if (b[j] < a[k])
					{
						result -= 200;
					}
					--j;
					++k;
				}
			}
			System.out.printf("%d\n",result);
		}
		return 0;
	}
}

