package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if (i < 10)
		{
			System.out.printf("%d\n",i);
		}
		if (i > 10 && i < 100)
		{
			i = i % 10 * 10 + i / 10;
			System.out.printf("%d\n",i);
		}
		if (i > 100 && i < 1000)
		{
			i = i % 10 * 100 + i % 100 / 10 * 10 + i / 100;
			System.out.printf("%d\n",i);
		}
		if (i > 1000 && i < 10000)
		{
			i = i % 10 * 1000 + i % 1000 % 100 / 10 * 100 + i % 1000 / 100 * 10 + i / 1000;
			System.out.printf("%d\n",i);
		}
		if (i > 10000 && i < 99999)
		{
			i = i % 10 * 10000 + i % 10000 % 1000 % 100 / 10 * 1000 + i % 10000 % 1000 / 100 * 100 + i % 10000 / 1000 * 10 + i / 10000;
			System.out.printf("%d\n",i);
		}
	}


}

