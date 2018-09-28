package <missing>;

public class GlobalMembers
{
	public static int place(int a,int b)
	{

		if (a == 1 && b == 1)
		{
			return 1;
		}
		if (b == 0)
		{
			return 0;
		}
		if (a == 0)
		{
			return 1;
		}
		if (a >= 1 && b >= 1 && a >= b)
		{
		return place(a, b - 1) + place(a - b, b);
		}
		if (a >= 1 && b >= 1 && a < b)
		{
		return place(a, b - 1);
		}

	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int n;

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
		System.out.printf("%d\n",place(a, b));
		}

	}

}

