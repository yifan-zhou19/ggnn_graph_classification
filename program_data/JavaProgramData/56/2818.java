package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void print(int n);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		print(n);
		return 0;
	}

	public static void print(int n)
	{
		if (n < 10)
		{
			System.out.printf("%d",n);
		}
		else
		{
			System.out.printf("%d",n % 10);
			print(n / 10);
		}
	}
}

