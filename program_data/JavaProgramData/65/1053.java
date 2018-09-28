package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int av;
		int bv;
		av = 0;
		bv = 0;
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
		switch (a)
		{
		case 0:
			if (b == 1)
			{
			av++;
			}
			if (b == 2)
			{
			bv++;
			}
			break;
		case 1:
			if (b == 2)
			{
			av++;
			}
			if (b == 0)
			{
			bv++;
			}
			break;
		case 2:
			if (b == 0)
			{
			av++;
			}
			if (b == 1)
			{
			bv++;
			}
			break;
		}
		}
		if (av > bv)
		{
		System.out.print("A");
		}
		if (av == bv)
		{
		System.out.print("Tie");
		}
		if (av < bv)
		{
		System.out.print("B");
		}
		return 0;
	}

}

