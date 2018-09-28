package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int q = 1;
		int m = 0;
		int n;
		int p;
		int k;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		p = n - 1;
		for (;;)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	if (true)
	{
			m++;
	}
			d = m * n + k;
			for (i = 2;i <= n;i++)
			{
				if (d % p != 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
				d = d * n / p + k;
			}
			break;
		}
		System.out.printf("%d",d);
	}
}

