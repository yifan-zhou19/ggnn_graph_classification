package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 9)
		{
			b = n % 10;
			System.out.printf("%d",b);
			n = n / 10;
		}
		System.out.printf("%d\n",n);
	}

}

