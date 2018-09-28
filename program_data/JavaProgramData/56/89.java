package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = (int)(Math.log(n)) + 1;
		for (i = 1;i < b - 1;i++)
		{
			c = n % 10;
			n = n / 10;
			System.out.printf("%d",c);
		}
		return 0;
	}
}

