package <missing>;

public class GlobalMembers
{
	public static char f(int max, int[] a, char m, char n)
	{
		char num1;
		char num2;
		if (m == n && a[n - 1] <= max)
		{
			return (1);
		}
		else if (m == n && a[n - 1] > max)
		{
			return (0);
		}
		else
		{
			if (a[m - 1] <= max)
			{
				num1 = f(max, a, m + 1, n);
				num2 = f(a[m - 1], a, m + 1, n) + 1;
				if (num1 > num2)
				{
					return (num1);
				}
				else
				{
					return (num2);
				}
			}
			else
			{
				return (f(max, a, m + 1, n));
			}
		}

	}


	public static void Main()
	{
//C++ TO JAVA CONVERTER WARNING: The right shift operator was replaced by Java's logical right shift operator since the left operand was originally of an unsigned type, but you should confirm this replacement:
		int hmax = (int)(~0)>>>1;
		int[] h = new int[N];
		char n;
		char i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d\n",f(hmax, h, 1, n));
		System.out.print("input:\n");
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d,",h[i]);
		}


	}
}

