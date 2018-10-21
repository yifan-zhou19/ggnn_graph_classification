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
	public static void huan(tangible.RefObject<Integer> p)
	{
		int x;
		x = p.argValue;
		for (int i = 0;i < n - 1;i++)
		{
			*(p.argValue + i) = *(p.argValue + i + 1);
		}
		*(p.argValue + n - 1) = x;
	}
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int w;
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
			m = -n;
			for (int i = 0;i < n;i++)
			{
				w = 0;
				for (int j = 0;j < n;j++)
				{
					if (a[j] > b[j])
					{
						w++;
					}
					else if (a[j] < b[j])
					{
						w--;
					}
				}
				m = (m > w)?m:w;
			tangible.RefObject<Integer> tempRef_a2 = new tangible.RefObject<Integer>(a);
				huan(tempRef_a2);
				a = tempRef_a2.argValue;
			}
			System.out.printf("%d\n",200 * m);
		}
		return 0;
	}
}

