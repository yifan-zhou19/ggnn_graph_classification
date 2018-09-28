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
		int s1 = n / 100;
		n = n % 100;
		int s2 = n / 50;
		n = n % 50;
		int s3 = n / 20;
		n = n % 20;
		int s4 = n / 10;
		n = n % 10;
		int s5 = n / 5;
		n = n % 5;
		int s6 = n;
		System.out.printf("%d\n",s1);
		System.out.printf("%d\n",s2);
		System.out.printf("%d\n",s3);
		System.out.printf("%d\n",s4);
		System.out.printf("%d\n",s5);
		System.out.printf("%d",s6);

		return 0;
	}
}

