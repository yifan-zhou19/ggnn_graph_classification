package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int i = 0;
		int A1;
		int B1;
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
				A1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				B1 = Integer.parseInt(tempVar3);
			}
			if (A1 == B1)
			{
				a = a;
				b = b;
			}
			else if (A1 != B1)
			{
				if (((A1 == 0) && (B1 == 1)) || ((A1 == 1) && (B1 == 2)) || ((A1 == 2) && (B1 == 0)))
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
		else if (a > b)
		{
			System.out.print("A");
		}
		else if (b > a)
		{
			System.out.print("B");
		}
		return 0;
	}
}

