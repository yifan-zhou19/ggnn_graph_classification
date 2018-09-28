package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		while (sum >= 100)
		{
			n++;
			sum -= 100;
		}
		System.out.printf("%d\n",n);
		n = 0;
		while (sum >= 50)
		{
			n++;
			sum -= 50;
		}
		System.out.printf("%d\n",n);
		n = 0;
		while (sum >= 20)
		{
			n++;
			sum -= 20;
		}
		System.out.printf("%d\n",n);
		n = 0;
		while (sum >= 10)
		{
			n++;
			sum -= 10;
		}
		System.out.printf("%d\n",n);
		n = 0;
		while (sum >= 5)
		{
			n++;
			sum -= 5;
		}
		System.out.printf("%d\n",n);
		n = 0;
		while (sum >= 1)
		{
			n++;
			sum -= 1;
		}
		System.out.printf("%d\n",n);
		return 0;
	}
}

