package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a100;
		int a50;
		int a20;
		int a10;
		int a5;
		int a1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a100 = n / 100;
		n = n % 100;
		a50 = n / 50;
		n = n % 50;
		a20 = n / 20;
		n = n % 20;
		a10 = n / 10;
		n = n % 10;
		a5 = n / 5;
		n = n % 5;
		a1 = n;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a100,a50,a20,a10,a5,a1);
	}


}

