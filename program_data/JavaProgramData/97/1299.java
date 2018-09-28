package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		n1 = n / 100;
		System.out.printf("%d\n",n1);
		if ((n % 100) >= 50)
		{
			n2 = 1;
			n3 = ((n % 100) - 50) / 20;
			n4 = (((n % 100) - 50) % 20) / 10;
		}
		else
		{
			n2 = 0;
			n3 = (n % 100) / 20;
			n4 = ((n % 100) % 20) / 10;
		}
		System.out.printf("%d\n",n2);
		System.out.printf("%d\n",n3);

		System.out.printf("%d\n",n4);
		n5 = (((n % 100) % 20) % 10) / 5;
		n6 = (((n % 100) % 20) % 10) % 5;
		System.out.printf("%d\n",n5);
		System.out.printf("%d\n",n6);
		 return 0;

	}
}

