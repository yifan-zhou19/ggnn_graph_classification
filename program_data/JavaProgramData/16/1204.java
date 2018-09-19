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
		if ((n >= 0) && (n <= 9))
		{
			System.out.printf("%d",n); //?????????
		}
		else
		{
		do
		{
			System.out.printf("%d",n % 10);
			n = n / 10;
		}while (n / 10 != 0);
		System.out.printf("%d",n);
		}
		return 0;
	}



}

