package <missing>;

public class GlobalMembers
{
	public static int hw(int i)
	{
			int j;
			int s = i;
		for (j = 0;i != 0;i = i / 10)
		{
			j = j * 10 + i % 10;
		}
		if (j == s)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int x;
		int j;
		int b;
		int c;
		int a;
		b = 0;
		a = 0;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (x = m;x <= n;x++)
		{
			for (j = 2;j < x / 2;j++)
			{
			  if (x % j == 0)
			  {
				a = 0;
				break;
			  }
			  else
			  {
				  a = 1;
			  }
			}
			if (a == 1 && hw(x) == 1)
			{
				b = b + 1;
				if (b == 1)
				{
					System.out.printf("%d",x);
				}
				else
				{
					System.out.printf(",%d",x);
				}
			}
			else
			{
				c = c + 1;
				if (c == n - m + 1)
				{
					System.out.print("no\n");
				}
			}
		}
	}
}

