package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 9)
		{
			y = y + n - n / 10 * 10;
			n = n / 10;
			y *= 10;
		}
		y = y + n;
		System.out.printf("%d\n",y);
	}


}

