package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n;
		while (a != 1)
		{
			if (a % 2 != 0)
			{
				b = a * 3 + 1;
				System.out.printf("%d*3+1=%d\n",a,b);
				a = b;
			}
			if (a % 2 == 0)
			{
				b = a / 2;
				System.out.printf("%d/2=%d\n",a,b);
				a = b;
			}
		}
		System.out.print("End");
		return 0;
	}

}

