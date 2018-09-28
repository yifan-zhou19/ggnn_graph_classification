package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a;
		for (i = 0;b != 1;i++)
		{
			if (a % 2 == 0)
			{
				b = a / 2;
				if (i == 0)
				{
					System.out.printf("%d/2=%d",a,b);
				}
				else if (i != 0)
				{
					System.out.printf("\n%d/2=%d",a,b);
				}
			}
			else if (a % 2 != 0)
			{
				b = a * 3 + 1;
				if (i == 0)
				{
					System.out.printf("%d*3+1=%d",a,b);
				}
				else if (i != 0)
				{
					System.out.printf("\n%d*3+1=%d",a,b);
				}
			}
			a = b;
		}
		System.out.print("\nEnd");
		return 0;
	}
}

