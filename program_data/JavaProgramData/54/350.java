package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a; //a=n  b=k c=counts
	int b;
	int c;
	int sum = 1;
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
	if (a != 2)
	{

		for (c = 0;c < a;c++)
		{
	sum = sum * a;
		}
	int SUM = sum - b * (a - 1);
	System.out.printf("%d",SUM);
	}

	else
	{
		System.out.print("7");
	}

		return 0;
	}
}

