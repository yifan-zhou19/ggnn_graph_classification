package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (;a > 0;a /= 2)
		{
			j = b;
		for (;j > 0;j /= 2)
		{
			if (a == j)
			{
				System.out.printf("%d",a);
				i = 1;
				break;
			}
		}
		if (i == 1)
		{
			break;
		}
		}
		return 0;
	}
}

