package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		s = 0;
		while (i <= n)
		{
			a = i / 10;
			if (i % 7 != 0)
			{
				if ((i - 7) % 10 != 0)
				{
					if ((a - 7) % 10 != 0)
					{
						s = s + i * i;
					}
				}
			}
			i++;
		}
		System.out.printf("%d",s);
		return 0;
	}
}

