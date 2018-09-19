package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int p;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 10)
		{
		   p = 1;
		}
		else if (n < 100)
		{
		   p = 2;
		}
		else if (n < 1000)
		{
		   p = 3;
		}
		else if (n < 10000)
		{
		   p = 4;
		}
		do
		{
			m = n % 10;
			System.out.printf("%d",m);
			n = n / 10;
			i++;
		}while (i <= p);
		return 0;
	}

}

