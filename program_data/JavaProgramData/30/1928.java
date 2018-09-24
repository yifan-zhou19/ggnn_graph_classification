package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int s = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 1;n <= m;n++)
		{
			if (n % 7 != 0 && n / 10 != 7 && (n - (n / 10 * 10)) != 7)
			{
				  s = s + n * n;
			}
		}
			  System.out.printf("%d\n",s);
	}


}

