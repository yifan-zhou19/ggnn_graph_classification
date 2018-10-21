package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int m = 0;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0)
			{
				if (b == 1)
				{
					m++;
				}
				if (b == 2)
				{
					p++;
				}
				if (b == 0)
				{
					m++;
					p++;
				}
			}
			if (a == 1)
			{
				if (b == 0)
				{
					p++;
				}
				if (b == 2)
				{
					m++;
				}
				if (b == 1)
				{
					m++;
					p++;
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
					p++;
				}
				if (b == 2)
				{
					m++;
					p++;
				}
			}


		}
		if (m > p)
		{
			System.out.print("A");
		}
		else if (m < p)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

