package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void cai(int m);
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		cai(n);
	}

	public static void cai(int m)
	{
		int t;
		if (m == 1)
		{
			System.out.print("End");
			return;
		}
		if (m % 2 == 0)
		{
			t = m / 2;
			System.out.printf("%d/2=%d\n",m,t);
			cai(t);
		}
		if (m % 2 == 1)
		{
			t = m * 3 + 1;
			System.out.printf("%d*3+1=%d\n",m,t);
			cai(t);
		}
	}
}

