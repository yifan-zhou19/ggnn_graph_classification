package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 4;i++)
		{
			a = n % 10;
			n = n / 10;

			b = 10 * b + a;
			if (n == 0)
			{
				break;
			}
		}
		System.out.printf("%d\n",b);
		return 0;
	}
}

