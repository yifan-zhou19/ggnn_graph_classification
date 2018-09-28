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
		int h;
		k = 0;
		h = 0;
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
				k = k;
				h = h;
			}
			if (a == 0 && b == 1)
			{
				k = k + 1;
			}
			if (a == 1 && b == 2)
			{
				k = k + 1;
			}
			if (a == 2 && b == 0)
			{
				k = k + 1;
			}
			if (a == 0 && b == 2)
			{
				h = h + 1;
			}
			if (a == 2 && b == 1)
			{
				h = h + 1;
			}
			if (a == 1 && b == 0)
			{
				h = h + 1;
			}
		}
		if (k > h)
		{
			System.out.print("A");
		}
		if (k < h)
		{
			System.out.print("B");
		}
		if (k == h)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

