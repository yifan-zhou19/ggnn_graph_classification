package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		do
		{
			b = b * 10 + a % 10;
			a /= 10;
		} while (a > 0);
		System.out.printf("%d\n",b);
		return 0;
	}
}

