package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		void jg(int x);
		jg(n);
		return 0;
	}
	public static void jg(int x)
	{
		if (x > 1 && x % 2 == 1)
		{
			System.out.printf("%d*3+1=%d\n",x,x * 3 + 1);
			jg(x * 3 + 1);
		}
		if (x % 2 == 0)
		{
			System.out.printf("%d/2=%d\n",x,x / 2);
			jg(x / 2);
		}
		if (x == 1)
		{
			System.out.print("End");
		}
	}


}

