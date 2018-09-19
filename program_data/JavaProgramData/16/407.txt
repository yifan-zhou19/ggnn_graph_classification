package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
			 if (a == 0)
			 {
				 System.out.printf("%d",a);
			 }
		for (i = 0;i < 5;i++)
		{
			if (a != 0)
			{
				System.out.printf("%d",a % 10);
			}
			a = a / 10;
		}
		System.out.print("\n");
		return (0);
	}

}

