package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int m = 1;
		int c;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 5;i++)
		{
			m = m * 10;
			if ((n / m) == 0)
			{
				c = i;
				break;
			}
		}
		for (i = 1;i <= c;i++)
		{
			g = n % 10;
			if (g == 0)
			{
				System.out.print("0");
			}
			else
			{
				System.out.printf("%d",g);
			}
			n = n / 10;
		}
		System.out.print("\n");
	}


}

