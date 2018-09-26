package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		while (scanf("%d%d%d%d%d%d", a, b, c, d, e, f) && a != 0)
		{
		h = 60 * 60 * (12 + d - a) + 60 * (e - b) + f - c;
		if (a == 0)
		{
		}
		else
		{
			System.out.printf("%d\n",h);
		}
		}
		return 0;
	}


}
