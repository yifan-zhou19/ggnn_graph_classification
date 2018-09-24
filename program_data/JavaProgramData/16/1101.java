package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int reverse = int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		reverse(a);
		return 0;
	}
	public static int reverse(int m)
	{
		System.out.printf("%d",m % 10);
		m = m / 10;
		if (m != 0)
		{
			return reverse(m);
		}
	}

}

