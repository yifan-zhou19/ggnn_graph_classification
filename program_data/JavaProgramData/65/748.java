package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int m;
		int n;
		int i;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= p;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (m == n)
			{
				c++;
			}
			else
			{
				if ((n == m + 1) || ((n == 0) && (m == 2)))
				{
					a++;
				}
				else
				{
					b++;
				}
			}
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		else
		{
				if (a > b)
				{
					System.out.print("A");
				}
				else
				{
					System.out.print("B");
				}
		}

		return 0;
	}
}

