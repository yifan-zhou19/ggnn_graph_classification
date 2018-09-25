package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;n >= 100;i++)
		{
			n -= 100;
		}
		System.out.printf("%d\n",i);
		for (i = 0;n >= 50;i++)
		{
			n -= 50;
		}
		System.out.printf("%d\n",i);
		for (i = 0;n >= 20;i++)
		{
			n -= 20;
		}
		System.out.printf("%d\n",i);
		for (i = 0;n >= 10;i++)
		{
			n -= 10;
		}
		System.out.printf("%d\n",i);
		for (i = 0;n >= 5;i++)
		{
			n -= 5;
		}
		System.out.printf("%d\n",i);
		for (i = 0;n >= 1;i++)
		{
			n -= 1;
		}
		System.out.printf("%d\n",i);
	}
}

