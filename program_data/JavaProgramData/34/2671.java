package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n;
		for (i = 0;a != 1;i++)
		{
			if (a % 2 != 0)
			{
				b = a * 3 + 1;
				System.out.printf("%d*3+1=%d\n",a,b);
				a = b;
			}
			else
			{
				b = a / 2;
				System.out.printf("%d/2=%d\n",a,b);
				a = b;
			}
		}
		System.out.print("End");
	}
}

