package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
		System.out.printf("%d",3);
		if (n % 5 == 0)
		{
		System.out.printf(" %d",5);
		}
		if (n % 7 == 0)
		{
		System.out.printf(" %d",7);
		}
		}
		else
		{
			if (n % 5 == 0)
			{
		System.out.printf("%d",5);
		if (n % 7 == 0)
		{
		System.out.printf(" %d",7);
		}
			}
		else
		{
			if (n % 7 == 0)
			{
		System.out.printf("%d",7);
			}
			else
			{
				System.out.print("n");
			}
		}
		}
	}
}

