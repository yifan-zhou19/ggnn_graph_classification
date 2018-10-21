package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		int b;
		int A = 0;
		int B = 0;
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
			if (a == b)
			{
				A = A;
				B = B;
			}
			else if (a == 1 && b == 0)
			{
				B++;
			}
			else if (a == 2 && b == 0)
			{
				A++;
			}
			else if (a == 1 && b == 2)
			{
				A++;
			}
			else if (a == 2 && b == 1)
			{
				B++;
			}
			else if (a == 0 && b == 1)
			{
				A++;
			}
			else if (a == 0 && b == 2)
			{
				B++;
			}
		}
		if (A == B)
		{
			System.out.print("Tie");
		}
		else if (A > B)
		{
			System.out.print("A");
		}
		else if (A < B)
		{
			System.out.print("B");
		}
		return 0;
	}

}

