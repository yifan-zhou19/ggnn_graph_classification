package <missing>;

public class GlobalMembers
{
	public static int I = 0;

	public static int root(tangible.RefObject<Integer> a, int n)
	{
		*(a.argValue + I) = n;
		I++;
		if (n != 1)
		{
			if (n % 2 == 0)
			{
				root(a, n / 2);
			}
			else
			{
				root(a, (n - 1) / 2);
			}
		}
		return I;
	}

	public static void Main()
	{
		int a0;
		int b0;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int m;
		int n;
		int i;
		int j;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a0 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b0 = Integer.parseInt(tempVar2);
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		m = root(tempRef_a, a0);
		a = tempRef_a.argValue;
		I = 0;
	tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
		n = root(tempRef_b, b0);
		b = tempRef_b.argValue;

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
				break;
			}
		}
	}
}

