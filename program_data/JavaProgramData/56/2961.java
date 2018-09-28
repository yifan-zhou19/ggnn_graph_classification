package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		void reverse(int n);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		reverse(n);
		return 0;
	}
	public static void reverse(int n)
	{
		if (n < 1)
		{
			return;
		}
		System.out.printf("%d",n % 10);
		reverse(n / 10);
	}

}

