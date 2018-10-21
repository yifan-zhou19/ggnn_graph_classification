package <missing>;

public class GlobalMembers
{
	public static int reverse(int m,int n)
	{
		int back = 0;
		if ((m == 1 || n == 1) || (m == 0))
		{
			back = 1;
			return 1;
		}
		if (m >= n)
		{
			back += reverse(m - n, n);
			back += reverse(m, n - 1);
		}
		else if (m < n)
		{
			back += reverse(m, n - 1);
		}
		return back;
	}

	public static int Main()
	{
		int a;
		int b;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",reverse(a, b));
		}
		return 0;
	}

}

