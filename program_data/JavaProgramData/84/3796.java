package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int i = 0;
		int b;
		int max;
		int secm = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		for (; i < n - 1; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (max < b)
			{
				a = max;
				max = b;
				secm = a;
			}
			else if (b > secm)
			{
				secm = b;
			}

		}
		System.out.printf("%d\n\n%d",max,secm);
		return 0;
	}
}

