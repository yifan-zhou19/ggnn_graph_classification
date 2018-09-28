package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int jiaogu = int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		jiaogu(n);
		return 0;
	}
	public static int jiaogu(int m)
	{
		int a1;
		if (m == 1)
		{
		System.out.print("End");
		}
		else if (m % 2 == 1)
		{
			a1 = m * 3 + 1;
			System.out.printf("%d*3+1=%d\n",m,a1);
			return (jiaogu(a1));
		}
		else if (m % 2 == 0)
		{
			a1 = m / 2;
			System.out.printf("%d/2=%d\n",m,a1);
			return (jiaogu(a1));
		}
	}

}

