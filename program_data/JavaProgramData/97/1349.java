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

		int l;
		int r;
		l = n % 100;
		r = (n - l) / 100;
		System.out.printf("%d\n",r);
		n = l;
		l = n % 50;
		r = (n - l) / 50;
		System.out.printf("%d\n",r);
		n = l;
		l = n % 20;
		r = (n - l) / 20;
		System.out.printf("%d\n",r);
		n = l;
		l = n % 10;
		r = (n - l) / 10;
		System.out.printf("%d\n",r);
		n = l;
		l = n % 5;
		r = (n - l) / 5;
		System.out.printf("%d\n",r);
		n = l;
		l = n % 1;
		r = (n - l) / 1;
		System.out.printf("%d",r);






		return 0;
	}
}

