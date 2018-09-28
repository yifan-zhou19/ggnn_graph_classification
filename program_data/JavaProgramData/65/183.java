package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			  k = 0;
			  t = 0;
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
			if ((a == 0 && b == 1) || (a == 2 && b == 0) || (a == 1 && b == 2))
			{
				k = k + 1;
			}
			else
			{
					  if ((b == 0 && a == 1) || (b == 2 && a == 0) || (b == 1 && a == 2))
					  {
					t = t + 1;
					  }
			}
		}
		if (k > t)
		{
			System.out.print("A");
		}
		else
		{
			if (k < t)
			{
				System.out.print("B");
			}
			else
			{
					System.out.print("Tie");
			}
		}
		return 0;
	}

}

