package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = a;i >= 0;i--)
		{
			if (i % 7 != 0 && (i - 7) % 10 != 0 && (int)(i / 10) != 7)
			{
		sum += i * i;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

