package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (a != 1)
		{
			if (a & 2 != 0)
			{
				System.out.printf("%d*3+1=%d\n",a,a * 3 + 1);
				a = a * 3 + 1;
			}
		else
		{
			System.out.printf("%d/2=%d\n",a,a / 2);
			a = a / 2;
		}
		}
		if (a == 1)
		{
			System.out.print("End");
		}
	}
}

