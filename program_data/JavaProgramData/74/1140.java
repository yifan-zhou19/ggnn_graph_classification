package <missing>;

public class GlobalMembers
{
	public static int huiwen(int a, int b)
	{
	if (a == 0)
	{
	return (b);
	}
	else
	{
		return (huiwen(a / 10, b * 10 + a % 10));
	}
	}
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int p = 0;
		int tag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int a;
		int b = 0;
		for (a = m;a <= n;a++)
		{
		b = huiwen(a, 0);
		if (a == b)

		{
			k = Math.sqrt(a);
		   for (i = 2;i <= k;i++)
		   {
		   if (a % i == 0)
		   {
			   break;
		   }
		   }
			if (i > k)
			{
				p++;
				if (tag == 0)
				{
					System.out.printf("%d",a);
					tag = 1;
				}
				else
				{
			System.out.printf(",%d",a);
				}
			}



		}
		}
		if (p == 0)
		{
			System.out.print("no");
		}
	}
}

