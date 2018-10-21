package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int s100;
		int s50;
		int s20;
		int s10;
		int s5;
		int s1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		s100 = 0;
		s50 = 0;
		s20 = 0;
		s10 = 0;
		s5 = 0;
		s1 = 0;
		if (sum >= 100)
		{
			s100 = sum / 100;
			sum = sum % 100;
		}
		if (sum >= 50)
		{
			s50++;
			sum = sum - 50;
		}
		while (sum >= 20)
		{
			s20++;
			sum = sum - 20;
		}
		if (sum >= 10)
		{
			s10++;
			sum = sum - 10;
		}
		if (sum >= 5)
		{
			s5++;
			sum = sum - 5;
		}
		s1 = sum;
		System.out.printf("%d\n",s100);
		System.out.printf("%d\n",s50);
		System.out.printf("%d\n",s20);
		System.out.printf("%d\n",s10);
		System.out.printf("%d\n",s5);
		System.out.printf("%d\n",s1);
		return 0;
	}
}

