package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (a > 9)
		{
			b = (a - a / 10 * 10) * 10 + b * 10;
			a = a / 10;
		}
		b = b + a;
		System.out.printf("%d",b);
	}


}

