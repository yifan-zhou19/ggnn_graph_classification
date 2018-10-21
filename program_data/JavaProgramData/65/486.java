package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int p = 0;
		int q = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 1)
			{
				p++;
			}
			if (a == 0 && b == 2)
			{
				q++;
			}
			if (a == 0 && b == 0)
			{
			//	printf("Tie\n");
			}
			if (a == 1 && b == 0)
			{
				q++;
			}
			if (a == 1 && b == 1)
			{
			//	printf("Tie\n");
			}
			if (a == 1 && b == 2)
			{
				p++;
			}
			if (a == 2 && b == 0)
			{
				p++;
			}
			if (a == 2 && b == 2)
			{
			//	printf("Tie\n");
			}
			if (a == 2 && b == 1)
			{
				q++;
			}
		}
		if (p == q)
		{
			System.out.print("Tie");
		}
		if (p > q)
		{
			System.out.print("A");
		}
		if (q > p)
		{
			System.out.print("B");
		}
		return 0;
	}
}

