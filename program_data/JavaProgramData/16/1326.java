package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 10 == 0)
		{
			   if (n == 0)
			   {
				   System.out.print("");
			   }
			else
			{
				System.out.print("0");
		for (n = n / 10;n % 10 == 0;n = n / 10)
		{
			   System.out.print("0");
		}
		for (;n >= 1;n = n / 10)
		{
		i = n % 10;
		s = s * 10 + i;
		}
			}
		}
		else
		{
			for (;n >= 1;n = n / 10)
			{
		i = n % 10;
		s = s * 10 + i;
			}
		}
		System.out.printf("%d",s);
	return 0;
	}
}

