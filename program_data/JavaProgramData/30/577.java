package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sum = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 != 0 && (i - (i / 10) * 10) != 7 && i / 10 != 7)
			{
		  sum = sum + i * i;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

