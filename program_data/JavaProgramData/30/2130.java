package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			if ((n % 7 != 0) && (n % 10 != 7) && (n - n % 10 != 70))
			{
			s = s + n * n;
			}
			n = n - 1;
		}
		System.out.printf("%d",s);
		return 0;
	}

}

