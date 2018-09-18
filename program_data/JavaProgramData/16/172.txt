package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.printf("%d",0);
		}
		else
		{
			while (n != 0)
			{
				m = n % 10;
				System.out.printf("%d",m);
				n = n / 10;
			}
		}
	}



}

