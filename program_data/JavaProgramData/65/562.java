package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int a;
		int b;
		int n;
		int i;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b != 0)
			{
				if (b == 2)
				{
					B++;
				}
				else
				{
				A++;
				}
			}
			else if (a == 2 && b != 2)
			{
				if (b == 0)
				{
				A++;
				}
				else
				{
				B++;
				}
			}
			else if (a == 1 && b != 1)
			{
				if (b == 0)
				{
				B++;
				}
				else
				{
				A++;
				}
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
		else
		{
			System.out.print("B");
		}
		return 0;
	}


}

