package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if ((i / 100) != 7 && (i / 10) % 10 != 7 && (i % 7 != 0) && i != 7 && (i / 10) != 7 && (i - i / 10 * 10) != 7)
			{
				sum += i * i;
			}
		}
		System.out.printf("%d",sum);
	}


}

