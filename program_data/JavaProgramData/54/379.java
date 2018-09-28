package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int i;
		int j;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		a = 1;
		b = 1;
		if (n >= 3)
		{
			for (i = 1;i <= n;i++)
			{
				if (c % (n - 1) == 0)
				{
					a = c / (n - 1);
					c = a * n + k;
				}
				else
				{
					a = b + 1;
					b = a;
					i = 1;
					c = n * a + k;
				}
			}
			System.out.printf("%d",c);
		}
		else
		{
			System.out.print("7");
		}
	}



}

