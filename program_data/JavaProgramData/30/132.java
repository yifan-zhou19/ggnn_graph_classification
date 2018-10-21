package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long sum=0;
		int sum = 0;
		for (i = 1;i <= n;i++)
		{
			sum = sum + i * i;
		}
		if (n < 7)
		{
			sum = sum;
		}
		if (n >= 7)
		{
			sum = sum - 7 * 7;
		for (i = 8;i <= n;i++)
		{
			if (i % 7 == 0 || (i - 7) % 10 == 0 || i / 10 == 7)
			{
				sum = sum - i * i;
			}
			else
			{
				continue;
			}
		}
		}
		System.out.printf("%ld",sum);
		return 0;
	}

}

