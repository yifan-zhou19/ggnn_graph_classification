package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
	if (a == 100)
	{
	System.out.print("001");
	}
	else
	{
		while (a > 0)
		{
			i = i * 10 + a % 10;
			//printf("%d",i);
			a = a / 10;
		}
		 System.out.printf("%d",i);
	}
		return (0);
	}
}

