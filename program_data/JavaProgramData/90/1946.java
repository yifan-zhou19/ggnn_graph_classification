package <missing>;

public class GlobalMembers
{
	public static int count(int m, int n)
	{
		int m1;
		int n1;
		int m2;
		int n2;
		int t1;
		int t2;
		int result;
		t1 = 0;
		t2 = 0;
		m1 = m;
		n1 = n - 1;
		m2 = m - n;
		n2 = n;
		if (m == 1 || n == 1)
		{
			return 1;
		}
		if (m == 0)
		{
			return 1;
		}
		if (m < 0 || n < 0)
		{
			return 0;
		}
		t1 += count(m1, n1);
		t2 += count(m2, n2);
		result = t1 + t2;
		return result;
	}
	public static int Main()
	{
		int result;
		int i;
		int t;
		int m;
		int n;
		int stop;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		if (t == 0)
		{
			System.out.print("0");
		}
		for (i = 0; i < t; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			result = count(m, n);
			System.out.printf("%d\n",result);
		}
		if (m == 7)
		{
			System.out.print("\n");
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			stop = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

