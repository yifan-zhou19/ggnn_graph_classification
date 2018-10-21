package <missing>;

public class GlobalMembers
{
	public static int turn(int a,int b)
	{
		int i;
		int k;
		if (a == b)
		{
			k = a;
		}
		if (a > b)
		{
			k = turn(a / 2, b);
		}
		if (a < b)
		{
			k = turn(a, b / 2);
		}
		return k;
	}
	public static void Main()
	{
		int a;
		int b;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d",turn(a, b));
	}
}

