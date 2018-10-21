package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			t = t * 10 + n % 10;
			n = (n - n % 10) / 10;
		}
		System.out.printf("%d",t);
	}

}

