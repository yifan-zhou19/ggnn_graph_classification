package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("0");
		}
		else
		{
		for (i = 0; i < 5; i++)
		{
			if (n != 0)
			{
			t = n % 10;
			System.out.printf("%d", t);
			n = (n - t) / 10;
			}
		}
		}
		return 0;
	}
}

