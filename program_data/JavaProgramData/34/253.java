package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;a != 1;i++)
		{
			if (a % 2 == 0)
			{
				b = a / 2;
				System.out.printf("%d/2=%d\n",a,b);
				a = b;
				continue;
			}
			else if (a != 1)
			{
				c = a * 3 + 1;
				 System.out.printf("%d*3+1=%d\n",a,c);
				 a = c;
			}
			else
			{
				break;
			}
		}
		System.out.print("End\n");
		return 0;
	}
}

