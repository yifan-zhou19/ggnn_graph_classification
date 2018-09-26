package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int b;
		int c;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i < n - 1;i++)
		{
			b = 1;
			c = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					b = 0;
				}
			}
			for (j = 2;j < i + 2;j++)
			{
				if ((i + 2) % j == 0)
				{
					c = 0;
				}
			}
			if ((b * c) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
			d++;
			}
		}
			if (d == 0)
			{
				System.out.print("empty");
			}
	}
}

