package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a == 1)
	{
	System.out.print("End");
	}
	else
	{
		while (a != 1)
		{
		if (a % 2 == 0)
		{
			System.out.printf("%d/2=%d\n",a,a / 2);
			a = a / 2;
		}
		else
		{
			System.out.printf("%d*3+1=%d\n",a,(a * 3 + 1));
			a = a * 3 + 1;
		}
		}
	System.out.print("End");
	}
	return 0;
	}
}

