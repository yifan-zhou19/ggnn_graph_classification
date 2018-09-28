package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
	for (;;)
	{
	if (a != 1)
	{
		if (a % 2 == 0)
		{
		b = a / 2;
		System.out.printf("%d/2=%d\n",a,b);
		}
		if (a % 2 != 0)
		{
		b = a * 3 + 1;
		System.out.printf("%d*3+1=%d\n",a,b);
		}
		a = b;
	}
	if (a == 1)
	{
	System.out.print("End\n");
	break;
	}
	}


	}


}

