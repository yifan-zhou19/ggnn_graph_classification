package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;n >= 100;a++)
		{
			n -= 100;
		}
		System.out.printf("%d\n",a);
		for (a = 0;n >= 50;a++)
		{
			n -= 50;
		}
		System.out.printf("%d\n",a);
		for (a = 0;n >= 20;a++)
		{
			n -= 20;
		}
		System.out.printf("%d\n",a);
		for (a = 0;n >= 10;a++)
		{
			n -= 10;
		}
		System.out.printf("%d\n",a);
		for (a = 0;n >= 5;a++)
		{
			n -= 5;
		}
		System.out.printf("%d\n",a);
		for (a = 0;n >= 1;a++)
		{
			n -= 1;
		}
		System.out.printf("%d\n",a);
		return 0;
	}


}

