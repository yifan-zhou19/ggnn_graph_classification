package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int i;
		int A;
		int B;
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
			if (A != B)
			{
				if (A == 0)
				{
					if (B == 1)
					{
						a++;
					}
					else
					{
						b++;
					}
				}
					if (A == 1)
					{
					if (B == 2)
					{
						a++;
					}
					else
					{
						b++;
					}
					}
						if (A == 2)
						{
					if (B == 0)
					{
						a++;
					}
					else
					{
						b++;
					}
						}
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

