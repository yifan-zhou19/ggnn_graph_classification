package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void put(int n);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		put(n);
	}

	public static void put(int n)
	{
		int t;
		if (n == 1)
		{
			System.out.print("End");
		}
		if (n % 2 == 0)
		{
			t = n / 2;
			System.out.printf("%d/2=%d\n",n,t);
			put(t);
		}
		if (n % 2 != 0 && n != 1)
		{
			t = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,t);
			put(t);
		}
	}


}

