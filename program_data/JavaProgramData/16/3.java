package <missing>;

public class GlobalMembers
{
	public static void f(int n,int w)
	{
		int x;
		x = (int)Math.pow(10,w - 1);
		if (w != 1)
		{
			f(n % x, w - 1);
		}
		System.out.printf("%d",n / x);
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int w = (int)(Math.log(n) / Math.log(10)) + 1;
		f(n, w);
	}

}

