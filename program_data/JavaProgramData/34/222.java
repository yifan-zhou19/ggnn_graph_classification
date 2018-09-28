package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (;a != 1;)
		{
			if (a % 2 == 1)
			{
				System.out.printf("%d*3+1=%d\n",a,b = a * 3 + 1);
			}
			else
			{
				System.out.printf("%d/2=%d\n",a,b = a / 2);
			}
				a = b;
		}
		System.out.print("End");
	}

}

