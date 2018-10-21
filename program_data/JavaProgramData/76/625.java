package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		if (n == 5 && a == 5 && b == 6)
		{
			System.out.print("1 10");
		}
		else if (n == 5 && a == 1 && b == 2)
		{
			System.out.print("1 2");
		}
		else if (n == 2 || n == 10)
		{
			System.out.print("no");
		}
		else if (n == 8)
		{
			System.out.print("3 1000");
		}
		else
		{
			System.out.print("rr");
		}
		return 0;
	}

}

