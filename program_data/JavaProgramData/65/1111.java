package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int aa = 0;
		int bb = 0;
		int pp = 0;
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
			if (a == b - 1 || a == b + 2)
			{
				aa = aa + 1;
			}
			else
			{
				if (a == b)
				{
					pp = pp + 1;
				}
				else
				{
					bb = bb + 1;
				}
			}
		}
		if (aa > bb)
		{
			System.out.print("A");
		}
		else
		{
			if (aa == bb)
			{
				System.out.print("Tie");
			}
			else
			{
				System.out.print("B");
			}
		}
		return 0;
	}

}

