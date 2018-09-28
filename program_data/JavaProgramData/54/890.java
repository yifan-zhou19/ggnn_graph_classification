package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = 0;
		int n;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = f(n, k);
		System.out.printf("%d",m);
	}
	public static int f(int n,int k)
	{
		int c;
		c = Math.pow(n,n) - k * (n - 1);
		return (c);
	}
}

