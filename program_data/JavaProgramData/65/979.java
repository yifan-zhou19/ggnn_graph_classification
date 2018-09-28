package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int A;
		int B;
		int a = 0;
		int b = 0;
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
				A = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				B = Integer.parseInt(tempVar3);
			}
			if ((A == 0 && B == 1) || (A == 1 && B == 2) || (A == 2 && B == 0))
			{
				a++;
				continue;
			}
			if (A == B)
			{
				a++;
				b++;
				continue;
			}
			else
			{
				b++;
				continue;
			}
		}
		if (a > b)
		{
			System.out.print("A\n");
			return 0;
		}
		if (a == b)
		{
			System.out.print("Tie\n");
			return 0;
		}
		if (a < b)
		{
			System.out.print("B\n");
		return 0;
		}

		return 0;
	}

}

