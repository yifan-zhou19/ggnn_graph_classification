package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int l;
		int h;
		int m = n;
		for (i = 0;l != 0;i++)
		{
			l = m / 10;
			m = l;
		}
		int g;
		for (g = 0;g < i;g++)
		{
			h = n % 10;
			System.out.printf("%d",h);
			n = n / 10;
		}
		return 0;
	}
}

