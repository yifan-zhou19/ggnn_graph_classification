package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s1;
		int s2;
		int s3;
		int s4;
		int s5;
		int s6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s1 = n / 100;
		s2 = (n % 100) / 50;
		s3 = (n % 50) / 20;
		s4 = ((n % 50) % 20) / 10;
		s5 = (n % 10) / 5;
		s6 = n % 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",s1,s2,s3,s4,s5,s6);
		return 0;
	}
}

