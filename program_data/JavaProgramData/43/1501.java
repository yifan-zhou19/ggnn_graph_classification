package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (m / 2);i = i + 2)
		{
		for (t = 2;t <= (i / 2);t++)
		{
		if (i % t == 0)
		{
		break;
		}
		}
		if (t > (i / 2))
		{
		for (t = 2;t <= ((m - i) / 2);t++)
		{
		if ((m - i) % t == 0)
		{
			break;
		}
		}
		if (t > (m - i) / 2)
		{
			System.out.printf("%d %d\n",i,m - i);
		}
		}
		}
	}
}

