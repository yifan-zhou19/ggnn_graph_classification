package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int c;
	public static int d;
	public static int e;
	public static int h;
	public static int i;
	public static int j;
	public static int k;
	public static int Main()
	{
		int cha = new int(int a,int b);
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
		System.out.printf("%d",cha(a, b));

		return 0;
	}

	public static int cha(int a,int b)
	{
		if (a == b)
		{
			return a;
		}
		int t;
		int q;
		if (a > b)
		{
			t = a;
			a = b;
			b = t;
		}
		q = b;
		while (a / 2 != 0)
		{

			while (q / 2 != 0)
			{

				if (a == q)
				{
					break;
				}
				q /= 2;
			}

			if (a == q)
			{
				break;
			}
			a /= 2;
			q = b;
		}
		return a;
	}
}

