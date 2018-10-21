package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p = 0;
		int q = 0;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = n / 100;
		System.out.printf("%d\n",p);
		p = n % 100;
		p = p / 50;
		System.out.printf("%d\n",p);
		p = n % 100 % 50;
		p = p / 20;
		System.out.printf("%d\n",p);
		p = n % 100 % 50 % 20;
		p = p / 10;
		System.out.printf("%d\n",p);
		p = n % 100 % 50 % 20 % 10;
		p = p / 5;
		System.out.printf("%d\n",p);
		p = n % 100 % 50 % 20 % 10 % 5;
		System.out.printf("%d",p);
		return 0;
	}


}

