package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 1)
		{
			System.out.print("End\n");
		}
		else
		{
		do
		{
			if (a % 2 == 0)
			{
				b = a / 2;
				System.out.printf("%d",a);
				System.out.print("/2=");
				System.out.printf("%d\n",b);
			}
			else
			{
				b = a * 3 + 1;
				System.out.printf("%d",a);
				System.out.print("*3+1=");
				System.out.printf("%d\n",b);
			}

			a = b;
			b = 0;
		} while (a != 1);
		if (a == 1)
		{
			System.out.print("End\n");
		}
		}
		return 0;
	}

}

