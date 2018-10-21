package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int A = 0;
		int B = 0;
		for (int i = 0;i < n;i++)
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
			if (a < b)
			{
				if (b - a == 1)
				{
				 A++;
				}
				else
				{
					B++;
				}
			}
			else if (a > b)
			{
					if (a - b == 1)
					{
				 B++;
					}
				else
				{
					A++;
				}
			}
			else if (a = b)
			{
				A = A;
				B = B;
			}
		}
		if (A > B)
		{
			System.out.print("A");
		}
		else if (A < B)
		{
			System.out.print("B");
		}
		else if (A = B)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

