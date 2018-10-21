package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,m = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 1)
			{
				if (b == 0)
				{
					m--;
				}
				if (b == 2)
				{
					m++;
				}
			}
			if (a == 2)
			{
				if (b == 0)
				{
					m++;
				}
				if (b == 1)
				{
					m--;
				}
			}
			if (a == 0)
			{
				if (b == 1)
				{
					m++;
				}
				if (b == 2)
				{
					m--;
				}
			}
		}
		if (m > 0)
		{
			System.out.print("A");
		}
		if (m < 0)
		{
			System.out.print("B");
		}
		if (m == 0)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

