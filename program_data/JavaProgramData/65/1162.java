package <missing>;

public class GlobalMembers
{
	public static int j(int a,int b)
	{
		if (a > b)
		{
			return -j(b, a);
		}
		if (b - a == 1)
		{
			return 1;
		}
		if (b == a)
		{
			return 0;
		}
		if (b - a == 2)
		{
			return -1;
		}
	}
	public static int Main()
	{
		int n;
		int s = 0;
		int i;
		int a;
		int b;
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
		s += j(a, b);
		}
		if (s < 0)
		{
			System.out.print("B");
		}
		else if (s == 0)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("A");
		}
		return 0;
	}


}

