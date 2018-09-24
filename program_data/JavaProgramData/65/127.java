package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 0;
		int A;
		int b = 0;
		int B;
		int n;
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
			if (A == B)
			{
				continue;
			}
			if ((A == 0 && B == 1) || (A == 1 && B == 2) || (A == 2 && B == 0))
			{
				a++;
			}
			if ((B == 0 && A == 1) || (B == 1 && A == 2) || (B == 2 && A == 0))
			{
				b++;
			}
		}
		if (a == b)
		{
			System.out.println("Tie");
		}
		if (a > b)
		{
			System.out.println("A");
		}
		if (a < b)
		{
			System.out.println("B");
		}
		return 0;
	}
}

