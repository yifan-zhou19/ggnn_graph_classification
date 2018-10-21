package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = 0;
		int b = 1;
		int c = 0;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if ((i % 7 == 0) || ((i >= 70) && (i < 80)) || i == 17 || i == 27 || i == 37 || i == 47 || i == 57 || i == 67 || i == 87 || i == 97)
			{
				b = b + 1;
				continue;
			}
			a = b * b;
			c = c + a;
			b = b + 1;
		}
		System.out.printf("%d\n",c);
	}
}

