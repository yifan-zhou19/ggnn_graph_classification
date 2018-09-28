package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		i = 1;
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			if (i % 7 != 0 && i % 10 != 7 && (i - 70 >= 10 || 70 - i > 0))
			{
				j = j + i * i;
			}
			else
			{
				j = j;
			}
			i = i + 1;
		}
		System.out.printf("%d",j);
		return 0;
	}
}

