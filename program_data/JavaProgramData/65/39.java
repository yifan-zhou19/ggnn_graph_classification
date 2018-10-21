package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
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
				continue;
			}
			else
			{
				if ((a == 2 && b == 0) || (a == 0 && b == 2))
				{
				c = a;
				a = b;
				b = c;
				}
				if (a < b)
				{
					A++;
				}
				else
				{
					B++;
				}
			}
		}
			if (A == B)
			{
				System.out.print("Tie");
			}
			else
			{
				if (A > B)
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

