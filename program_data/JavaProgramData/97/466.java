package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.printf("%d\n",(n - n % 100) / 100);
		System.out.printf("%d\n",(n % 100 - n % 50) / 50);
		if (n % 100 - n % 10 >= 50)
		{
		  System.out.printf("%d\n",(n % 100 - 50) / 20);
		  System.out.printf("%d\n",(n % 100 - 50 - ((n % 100 - 50) / 20) * 20) / 10);
		}
		  else if (n % 100 - n % 10 < 50)
		  {
			System.out.printf("%d\n",(n % 50 - n % 20) / 20);
			System.out.printf("%d\n",(n % 20 - n % 10) / 10);
		  }
		System.out.printf("%d\n",(n % 10 - n % 5) / 5);
		System.out.printf("%d\n",n % 5);
	}
}

