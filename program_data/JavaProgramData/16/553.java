package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		i = Math.log10(a);
		for (;a > 0;)
		{
			b = b * 10 + a % 10;
			a = a / 10;
		}
		j = Math.log10(b);
		for (;i > j;i--)
		{
			System.out.print("0");
		}
		System.out.printf("%d",b);
		return 0;
	}

}

