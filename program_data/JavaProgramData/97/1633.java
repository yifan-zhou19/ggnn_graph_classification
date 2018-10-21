package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a100 = 0;
		int a50 = 0;
		int a20 = 0;
		int a10 = 0;
		int a5 = 0;
		int a1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n != 0;)
		{
			if (n >= 100)
			{
				a100 += 1;
				n -= 100;
			}
			if (n < 100 && n >= 50)
			{
				a50 += 1;
				n -= 50;
			}
			if (n < 50 && n >= 20)
			{
				a20 += 1;
				n -= 20;
			}
			if (n < 20 && n >= 10)
			{
				a10 += 1;
				n -= 10;
			}
			if (n < 10 && n >= 5)
			{
				a5 += 1;
				n -= 5;
			}
			if (n < 5 && n >= 1)
			{
				a1 += 1;
				n -= 1;
			}
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a100,a50,a20,a10,a5,a1);
		return 0;
	}


}

