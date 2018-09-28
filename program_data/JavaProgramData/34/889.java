package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int e;
	a = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 1)
	{
		System.out.print("End");
	}
	else if (n != 1)
	{
		a = n;
		for (;a != 1;)
		{
			if (a % 2 == 0)
			{
				e = a;
				a = a / 2;
				System.out.printf("%d/2=%d\n",e,a);
				if (a == 1)
				{
					System.out.print("End");
					break;
				}
			}
			else if (a % 2 == 1)
			{
				e = a;
				a = a * 3 + 1;
				System.out.printf("%d*3+1=%d\n",e,a);
				if (a == 1)
				{
					System.out.print("End");
				break;
				}
			}
		}
	}
	return 0;
	}
}

