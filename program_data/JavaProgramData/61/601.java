package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int i = 1;
		int j;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			j = 1;
			a = 1;
			b = 1;
			while (j <= x - 1)
			{
				c = a + b;
				a = b;
				b = c;
				j++;
			}
			System.out.printf("%d\n",a);
			i = i + 1;
		}
		return 0;
	}
}

