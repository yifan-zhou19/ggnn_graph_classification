package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int d;
	int k;
	int p;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		p = 1;
		q = 1;
		if (a == 1 || a == 2)
		{
			System.out.printf("%d\n",q);
		}
		else if (a > 2)
		{
			for (k = 0;k < a - 2;k++)
			{
			d = p + q;
			p = q;
			q = d;
			}
			 System.out.printf("%d\n",q);

		}
	}
	 return 0;
	}
}

