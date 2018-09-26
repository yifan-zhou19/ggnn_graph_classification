package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= (int)Math.log10(x) + 1; i++)
		{
			System.out.printf("%d", (x % (int)Math.pow(10,i)) / (int)(Math.pow(10,i - 1)));
		}
		return 0;
	}
}

