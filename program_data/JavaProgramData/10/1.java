package <missing>;

public class GlobalMembers
{
	public static int num(int n, tangible.RefObject<Integer> p)
	{
		int i = 1;
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=p+1;
		int q = p.argValue+1;
		if (n == 2)
		{
			if (p.argValue >= q)
			{
				return 2;
			}
			else
			{
				return 1;
			}
		}
		else
		{
			while (i <= n)
			{
				for (; p.argValue < q && i <= n; i++, q++)
				{
					;
				}
				i++;
			tangible.RefObject<Integer> tempRef_q = new tangible.RefObject<Integer>(q);
				if (num(n - i + 1, tempRef_q) + 1 > max)
				{
					q = tempRef_q.argValue;
				tangible.RefObject<Integer> tempRef_q2 = new tangible.RefObject<Integer>(q);
					max = num(n - i + 1, tempRef_q2) + 1;
					q = tempRef_q2.argValue;
				}
				else
				{
					q = tempRef_q.argValue;
				}
				q++;
			}
		}
		return max;
	}
	public static int Main()
	{
		int k;
		int i;
		int[] a = new int[25];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0; i < k; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = k; i >= 2; i--)
		{
			if (num(i, a + k - i) > max)
			{
				max = num(i, a + k - i);
			}
		}
		System.out.printf("%d\n", max);
		return 0;
	}
}

