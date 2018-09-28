package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		void move(int n);
		move(n);
	}
	public static void move(int n)
	{
		while (n != 0)
		{
		System.out.printf("%d",n % 10);
		n = n / 10;
		}
	}

}

