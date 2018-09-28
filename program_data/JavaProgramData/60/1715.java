package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		else
		{
		for (int i = 3;i <= n;i = i + 2)
		{
				c = 1;
				for (int j = 3;j < i;j = j + 2)
				{
						if (i % j == 0)
						{
						c = 0;
						b = 0;
						break;
						}
				}
				if (c == 1)
				{
				b++;
				}
				if (b > 1)
				{
				System.out.printf("%d %d\n",i - 2,i);
				}
		}
		}
		return 0;
	}
}

