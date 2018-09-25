package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int a6;
		int[] ss = new int[20];
		int count100 = 0;
		int count50 = 0;
		int count20 = 0;
		int count10 = 0;
		int count5 = 0;
		int count1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		a1 = a2 = a3 = a4 = a5 = a6 = a;
		while (a >= 100)
		{
			a = a - 100;
			count100++;
		}
		while (a >= 50)
		{
			a = a - 50;
			count50++;
		}
		while (a >= 20)
		{
			a = a - 20;
			count20++;
		}
		while (a >= 10)
		{
			a = a - 10;
			count10++;
		}
		while (a >= 5)
		{
			a = a - 5;
			count5++;
		}while (a >= 1)
		{
			a = a - 1;
			count1++;
	}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",count100,count50,count20,count10,count5,count1);
		return 0;
	}
}

