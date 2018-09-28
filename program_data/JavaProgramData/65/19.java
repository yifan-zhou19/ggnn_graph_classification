package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int A;
		int B;
		int T;
		A = 0;
		B = 0;
		T = 0;
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
			if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
			{
				A = A++;
			}
			else if ((a == 0 && b == 0) || (a == 1 && b == 1) || (a == 2 && b == 2))
			{
				T = T++;
			}
			else if ((b == 0 && a == 1) || (b == 1 && a == 2) || (b == 2 && a == 0))
			{
				B = B++;
			}
		}
		if (A > B)
		{
			System.out.print("A");
		}
		else if (B > A)
		{
			System.out.print("B");
		}
		else if (A == B)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

